class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length + 1;
        int totalSum = (n*(n-1))/2;
        int sumArr = 0; 
        for(int i =0 ; i<n-1 ; i++){
            sumArr += nums[i];
        }
        return totalSum - sumArr;
    }
}