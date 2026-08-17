class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(c==0){
                ans=nums[i];
            }
            
            if(nums[i]==ans){
                c++;
            }else{
                c--;
            }
        }  
        return ans; 
    }
}