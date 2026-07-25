class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i<n ; i++){
            char ch = s.charAt(i);
            if(st.size() == 0) st.push(ch);
            else{
                char top = st.peek();
                if(ch != top) st.push(ch);
                else st.pop();
            }

        }
        while(!st.isEmpty()){
            sb.insert(0,st.pop());

        }
        String result = sb.toString();
        return result;
    }
}