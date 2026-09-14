class Solution {
    public String removeOuterParentheses(String s) {
        String result = new String("");
        int n = s.length();
        int count = 0;
        for(int i = 0; i<n; i++){
            if(s.charAt(i) == '(' ){
                if(count > 0){
                    result += s.charAt(i);
                }
                count++;
            }
            else{
                count--;
                if(count > 0){
                    result += s.charAt(i);
                }
            }
        }
        return result;
    }
   
}