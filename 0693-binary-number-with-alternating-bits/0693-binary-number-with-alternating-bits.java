class Solution {
    public boolean hasAlternatingBits(int n) {
        String binaryStr = Integer.toBinaryString(n);
        int end = binaryStr.length()-1;
        for(int i =0 ; i<binaryStr.length()-1;i++){
            if(binaryStr.charAt(i)==binaryStr.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
}