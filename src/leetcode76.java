import java.util.HashMap;
import java.util.Map;

public class leetcode76 {
    public String minWindow(String s, String t) {
        int i=0;//������ʼλ��
        int j=0;//���ڽ���λ��
        int startstr=0;//���������Ĵ��ڵ���ʼλ��
        int result=Integer.MAX_VALUE;//���ս��
        Map<Character,Integer> map=new HashMap<>();//���t����ĸ����ַ��������ȶԴ������Ƿ����Ŀ���ַ�
        for (char c:t.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);//��Ź���
        }
       while(j<s.length()){//����s�ַ���
            char ch=s.charAt(j);//���浱ǰ�ַ�
            if (map.containsKey(ch)){//�ж��Ƿ���map��
                map.put(ch,map.getOrDefault(ch,0)-1);//������ڣ���ֵ���Լ�1
            }
            j++;//�����ƶ�����
           /**
            * ���´��ڣ�������С���ڣ�
            */
            while(check(map)){//�ж�map�е������ַ��Ƿ��Ѿ��ڴ�����
                int windowlen=j-i;//���浱ǰ���ڳ���
                if (windowlen<result){//�ж��Ƿ����ǰ��С�����Ӵ��Ĵ�С
                    result=windowlen;//ȡ��С��������С����
                    startstr=i;//��¼��һ�δ��ڵ���ʼλ�ã����֮��û�и�С�Ĵ��ڣ���ñ�����Ϊ�����ַ�������ʼλ��
                }

                /**
                 *    ������߽��ƶ�����С���ڣ�
                 *    ��СͬʱҪ������߽��Ƿ���Ŀ���ַ����Ƿ���Ҫ��map��������Ŀ���ַ��Ƴ����ڣ������ٱ����ڸ��ǣ�
                 */

                if (map.containsKey(s.charAt(i)))//�ж���߽��ֵ�Ƿ���map��
                    map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);//���ھ�������ʾ���ٸ��Ǹ�ֵ
                i++;//�����Ƿ��ٸ��ǣ���Ҫ��С��������һ������������ֵ
            }
        }
       if (result!=Integer.MAX_VALUE){//�ж��Ƿ�s�в�����t���Ӵ�
           return s.substring(startstr,startstr+result);//������С�����Ӵ�
       }
        return "";//���򷵻ؿմ�
    }
    public boolean check(Map<Character,Integer> map){//�жϴ����Ƿ񸲸���Ŀ���Ӵ�
        for (int val: map.values()) {//���� ֵ��
            if (val>0)//�����һ������0��˵��û�и��ǵ�ȫ���Ӵ�
                return false;//����false���ٽ��и���
        }
        return true;//���и��²���
    }
}
