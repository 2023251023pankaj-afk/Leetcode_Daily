class Solution {
    public int missingNumber(int[] nums) {
        int i = 0; 
        while(i<nums.length){
            int check = nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[check]){
                int temp = nums[i];
                nums[i] = nums[check];
                nums[check]=temp;
            }
            else{
                i++;
            }
        }
        for(int index = 0;index<nums.length;index++){
            if(nums[index]!=index){
                return index;
            }
        }
        return nums.length;
    }

}