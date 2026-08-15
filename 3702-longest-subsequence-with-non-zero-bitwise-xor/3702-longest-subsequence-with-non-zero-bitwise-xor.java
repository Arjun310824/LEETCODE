class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int ans=0;
        boolean b=true;
        for(int i:nums){
            ans^=i;
            if(i>0){
                b=false;
            }
        }
        if(ans>0){
            return n;
        }
        return b ? 0:n-1;
    }
}