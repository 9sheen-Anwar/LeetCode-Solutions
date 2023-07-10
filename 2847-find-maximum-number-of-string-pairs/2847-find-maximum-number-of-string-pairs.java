class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        StringBuilder s=new StringBuilder();
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
               
                s.append(words[j]);
               // s.reverse().toString();
                    if(words[i].equals(s.reverse().toString())){
                        count++;
                    }
                s.delete(0,s.length());
            }
            
        }
        return count;
        
    }
}