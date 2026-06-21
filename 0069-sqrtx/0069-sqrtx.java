class Solution {
    public int mySqrt(int n) {
        int low = 0, high = n, root =0;
        while(low<=high){
            int mid = low + (high - low)/2;
            if((long)mid*mid <= n){
                root = mid;
                low = mid + 1;
            }
            else if((long)mid*mid>n){
                high = mid - 1;
            }
        }
        return root;
    }
}