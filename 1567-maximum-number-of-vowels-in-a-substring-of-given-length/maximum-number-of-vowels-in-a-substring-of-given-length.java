class Solution {
    public int maxVowels(String s, int k) {
       int count=0;
       int ans=0;
       String vowel="aeiou";
       for(int i=0;i<k;i++){
            if(vowel.contains(s.charAt(i)+""))count++;
       } 
       ans=count;
       for(int i=k;i<s.length();i++){
            if(vowel.contains(s.charAt(i)+"")){
                ans++;
            }if(vowel.contains(s.charAt(i-k)+"")){
                ans--;
            }
            count=Math.max(count,ans);
       }
       //if(count>k)return k;
       return count;
    }
}