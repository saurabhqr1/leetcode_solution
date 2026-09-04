class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        if(n<4) return result;
        Arrays.sort(nums);
        for(int i = 0 ; i<n - 3 ; i++){
            int val = nums[i];
            if(i>0 && nums[i] == nums[i-1]) continue;
            threeSum(nums,i,n,target, result);
        }
        return result;
    }
    public void threeSum(int[] nums, int i, int n, int target, List<List<Integer>> result){
        for(int j = i+1 ; j< n - 2; j++){
            if(j>i+1 && nums[j] == nums[j-1]) continue;
            int k = n -1;
            int l = j+1;
            while(l<k){
                List<Integer> dummy = new ArrayList<>();
                long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                if(sum>target) k--;
                else if(sum<target) l++;
                else{
                    dummy.add(nums[i]);
                    dummy.add(nums[j]);
                    dummy.add(nums[l]);
                    dummy.add(nums[k]);
                    result.add(dummy);
                    l++;
                    k--;
                    while(l<k && nums[l] == nums[l-1]) l++;
                    while(l<k && nums[k] == nums[k+1]) k--;
                }
            }
        }
    }
}