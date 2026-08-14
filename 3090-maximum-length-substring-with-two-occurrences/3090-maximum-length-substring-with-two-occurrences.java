class Solution {
    public int maximumLengthSubstring(String s) {
        int l=0;
        int max=0;
        int[] ans=new int [26];
        for(int r=0;r<s.length();r++){
            ans[s.charAt(r)-'a']++;
            while(ans[s.charAt(r)-'a']>2){
                ans[s.charAt(l)-'a']--;
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}