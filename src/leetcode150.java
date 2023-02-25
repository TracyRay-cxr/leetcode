import java.util.Deque;
import java.util.LinkedList;

public class leetcode150 {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<>();
        for (String token : tokens) {
            if ("+".equals(token)) {
                stack.push(stack.pop() + stack.pop());
            }//因为先进后出所以先出的是被减数
            else if ("-".equals(token)){
                stack.push(-stack.pop() + stack.pop());
            }else if ("*".equals(token)){
                stack.push(stack.pop() * stack.pop());
            }
            //因为先进后出所以先出的是被除数
            else if ("/".equals(token)){
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2/temp1);
            }else{
                stack.push(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }
}
