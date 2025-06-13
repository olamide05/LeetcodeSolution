class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String tmp : tokens){
            if(tmp.equals( "+")){
                stack.push(stack.pop()+stack.pop());

            }else if(tmp.equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b-a);
            }else if(tmp.equals("*")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b*a);
            }else if(tmp.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b/a);

            }else{
                stack.push(Integer.parseInt(tmp));
            }

        }
        return stack.pop();

    }
}
