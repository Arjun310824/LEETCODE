class Solution {
    public int rob(int[] nums) {
        int pre=0;
        int max=0;
        for(int i:nums){
            int temp=Math.max(max,pre+i);
            pre=max;
            max=temp;
        }
        return max;
        
    }
}