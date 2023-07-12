class Solution {
    public int strStr(String haystack, String needle) {
        int left=0;
        int window=needle.length()-1;

        while(window<haystack.length()){
            if((haystack.substring(left,window+1)).equals(needle))
                return left;
            else{
                left++;
                window++;
            }
        }

        return -1;
        
    }
}