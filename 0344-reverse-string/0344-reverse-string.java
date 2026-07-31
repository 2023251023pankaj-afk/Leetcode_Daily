class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        // if(s.length<2){
        //     return;
        // }
        Helper(s,start,end);
    }
    public void Helper(char[] s , int start, int end){
        char temp;
        while(start<end){
        temp = s[start];
        s[start]=s[end];
        s[end] = temp;
        start++;
        end--;
    }
    }
    
}