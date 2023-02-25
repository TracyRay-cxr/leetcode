import java.util.Stack;

public class leetcode232 {

    Stack<Integer> stackIn;
    Stack<Integer> stackOut;
    /** Initialize your data structure here. */
    public leetcode232() {
        stackIn = new Stack<>();//�����ջ
        stackOut = new Stack<>();//�����ջ
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
    //ת�洢ջ��������ջ������ת�����ջ
    public void dumpstackIn(){
        if (!stackOut.isEmpty()) return;
        while(!stackIn.isEmpty()){
            stackOut.push(stackIn.pop());
        }

    }
}
