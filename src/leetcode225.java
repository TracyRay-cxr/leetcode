import java.util.LinkedList;
import java.util.Queue;

public class leetcode225 {
    /*Queue<Integer> queue1;//��ջ�б���һ��
    Queue<Integer> queue2;//��������
    *//** Initialize your data structure here. *//*
    public leetcode225(){
        queue1=new LinkedList<>();
        queue2=new LinkedList<>();
    }

    *//** Push element x onto stack. *//*
    public void push(int x){
        queue2.offer(x);//�ȷŸ���������
        while(!queue1.isEmpty()){
            queue2.offer(queue1.poll());
        }
        Queue<Integer> queueTemp;
        queueTemp = queue1;
        queue1 = queue2;
        queue2 =queueTemp;//��󽻻���ַ
    }

    *//** Removes the element on top of the stack and returns that element. *//*
    public int pop(){
        return queue1.poll();
    }

    *//** Get the top element. *//*
    public int top(){
        return queue1.peek();
    }

    *//** Returns whether the stack is empty. *//*
    public boolean empty(){
        return  queue1.isEmpty();
    }*/
    /**��һ��queueģ��ջ*/
    Queue<Integer> queue;

    /** Initialize your data structure here. */
    public leetcode225(){
        queue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x){
        queue.offer(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop(){
        int size = queue.size();
        while (size-- > 1){
            queue.offer(queue.poll());
        }
        return queue.poll();
    }

    /** Get the top element. */
    public int top(){
        int size = queue.size();
        while (size-- > 1){
            queue.offer(queue.poll());
        }
        int res= queue.peek();
        queue.offer(queue.poll());//��ԭ����
        return res;//���ؽ��

    }
    /** Returns whether the stack is empty. */
    public boolean empty(){
        return  queue.isEmpty();
    }
}
