class Solution {
    public int lengthOfLastWord(String s) {
        String s1 =s.trim();
        int count =0;
        if(s.length()<2){
            return 1;
        }
        for(int i = s1.length()-1;i>=0;i--){
            if((int)s1.charAt(i)== 32){
                break;
            }
            count++;
        }
        return count;
    }
}