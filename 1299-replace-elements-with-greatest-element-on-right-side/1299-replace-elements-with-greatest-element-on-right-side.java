class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int num = -1;
        int k = n-1;
        for(int i = n-1 ; i>=0 ; i--){
            temp[i] = num;
            if(arr[i] >= num){
                num = arr[i];
            }
        }
        return temp;
    }
}