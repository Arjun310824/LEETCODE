class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> ans=new HashMap<>();
        for(int i:nums1){
            for(int j:nums2){
                ans.put(i+j,ans.getOrDefault(i+j,0)+1);
            }
        }
        int count=0;
        for(int i:nums3){
            for(int j:nums4){
                count+=ans.getOrDefault(-(i+j),0);
            }
        }
        return count;
    }
}