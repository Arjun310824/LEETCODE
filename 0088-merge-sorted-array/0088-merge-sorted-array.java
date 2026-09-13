class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mid=m-1;
        int nid=n-1;
        int rigth=m+n-1;
        while(nid>=0){
            if(mid>=0 && nums1[mid]>nums2[nid]){
                nums1[rigth]=nums1[mid];
                mid--;
            }else{
                nums1[rigth]=nums2[nid];
                nid--;
            }
            rigth--;
        }
    }
}