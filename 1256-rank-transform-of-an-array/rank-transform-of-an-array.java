class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int[] sort=Arrays.copyOf(arr,n);
        Arrays.sort(sort);
        int[] ans=new int[n];
        int j=1;
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<n;i++){
            if(i>0&&sort[i]>sort[i-1]){
                j++;
            }
            hash.put(sort[i],j);
        }
        for(int i=0;i<n;i++){
            ans[i]=hash.get(arr[i]);
        }
        return ans;
    }
}