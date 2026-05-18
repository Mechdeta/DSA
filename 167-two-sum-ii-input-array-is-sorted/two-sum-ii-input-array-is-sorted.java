class Solution {
    public int[] twoSum(int[] num, int target) {
        int s=0,e=num.length-1;
        while(s<e){
            int sum=num[s]+num[e];
            if(sum==target){
                return new int[] {s+1,e+1};
            }
            else if(sum>target){
                e--;
            }else s++;
        }
        return new int[]{0,1};
    }
}