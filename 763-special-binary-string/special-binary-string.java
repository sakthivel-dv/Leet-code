class Solution {
    public String makeLargestSpecial(String s) {
       
        List<String> results = new ArrayList<>();
        int count = 0; 
        int start = 0;
        
        for (int end = 0; end < s.length(); end++) {
            
            count += (s.charAt(end) == '1') ? 1 : -1;
            
            
            if (count == 0) {
               
                String innerPart = s.substring(start + 1, end);
                results.add("1" + makeLargestSpecial(innerPart) + "0");
                
                
                start = end + 1;
            }
        }
        
        
        Collections.sort(results, Collections.reverseOrder());
        
        
        return String.join("", results);
    }
}