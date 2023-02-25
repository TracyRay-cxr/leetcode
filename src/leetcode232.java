import java.util.Stack;

public class leetcode232 {

    Stack<Integer> stackIn;
    Stack<Integer> stackOut;
    /** Initialize your data structure here. */
    public leetcode232() {
        stackIn = new Stack<>();//负责进栈
        stackOut = new Stack<>();//负责出栈
    }
    /** Push element x to the back of queue. */
    public void push(int x) {
        stackIn.push(x);
    }
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        dumpstackIn();
        return stackOut.pop();
    }
    /** Get the front element. */
    public int peek() {
        dumpstackIn();
        return stackOut.peek();
    }
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }
    //转存储栈，讲输入栈的内容转入输出栈
    public void dumpstackIn(){
        if (!stackOut.isEmpty()) return;
        while(!stackIn.isEmpty()){
            stackOut.push(stackIn.pop());
        }

    }
}
