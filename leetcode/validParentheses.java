class Solution {
    public boolean isValid(String s) {
        if(s.equals("")){
            return true;
        }
        Stack<Character> st = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(st.size() > 0 && ((st.peek() == '(' && c == ')') || (st.peek() == '{' && c == '}') || (st.peek() == '[' && c == ']'))){
                st.pop();
            }else{
                st.push(c);
            }
        }
        if(st.size() > 0){
            return false;
        }else{
            return true;
        }
    }
}