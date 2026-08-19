class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int t = n/2;
        for(int i = 0 ; i<n ; i++){
            int freq = 0;
            for(int j = 0 ; j<n ; j++){
                if(nums[i] == nums[j]) freq++;
            }
            if(freq > t) return nums[i];
        }
        return -1;
    }
}