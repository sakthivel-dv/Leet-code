class Solution {
public:
    int divisorSubstrings(int num, int k) {
         int count = 0;
        string str = to_string(num);
        for (int i = 0; i <= str.length() - k; ++i) {
            string s = str.substr(i, k);

            if (stoi(s) != 0) {
                if (num % stoi(s) == 0) {
                    count += 1;
                }
            }
        }
        return count;  
    }
};