import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        // int a1 = Integer.parseInt(a, 2);
        // int b1= Integer.parseInt(b, 2); 
        // int c = a1+b1;
        // String ans = Integer.toBinaryString(c);
        // return ans;
        BigInteger i = new BigInteger(a, 2); 
        BigInteger j = new BigInteger(b, 2);
         BigInteger sum = i.add(j);
      return sum.toString(2);

    }
}