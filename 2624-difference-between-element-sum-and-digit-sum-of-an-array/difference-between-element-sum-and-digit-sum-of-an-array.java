class Solution {
    public int differenceOfSum(int[] nums) {
      int sum = 0;
        for(int i : nums)
        {
            sum += i; 
        }

        int elementalSum = 0;
        for(int i : nums)
        {
            if(i < 10)
            {
                elementalSum += i;
            }
            else
            {
                while(i > 0)
                {
                    elementalSum += i % 10;
                    i /= 10;
                }
            }
        }
        return sum - elementalSum;   
    }
}