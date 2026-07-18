class Solution {
    public int findGCD(int[] nums) {
        int m=nums[0];
        int s=nums[0];
        for(int i:nums){
            m=Math.max(m,i);
            s=Math.min(s,i);
        }
        while(s!=0){
            int temp=s;
            s=m%s;
            m=temp;
        }
        return m;
    }
}