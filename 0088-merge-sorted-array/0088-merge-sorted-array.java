class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,k=0;
        int result[]=new int [n+m];
        while(i<m &&j<n){
            if(nums1[i]<=nums2[j])
            {
                result[k]=nums1[i];
                i++;k++;
            }
            else{
               result[k]=nums2[j];
               j++;k++;
            }
    
        }
        while(i<m){
            result[k]=nums1[i];
            k++;i++;
        }

        while(j<n){
            result[k]=nums2[j];
            k++;j++;
        }
        for(int t=0;t<m+n;t++)
            nums1[t]=result[t];
        
        
    }
}