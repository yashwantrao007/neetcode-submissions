class Solution {
    public int evalRPN(String[] tokens) {

        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i<tokens.length; i++){
            if(tokens[i].equals("+")){
                stack.push(stack.pop()+stack.pop());
            }else if(tokens[i].equals("-")){
                int a = stack.pop();
                int b = stack.pop();

                stack.push(b-a);
            }else if(tokens[i].equals("*")){
                stack.push(stack.pop()*stack.pop());
            }else if(tokens[i].equals("/")){
                int c = stack.pop();
                int d = stack.pop();

                stack.push(d/c);
            }else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }

        return stack.pop();
        
    }
}
