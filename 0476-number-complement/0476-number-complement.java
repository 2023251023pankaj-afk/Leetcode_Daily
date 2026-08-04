class Solution {
    public int findComplement(int num) {
    //     int ans = ~0;
    //     while(num &ans) mask <<=1
    //     return ~ans &~num;
    //  //    return ans ^ Integer.highestOneBit(ans);
    return ~num & ((Integer.highestOneBit(num) << 1) - 1);
}
    }
