class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        int[] arr = new int[n-k];
        for(int i=0 ; i<n-k ; i++){
            arr[i] = nums[i];
        }
        int j = 0;
        for(int i = n-k; i<n ; i++){
           nums[j++] = nums[i]; 
        }
        for(int i = 0 ; i<n-k ; i++){
            nums[j++] = arr[i];
        }

    }
}