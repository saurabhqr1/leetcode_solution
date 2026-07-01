class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0, n = nums.length;
        while(i<n){
            if(nums[i]<=0) i++;
            else if(nums[i]>n) i++;
            else if(nums[i] == i+1) i++;
            else if(nums[i] == nums[nums[i] -1]) i++;
            else swap(nums, i, nums[i] - 1);
        }
        for(i=0 ; i<n ; i++){
            if(nums[i] != i+1) return i+1;
        }
        return n+1;
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}