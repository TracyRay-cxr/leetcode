public class leetcode28 {

    public void getNext(int[] next,String s){
        //��ʼ��
        int j=-1;//��ʼ��ǰ׺��ĩβ,��0����һ��д��
        next[0]=j;//���ڵ�һ���ַ������ܴ������ǰ��׺�����Գ�ʼ��Ϊ-1����0

        //��ʼ����׺�Ŀ�ͷ
        for (int i=1;i<s.length();i++){//����һ���ַ�û�к�׺�����Դ������ַ��Ӵ���ʼ��Ҳ����i=1
            while(j>0&&s.charAt(i)!=s.charAt(j+1)){//ǰ��׺����ͬ�����
                j=next[j];//���˵���һ����ȵ�λ��
            }
            if (s.charAt(i)==s.charAt(j+1)){//ǰ��׺��ͬ�����
                j++;//������һ�Ӵ��ıȽ�
            }
            next[i]=j;//��ǰ�Ӵ�������ǰ��׺�ĳ��ȸ������Ӧ��Ԫ��
        }
    }
    public int strStr(String haystack,String needle){
        if (needle.length()==0){
            return 0;//ģʽ��Ϊ0���򷵻�0
        }
        int[] next=new int[needle.length()];
        getNext(next,needle);
        int j=-1;
        for (int i=0;i<haystack.length();i++){
            while(j>=0&&haystack.charAt(i)!=needle.charAt(j+1)){//Ŀ�괮��ģʽ����ƥ��
                j=next[j];//���˵�����ǰ��׺��ǰ׺�������ǰ׺�����׺
            }
            if (haystack.charAt(i)==needle.charAt(j+1)){//Ŀ�괮��ģʽ��ƥ��
                j++;//������һ���Ӵ���ƥ��
            }
            if (j==needle.length()-1){//Ŀ�괮��ģʽ����ȫƥ��
                return (i-needle.length()+1);//�򷵻��Ӵ��Ŀ�ʼ�±�
            }
        }
        return -1;//ʼ�ղ�ƥ�䷵��-1
    }
}
