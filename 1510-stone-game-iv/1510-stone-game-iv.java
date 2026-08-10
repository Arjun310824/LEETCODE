class Solution {
    public boolean winnerSquareGame(int n) {
        boolean [] db=new boolean[n+1];
        for(int i=0;i<=n;i++){
            for(int j=1;j*j<=i;j++){
                if(!db[i-j*j]){
                    db[i]=true;
                    break;
                }
            }
        }
        return db[n];
    }
}