class Solution {
    public boolean isPalindrome(int x) {
        int k = x;
        int ans=0;
        if(x<0){
            return false;
        }

        while(x!=0){
            
            int d = x%10;
            ans = ans*10+d;
            x/=10;
        }
        if(k==ans){
            return true;
        }
        return false;
    }
}