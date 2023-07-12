class Solution {
    public int strStr(String haystack, String needle) {
        int left=0;
        int window=needle.length();

        while(window<=haystack.length()){
            if((haystack.substring(left,window)).equals(needle))
                return left;
            else{
                left++;
                window++;
            }
        }

        return -1;
        
    }
}