import java.util.ArrayDeque;
import java.util.Stack;

public class leetcode1047 {
    //删除字符串中的所有相邻重复项
    public String removeDuplicates(String s) {
        //用栈实现
      /*
      //创建一个栈结构存放字符串并进行比较
        Stack<Character> stack = new Stack<>();
        //遍历字符串并与栈顶进行比较，相同就删除
        for (int i = 0;i<s.length();i++){
            //先比较再入栈或出栈
            //空栈直接入栈
            if (stack.isEmpty()){
                stack.push(s.charAt(i));
            }//如果当前字符与栈顶元素相同就弹出（模拟删除）
            else if (stack.peek()==s.charAt(i)){
                stack.pop();
            }//如果不相同直接入栈进行下一次比较
            else{
                stack.push(s.charAt(i));
            }
        }
        //经过循环处理后，栈里的字符相邻不相同
        //出栈构建字符串
        StringBuffer stringBuffer = new StringBuffer();
        while(!stack.isEmpty()){
            stringBuffer.append(stack.pop());
        }
        //反转字符串
        return stringBuffer.reverse().toString();

        */
        //用双端队列实现
        //ArrayDeque会比LinkedList在除了删除元素这一点外会快一点
        ArrayDeque<Character> deque = new ArrayDeque<>();
        char ch;
        for (int i =0;i <s.length();i++){
            ch = s.charAt(i);
            if (deque.isEmpty() || deque.peek() != ch){
                deque.push(ch);
            }else {
                deque.pop();
            }
        }
        //构造字符串
        String str = "";
        while (!deque.isEmpty()){
            str = deque.pop()+str;
        }
        return str;
    }
}
