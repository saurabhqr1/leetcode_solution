class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        if(n%2 == 1) return false;
        for(int i = 0; i<n ; i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{') st.push(ch);
            else{
                if(st.size() == 0) return false;
                char top = st.peek();
                if((top == '(' && ch == ')') ||
                (top == '{' && ch == '}') ||
                (top == '[' && ch == ']'))
                st.pop();
                else return false;
            }
        }
        return (st.size() == 0);
    }
}