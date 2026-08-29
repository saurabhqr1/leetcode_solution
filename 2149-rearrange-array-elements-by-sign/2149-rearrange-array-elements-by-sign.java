class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int i = 0;
        int j = 1;
        for(int ele : nums){
            if(ele>=0){
                result[i] = ele;
                i += 2;
            }
            else{
                result[j] = ele;
                j += 2;
            }
        }
        return result;
    }
}