class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> ans=new HashSet<>();
        for(int i:nums){
            ans.add(i);
        }
        int n=k;
        while(ans.contains(n)){
            n+=k;
        }
        return n;
    }
}