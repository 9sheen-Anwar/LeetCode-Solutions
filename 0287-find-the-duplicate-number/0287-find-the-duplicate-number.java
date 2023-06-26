class Solution {
    public int findDuplicate(int[] nums) {
        int len=nums.length;
        for(int i=0;i<len;i++){
            nums[nums[i]%len]+=len;

        if(nums[nums[i]%len]/len>=2)
            return nums[i]%len;
            
        }
       /*  for(int i=0;i<len;i++){
        if(nums[nums[i]%len]/len>=2)
                return nums[i]%len;
         }*/

        return -1;
        
    }
}