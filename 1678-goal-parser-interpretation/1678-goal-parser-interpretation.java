class Solution {
    public String interpret(String command) {
        String s = command.replace("(al)","al");
        String ans = s.replace("()","o");
        return ans;
    }
}