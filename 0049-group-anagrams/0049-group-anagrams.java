class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0)
            return new ArrayList<>();//empty list
        Map<String, List<String>> mp=new HashMap<>();
        for(String s:strs){
            char[] temp=s.toCharArray();
            Arrays.sort(temp);
            String key=String.valueOf(temp);
            if(mp.containsKey(key))
                mp.get(key).add(s);
            else
                {
                    List<String> list=new ArrayList<>();
                    list.add(s);
                    mp.put(key,list);
                }
            
        }
        List<List<String>> result=new ArrayList<>();
        result.addAll(mp.values());
        return result;
        
    }
}