class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       StringBuilder str = new StringBuilder();
       StringBuilder str1 = new StringBuilder();
             for(int i = 0; i<word1.length;i++){
                 str.append(word1[i]);
             }
        //      str.toString();
        // //    System.out.println(str);
           for (int j = 0; j < word2.length; j++) {
               str1.append(word2[j]);
           }
        //    str1.toString();
        // //    System.out.println(str1);

           return str.toString().equals(str1.toString());
           
    }
}