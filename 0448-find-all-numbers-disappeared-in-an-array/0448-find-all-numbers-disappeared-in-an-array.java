class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        int n = nums.length;
        int i = 0;
        while(i<n){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct] ) swap(nums, i, correct);
            else i++;
        }
        for(i = 0 ; i<n ; i++){
            if(nums[i] != i+1) arr.add(i+1);
        }
        return arr;
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}