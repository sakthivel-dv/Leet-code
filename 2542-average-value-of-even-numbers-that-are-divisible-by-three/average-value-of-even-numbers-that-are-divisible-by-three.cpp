class Solution {
public:
    int averageValue(vector<int>& nums) {
    int sum=0,count=0,avg=0;
    for(int i:nums){
        if(i%3==0&& i%2==0){
            sum+=i;
            count++;
        }
    } 
    if(count!=0)
    avg=sum/count;
    return avg;   
    }
};