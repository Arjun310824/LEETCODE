class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> ans=new HashMap<>();
        int j=0;
        int l=0;
        for(int i=0;i<nums.length;i++){
            ans.put(nums[i],ans.getOrDefault(nums[i],0)+1);
            while(ans.get(nums[i])>k){
                ans.put(nums[j],ans.get(nums[j])-1);
                j++;
            }
            l=Math.max(l,i-j+1);
        }
        return l;
        
    }
}