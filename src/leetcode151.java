public class leetcode151 {
    public String reverseWords(String s) {
        if(s==null||s.length()==0){
            return s;
        }
        //ȥ������ո�
        char[] ch=s.toCharArray();
        //˫ָ��ԭ��ɾ��
        int right=0;
        int left=0;
//        for (;right<ch.length;){
//            if (ch[right]==' ') {
//                while(ch[right - 1] == ch[right]){
//                    right++;
//                }
//            }
//            if (right==left){
//                continue;
//            }
//            ch[left++]=ch[right++];
//        }
        for (;right<ch.length;right++){
            if (ch[right]!=' '){//�����ǿո���д���
                if(left!=0)ch[left++]=' ';//��left�Ƿ�Ϊ��ʼλ�ã���������ÿ�ν�������һ��λ�ò���ֵ�� ��;
                while(right<ch.length&&ch[right]!=' '){//��rightλ�õ�Ŀ�굥��ͨ��ѭ���ƶ���leftλ��,ֱ�������ո�
                                                        // ˵��һ�������ƶ���ɣ�������һ����ѭ����Ѱ����һ������
                    ch[left++]=ch[right++];
                }

            }
        }

        //���������鸴�Ƶ�leftΪֹ
        char[] chcp=new char[left];
        for (int i=0;i<left;i++){
            chcp[i]=ch[i];
        }
        //��תɾ������ո��������ַ���
        swap(chcp,0,chcp.length-1);
        //Ȼ���ٶ�ÿ�����ʷ�ת
        right=0;
        left=0;
//        while(left<right){
//            while(chcp[right]!=' '&&right<chcp.length){
//                right++;
//            }
//            //����rigthһ����Խ��1λ,��Ϊ���һ��Ԫ��һ�����ǿո�,right++�ͻ�=length
//            if (right>=chcp.length){
//                break;
//            }
//            swap(chcp,left,right);
//            left=right+2;
//            right=left;
//        }

        //��ÿ�����ʷ�ת
        for (;right<=chcp.length;right++){//�������һ�����ʺ���û�пո�����Ҫ�ڽ�β+1�ĵط�����
            if (right==chcp.length||chcp[right]==' '){//ÿ�������� ����Խ��ʱ����left��right-1֮��ģ�right��ʱһ��ʱ�� ����Խ�磩���ʽ��н���������ұգ�
                swap(chcp,left,right-1);
                left=right+1;//����һ�����ʣ�����ʼλ�û�����һ������ͷ��Ҳ���ǡ� ���ĺ��棩
            }
        }

        return new String(chcp);
    }
    //������ch��a��b���з�ת
    public void swap(char[] ch,int a,int b){
            for (;a<b;a++,b--){
                ch[a]^=ch[b];
                ch[b]^=ch[a];
                ch[a]^=ch[b];
            }
    }
}
