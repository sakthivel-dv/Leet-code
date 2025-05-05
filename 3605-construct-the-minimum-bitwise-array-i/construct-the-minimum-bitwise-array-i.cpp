class Solution {
public:
    vector<int> minBitwiseArray(vector<int>& nums) {
      std::vector<int> result;
        
        for (int num : nums) {
            result.push_back(helper(num));
        }
        
        return result;
    }
    
private:
    int helper(int num) {
        if (num % 4 == 1) {  
            return num - 1;
        }
        
        if (num % 4 == 3) {  
            int tmp = num;
            for (int i = 0; i < (int)log2(num) + 1; ++i) {
                tmp /= 2;
                if (tmp % 2 == 0) {
                    return num - (1 << i);
                }
            }
        }

        return -1;  
    }
};