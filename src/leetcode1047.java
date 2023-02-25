import java.util.ArrayDeque;
import java.util.Stack;

public class leetcode1047 {
    //ɾ���ַ����е����������ظ���
    public String removeDuplicates(String s) {
        //��ջʵ��
      /*
      //����һ��ջ�ṹ����ַ��������бȽ�
        Stack<Character> stack = new Stack<>();
        //�����ַ�������ջ�����бȽϣ���ͬ��ɾ��
        for (int i = 0;i<s.length();i++){
            //�ȱȽ�����ջ���ջ
            //��ջֱ����ջ
            if (stack.isEmpty()){
                stack.push(s.charAt(i));
            }//�����ǰ�ַ���ջ��Ԫ����ͬ�͵�����ģ��ɾ����
            else if (stack.peek()==s.charAt(i)){
                stack.pop();
            }//�������ֱͬ����ջ������һ�αȽ�
            else{
                stack.push(s.charAt(i));
            }
        }
        //����ѭ�������ջ����ַ����ڲ���ͬ
        //��ջ�����ַ���
        StringBuffer stringBuffer = new StringBuffer();
        while(!stack.isEmpty()){
            stringBuffer.append(stack.pop());
        }
        //��ת�ַ���
        return stringBuffer.reverse().toString();

        */
        //��˫�˶���ʵ��
        //ArrayDeque���LinkedList�ڳ���ɾ��Ԫ����һ������һ��
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
        //�����ַ���
        String str = "";
        while (!deque.isEmpty()){
            str = deque.pop()+str;
        }
        return str;
    }
}
