class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> L1 = new ArrayList<>();
        for(int i = 0; i<numRows ; i++){
            List<Integer> L2 = new ArrayList<>();
            for(int j = 0; j<=i ; j++){
               if(j==0 || j==i){
                L2.add(1);
               }
               else{
                 L2.add(L1.get(i-1).get(j-1) + L1.get(i-1).get(j));
               }
            }
            L1.add(L2);
        }
        return L1;
    }
}