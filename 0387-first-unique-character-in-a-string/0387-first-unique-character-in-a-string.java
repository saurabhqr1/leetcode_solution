class Solution {
    public int firstUniqChar(String str) {
        int n = str.length();
        int[] freq = new int[26];
        for(int i = 0; i<n ; i++){
            char ch = str.charAt(i);
            int idx = ch - 'a';
            freq[idx]++;
        }

        int i = 0, j = str.length()-1;
        while(i <= j){
            char ch = str.charAt(i);
            int idx = ch - 'a';
            if(freq[idx] == 1){
                return i;
            }
            i++;
        }
        return -1;

    }
}
