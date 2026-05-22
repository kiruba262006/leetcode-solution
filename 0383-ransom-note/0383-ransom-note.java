class Solution {
    public boolean canConstruct(String ranson, String magazine) {
        int[] freq=new int[256];
        for(int i=0;i<magazine.length();i++){
            freq[magazine.charAt(i)-'a']++;
        }
   for(int i=0;i<ranson.length();i++){
    freq[ranson.charAt(i)-'a']--;
    if(freq[ranson.charAt(i)-'a']<0){
        return false;
    }
   }
   return true;
    }
}