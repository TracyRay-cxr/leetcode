public class leetcode541 {
    public String reverseStr(String s, int k) {
        char[] ch=s.toCharArray();
        for(int i = 0; i<ch.length; i+=2*k){//ÿ��ѭ������2k��
            if (i+k<=s.length()){/**�����������Բ���=���������=����Ӧ��β=k���������reverse(ch,i,ch.length-1);����,
             ������ϵȺ���reverse(ch,i,i+k-1);���������������������ڽ�βʣk�������[i,i+k)��[i,ch.length)����������ȼ�
             */
                reverse(ch,i,i+k-1);//ÿ�η�תk��
                continue;//�����תֱ�������´�ѭ��������ִ�к���Ľ�β����
            }
            //��β����
            reverse(ch,i,ch.length-1);
        }
        return new String(ch);
    }
    //��ת����
    public void reverse(char[] ch,int a,int b){
        for (;a<b;a++,b--){
            ch[a]^=ch[b];
            ch[b]^=ch[a];
            ch[a]^=ch[b];
        }
    }
}
