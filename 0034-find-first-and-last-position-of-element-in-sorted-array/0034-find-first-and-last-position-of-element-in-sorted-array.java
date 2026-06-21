class Solution {
    public int[] searchRange(int[] a, int target) {
        int low = 0, high = a.length-1;
        int value1 = -1, mid, value2 = -1;
        while(low<=high){
            mid = low + (high-low)/2;
            if(a[mid] == target){
                value1 = mid;
                high = mid -1;
            }
            else if(a[mid] > target){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        low = 0;
        high = a.length - 1;
        while(low<=high){
            mid = low + (high-low)/2;
            if(a[mid] == target){
                value2 = mid;
                low = mid +1;
            }
            else if(a[mid] > target){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return new int[]{value1,value2};
    }
}