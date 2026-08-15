class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> subsets(int[] nums) {
       result = new ArrayList<>();
       List<Integer> temp = new ArrayList<>();
       solve(nums, 0, temp); 
       return result;
    }
    public void solve(int[] arr, int i, List<Integer> temp){
        int n = arr.length;
        if(i>=n){
            result.add(new ArrayList<>(temp));
            return;
        }
        temp.add(arr[i]);
        solve(arr, i+1, temp);
        temp.remove(temp.size()-1);
        solve(arr, i+1, temp);
    }
}