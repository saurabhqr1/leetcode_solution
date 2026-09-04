class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> L1 = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i<n -2 ; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int k = n-1;
            int j = i+1;
            while(j<k){
                List<Integer> L2 = new ArrayList<>();
                int sum = nums[i] + nums[j] + nums[k];
                if(sum>0) k--;
                else if(sum<0) j++;
                else{
                    L2.add(nums[i]);
                    L2.add(nums[j]);
                    L2.add(nums[k]);
                    L1.add(L2);
                    while(j<k && nums[j] == nums[j+1]) j++;
                    while(j<k && nums[k] == nums[k-1]) k--;
                    j++;
                    k--;
                }
            }
        }
        return L1;
    }
}