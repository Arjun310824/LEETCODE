class Solution {
    public int fib(int n) {
        int first=0;
        int second=1;
        if(n==0 || n==1){
            return n;
        }else{
            for(int i=2;i<=n;i++){
                int ans=first+second;
                first=second;
                second=ans;
            }
            return second;
        }
    }
}