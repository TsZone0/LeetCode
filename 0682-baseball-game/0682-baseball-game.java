import java.util.*;
class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> s1 = new Stack<>();
        

        for(int i= 0; i<operations.length; i++){
            if(operations[i].equals("C")){
                s1.pop();
            }
            else if(operations[i].equals("D")){
              s1.push(s1.peek()*2);
            }
            else if(operations[i].equals("+")){
                int top = s1.pop();
                int newtop = top + s1.peek();
                s1.push(top);
                s1.push(newtop);
            }else{
                s1.push(Integer.parseInt(operations[i]));
            }
        }
        int result = 0;
        while(!s1.isEmpty()){
            result = result+s1.pop();
        }

        return result;
    }
}