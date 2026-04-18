class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int low=0,high=n-1;
        int max=0;
        while(low<=high){
            int mid=(low+high)/2;
            int curr=maxele(mat,mid);
            int left=0,right=0;
            if(mid-1<0){
                left=-1;
            }else left=mat[curr][mid-1];
            if(mid+1>=n){
                right=-1;
            }else right=mat[curr][mid+1];
            if(mat[curr][mid]>left&&mat[curr][mid]>right)return new int[] {curr,mid};
            if(left>mat[curr][mid])high=mid-1;
            else low=mid+1;
        }
        return new int[]{0,0};
    }
    int maxele(int[][] mat,int mid){
        int ans=0,ind=0,m=mat.length;
        for(int i=0;i<m;i++){
            if(mat[i][mid]>ans){
                ans=mat[i][mid];
                ind=i;
            }
        }
        return ind;
    }
}