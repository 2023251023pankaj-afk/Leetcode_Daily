class Solution {
       public boolean isPowerOfTwo(int n) {
        if(n<0){
            return false;
        }
        String str = Integer.toBinaryString(n);
        int count = 0;
        for(int i= 0; i< str.length();i++){
            if(str.charAt(i)=='1'){
                count++;

            }

        }
        System.out.println(count);
        if(count<2&& count>0){
            return true;
        }
        return false;
    }
}