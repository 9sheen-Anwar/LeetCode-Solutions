class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] temp=new int[n+m];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                temp[k]=nums1[i];
                i++;
                k++;
            }
            else{
                temp[k]=nums2[j];
                j++;
                k++;
            }
        }
            while(i<m){
                temp[k]=nums1[i];
                i++;k++;
            }
        
            while(j<n){
                temp[k]=nums2[j];
                j++;k++;
            }
        int len=temp.length;
        int median=(0+len-1)/2;
    
        if(len%2==0)
            return (temp[median]+temp[median+1])/2f;
        
        else
            return temp[median];
        
    




        
    }
}