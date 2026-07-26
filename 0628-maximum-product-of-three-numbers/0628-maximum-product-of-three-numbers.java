class Solution {
    public int maximumProduct(int[] nums) {
        int a=-1001,b=a,c=b;
        int x=1001,y=x;
        for(int i:nums){
            if(i>a){
                c=b;
                b=a;
                a=i;
            }else if(i>b){
                c=b;
                b=i;
            }else if(i>c){
                c=i;
            }
            if(i<x){
                y=x;
                x=i;
            }else if(i<y){
                y=i;
            }
        }
        return Math.max(a*b*c,a*x*y);
    }
}