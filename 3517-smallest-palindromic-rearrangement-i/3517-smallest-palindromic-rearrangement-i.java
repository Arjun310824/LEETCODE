class Solution {
    public String smallestPalindrome(String s) {
        int[] freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        StringBuilder left=new StringBuilder();
        String middel="";
        for(int i=0;i<26;i++){
            for(int j=0;j<freq[i]/2;j++){
                left.append((char)(i+'a'));
            }
            if(freq[i]%2==1){
                middel=String.valueOf((char)(i+'a'));
            }
        }
        String rigth=new StringBuilder(left).reverse().toString();

        return left+middel+rigth;
    }
}