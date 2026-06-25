class Solution {
    public int[][] transpose(int[][] arr) {
        int r = arr.length;
    int c = arr[0].length;
    int[][] brr = new int[c][r];

        for(int i = 0 ; i < brr.length ; i++){
            for(int j = 0 ; j<brr[0].length ; j++){
                brr[i][j] = arr[j][i];
            }
        }
        return brr;
    }
}