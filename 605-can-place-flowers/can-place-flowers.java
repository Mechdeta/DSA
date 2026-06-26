class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        for(int i=0;i<f.length;i++){
            if(f[i]==0){
                int l=(i==0)?0:f[i-1];
                int r=(i==f.length-1)?0:f[i+1];
                if(l==r&&r==0){
                    f[i]=1;
                    n--;
                    if(n<=0)return true;
                }
            }
        }
        if(n<=0)return true;
        return false;
    }
}