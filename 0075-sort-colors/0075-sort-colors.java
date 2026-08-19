class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        int low = 0, mid = 0, high = n-1;
        while(mid<=high){
            if(arr[mid] == 0){
                swap(arr, low, mid);
                mid++;
                low++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                swap(arr, mid, high);
                    high--;
                }
            }
        }
    public void swap(int[] arr, int m, int n){
        int temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;
    }
}