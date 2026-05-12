class Solution {
    public boolean isSubsequence(String s, String t) {
        int j =0;
        char tempArray[] = s.toCharArray();
        
        for(int i=0;i<t.length() && j<tempArray.length;i++)
        {
            if( tempArray[j]==t.charAt(i))
            {
                j++;
            }
        }
        return (j==tempArray.length);
    }
}