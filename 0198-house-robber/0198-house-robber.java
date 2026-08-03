class Solution {
    public int rob(int[] nums) {
       int prv1 = 0;
       int prv2 = 0;
       for(int num : nums){
        int curr = Math.max(prv1,prv2 + num);
        prv2 = prv1;
        prv1 = curr;
       }
       return prv1;
    }
}