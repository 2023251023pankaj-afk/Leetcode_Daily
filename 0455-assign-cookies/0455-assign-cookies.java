class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
         int c = 0;
         int i =0;
         while(i<s.length && c<g.length){
            if(s[i]>=g[c]){
                c++;
            }
            i++;
         }
       return c;
    }
}