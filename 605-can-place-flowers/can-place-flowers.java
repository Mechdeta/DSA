class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int m) {
        int n=flowerbed.length;
        int avl=0;
        for(int i=0;i<n;i++){
            int left=0,right=0;
            if(flowerbed[i]==0){
            if(i>0&&i<n-1){
                left=flowerbed[i-1];
                right=flowerbed[i+1];
            }
            if(i==0&&n>1)right=flowerbed[i+1];
            if(i==n-1&&n>1)left=flowerbed[i-1];
            if(left==0&&right==0){
                m--;
                flowerbed[i]=1;
            }
            }
            
        }
        return m<=0;
    }
}