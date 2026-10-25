class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        //int open=0,close=0;

        StringBuilder ans=new StringBuilder();

        recur(0,0,n,list,ans);
        return list;
    }
    void recur(int open,int close,int n,List<String> list,StringBuilder ans){
            if(open==n&&close==n){
                list.add(ans.toString());
                //return;
            }
            if(open<n){
                int len=ans.length();
                ans.append("(");
                recur(open+1,close,n,list,ans);
                ans.setLength(len);
            }
             if(close<open){
                int leng=ans.length();
                ans.append(")");
                recur(open,close+1,n,list,ans);
                ans.setLength(leng);
            }
        }
}