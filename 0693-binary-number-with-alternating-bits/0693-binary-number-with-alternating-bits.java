class Solution {
    public boolean hasAlternatingBits(int n) {
        String binaryStr = Integer.toBinaryString(n); // convert int into bit String
        int end = binaryStr.length()-1;
        for(int i =0 ; i<end;i++){
            if(binaryStr.charAt(i)==binaryStr.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
}