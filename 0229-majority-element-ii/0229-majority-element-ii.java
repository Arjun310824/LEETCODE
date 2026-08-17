class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> ans=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            ans.put(nums[i],ans.getOrDefault(nums[i],0)+1);
        }
        List<Integer> l=new ArrayList<>();
        int m=nums.length/3;

        for(Map.Entry<Integer,Integer> entry:ans.entrySet()){
            if(entry.getValue()>m){
                l.add(entry.getKey());
            }
        }
        return l;
    }
}