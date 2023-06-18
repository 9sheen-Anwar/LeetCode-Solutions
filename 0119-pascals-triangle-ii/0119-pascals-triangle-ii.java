class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> listrow=null, pre=null;
        for(int i=0;i<=rowIndex;i++){
            listrow= new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i)
                    listrow.add(1);
                else
                    listrow.add(pre.get(j-1)+pre.get(j));
            }
            pre=listrow;

        }
        return listrow;
        
    }
}