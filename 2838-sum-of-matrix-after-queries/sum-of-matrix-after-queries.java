class Solution {
    public long matrixSumQueries(int n, int[][] queries) {
        boolean[] row=new boolean[n];
        boolean[] col=new boolean[n];

        int fillr=0,fillc=0;
        long sum=0;

        for(int i=queries.length-1;i>=0;i--){
            int type=queries[i][0];
            int index=queries[i][1];
            int val=queries[i][2];

            if(type==0){

                if(!row[index]){
                    sum+=(long)(n-fillc)*val;
                    fillr++;
                    row[index]=true;
                }
            }
            else{
                if(!col[index]){

                    sum+=(long)(n-fillr)*val;
                    col[index]=true;
                    fillc++;
                }
            }
            
        }
        return sum;
    }
}