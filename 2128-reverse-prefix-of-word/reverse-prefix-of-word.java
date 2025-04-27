class Solution {
    public String reversePrefix(String word, char ch) {
      int j=-1;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i) == ch)
            {
                j=i;
                break;
            }
        }
        return new StringBuilder(word.substring(0,j+1)).reverse().append(word.substring(j+1)).toString();
   
    }
}