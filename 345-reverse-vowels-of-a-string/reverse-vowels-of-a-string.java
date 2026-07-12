class Solution {
    public String reverseVowels(String s) {
        String vowel="AEIOUaeiou";
        int n=s.length();
        List<Character> list=new ArrayList<>(); 
        int[] arr=new int[n];
        Arrays.fill(arr,0);
        for(int i=0;i<n;i++){
            if(vowel.contains(""+s.charAt(i))){
                arr[i]=1;
                list.add(s.charAt(i)); 
            }
              
        }
        Collections.reverse(list);
        int j=0;
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                sb.setCharAt(i,list.get(j++));
            }
        }
        return sb.toString();
    }
}