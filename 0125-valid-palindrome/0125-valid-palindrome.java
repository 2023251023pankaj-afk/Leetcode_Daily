class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        String l= s.toLowerCase();
        System.out.println(l);
        if(s.length()<2){
            return true;
        }
        for(int i=0;i<s.length();i++){
            if((l.charAt(i)>='a' && l.charAt(i)<='z') || (l.charAt(i)>= '0' &&  l.charAt(i)<='9')){
                str.append(l.charAt(i));
            }
        }
        String p = str.toString();
        String b=str.reverse().toString();
        return p.equals(b);
    }
}