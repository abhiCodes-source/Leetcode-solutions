class Solution {
    public int evalRPN(String[] tokens) {
        int n=tokens.length;
        Stack<Integer>st =new Stack<>();
        for(int i=0;i<n;i++){
            if(tokens[i].equals("+")){
                int op1=st.pop();
                int op2=st.pop();
                st.push(op1+op2);
            }
            else if(tokens[i].equals("-")){
                int op1=st.pop();
                int op2=st.pop();
                st.push(op2-op1);
            }            
            else if(tokens[i].equals("*")){
                int op1=st.pop();
                int op2=st.pop();
                st.push(op1*op2);
            }
            else if(tokens[i].equals("/")){
                int op1=st.pop();
                int op2=st.pop();
                st.push(op2/op1);
            }
            else{
                st.push(Integer.valueOf(tokens[i]));
            }      
        }
        return st.peek();
    }
}