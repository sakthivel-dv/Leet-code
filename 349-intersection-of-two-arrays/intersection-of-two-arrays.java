class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> firstSet = new HashSet<>();

        
        for(int val : nums1){
            firstSet.add(val);
        }

        
        Set<Integer> uniqueSet = new HashSet<>();
        for(int val: nums2){

            if(firstSet.contains(val))
               uniqueSet.add(val);
        }
        
        int[] result = new int[uniqueSet.size()];
        int i = 0;
        
        for(int val : uniqueSet){
            result[i++] = val;
        }
        
        return result;
    }
}