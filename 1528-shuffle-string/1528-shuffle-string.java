class Solution {
    public String restoreString(String s, int[] indices) {
        char [] str = s.toCharArray();
        StringBuilder ans = new StringBuilder ();
        for(int i = 0;i< s.length();i++){
            str[indices[i]] = s.charAt(i);
        }
         ans.append(str); 
        return ans.toString();
    }
}