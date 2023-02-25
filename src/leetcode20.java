import java.util.Stack;

public class leetcode20 {
    //��Ч����
    public boolean isValid(String s) {
        //����ַ�����Ϊż����һ����ƥ��
        if(s.length()%2!=0){
            return false;
        }
        //����һ��ջ�������ȷƥ�������
        Stack<Character> stack = new Stack<>();
        //�����ַ���������Ӧ�����ŷ���ջ��
        for (int i = 0;i<s.length();i++){
            //�����������ж��������͵�����
            if (s.charAt(i)=='('){
                stack.push(')');
            }else if(s.charAt(i)=='['){
                stack.push(']');
            }else if (s.charAt(i)=='{'){
                stack.push('}');
            }
            //1.�����������ж�ջ��Ԫ���Ƿ�һ�£���һ��ֱ�Ӳ�ƥ��
            //2.�ж�ջ���Ƿ�Ϊ�գ�Ϊ��֤������������������
            //�������пգ��ٽ���ջ��Ԫ�رȽϣ����������ջ
            else if (stack.isEmpty()||stack.peek()!=s.charAt(i)){
                return false;
            }
            else {
                stack.pop();
            }
        }
        //ѭ���������ַ����ж��Ƿ�ջ�գ�����֤�����������������ţ����Բ�ƥ��
        //Ϊ��֤����ȫƥ��
        return stack.isEmpty();
    }
}
