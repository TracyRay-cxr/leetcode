import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class leetcode844 {

        public static boolean backspaceCompare(String s, String t) {
            int i = s.length() - 1;//ָ��1�������ַ���s
            int j = t.length() - 1;//ָ��1�������ַ���t
            int skipS = 0;//ָ��2����¼�˸�#
            int skipT = 0;//ָ��2����¼�˸�#
            while (i >= 0 || j >= 0) {//�����ѭ������ѭ�������ж������ַ�����Ч�ַ��Ƿ����
                while (i >= 0) {//Сѭ���������ַ���s��ͨ��˫ָ���ҵ���Ч�ַ����������ѭ������һ��ָ��
                    if (s.charAt(i) == '#') {//��¼�˸���������ǰ����
                        skipS++;
                        i--;
                    } else if (skipS > 0) {//������˸���������ַ�����Ч�ַ�ֱ����ǰ����
                        skipS--;
                        i--;
                    } else break;//�ҵ���Ч�ַ����˳�Сѭ��
                }
                while(j>=0){//ͬ��
                    if (t.charAt(j)=='#'){
                        skipT++;
                        j--;
                    }else if (skipT>0){
                        skipT--;
                        j--;
                    }else break;
                }
                if (i>=0&&j>=0){//�����ַ������Ϸ�Сѭ���п����±�Խ�磬�ڲ�Խ���������е��ַ�
                    if (s.charAt(i)!=t.charAt(j)){//����һ������ȵļ����������
                        return false;
                    }
                }else{//�±�Խ�磬��������ַ���ͬʱԽ�磬�������������ȴ���һ��ѭ������������
                    if (i>=0||j>=0){//һ���ַ���û�б��������һ���ַ��������꣬˵�����ȳ���Ҳ�Ͳ����
                        return false;
                    }
                }
                i--;//���������Ч�ַ������ǰ����
                j--;//ͬ��
            }
            return true;
        }
     public static void main(String[] args) {
         leetcode844 leet=new leetcode844();
         System.out.println(    leet.backspaceCompare("bbbextm","bbb#extm"));

        }
}
