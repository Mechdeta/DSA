class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        int[] v=new int[arr.length];
        int count=1,j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]){
                count++;
            }else{
                v[j++]=count;
                count=1;
            }
        }
        v[j++]=count;
        Arrays.sort(v,0,j);
        for(int i=1;i<j;i++){
            if(v[i-1]==v[i])return false;
        }
        return true;
    }
}