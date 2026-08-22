class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int temp=n;
        int product=1;
        while(n>0){
            int r=n%10;
            sum=sum+r;
            product*=r;
            n=n/10;
        }
        if(temp%(sum+product)==0) return true;
        return false;
    }
}