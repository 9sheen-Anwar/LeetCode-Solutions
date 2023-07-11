class Solution {
    public int lengthOfLastWord(String s) {

        String[] str=s.split(" ");
        int ans=str[str.length-1].length(); 
       return ans;
        
    }
}