import java.util.Stack;

public class leetcode20 {
    //有效括号
    public boolean isValid(String s) {
        //如果字符串不为偶数个一定不匹配
        if(s.length()%2!=0){
            return false;
        }
        //创建一个栈来存放正确匹配的括号
        Stack<Character> stack = new Stack<>();
        //遍历字符串，将对应的括号放入栈里
        for (int i = 0;i<s.length();i++){
            //遇到左括号判断那种类型的括号
            if (s.charAt(i)=='('){
                stack.push(')');
            }else if(s.charAt(i)=='['){
                stack.push(']');
            }else if (s.charAt(i)=='{'){
                stack.push('}');
            }
            //1.遇到右括号判断栈顶元素是否一致，不一致直接不匹配
            //2.判断栈顶是否为空，为空证明左括号少于右括号
            //这里先判空，再进行栈顶元素比较，避免操作空栈
            else if (stack.isEmpty()||stack.peek()!=s.charAt(i)){
                return false;
            }
            else {
                stack.pop();
            }
        }
        //循环遍历完字符串判断是否栈空，不空证明右括号少于左括号，所以不匹配
        //为空证明完全匹配
        return stack.isEmpty();
    }
}
