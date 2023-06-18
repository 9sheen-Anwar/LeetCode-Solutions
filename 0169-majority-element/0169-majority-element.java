class Solution {
    public int majorityElement(int[] nums) {
        int k=0,maj=0;
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i]))
                hm.put(nums[i],hm.get(nums[i])+1);
            else
                hm.put(nums[i],1);
            //or replace it with map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer,Integer> entry : hm.entrySet()) 
        {
            if((entry.getValue())>maj){
                maj=entry.getValue();
                k=entry.getKey();
            }
        }
        return k;


        
    }
}