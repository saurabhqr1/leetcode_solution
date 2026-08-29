class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> temp1 = new ArrayList<>();
        ArrayList<Integer> temp2 = new ArrayList<>();
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i] >= 0) temp1.add(nums[i]);
            else temp2.add(nums[i]);
        }
        if(temp1.size() == 0 || temp2.size() == 0 ) return nums;
        int m = 0;
        int n = 0;
        for(int i = 0 ; i<nums.length ; i++){
            if(i%2 == 0) nums[i] = temp1.get(m++);
            else nums[i] = temp2.get(n++);
        }
        return nums;
    }
}