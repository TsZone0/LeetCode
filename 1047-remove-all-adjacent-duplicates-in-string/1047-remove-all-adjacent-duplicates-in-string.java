class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder str = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(!stack.isEmpty()&& stack.peek()==s.charAt(i)){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));

            }
        }
        while(!stack.isEmpty()){
            str.append(stack.peek());
            stack.pop();
        }
        String reversed = new StringBuilder(str).reverse().toString();
        return reversed;
    }
}