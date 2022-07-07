public class leetcode202 {
    public boolean isHappy(int n) {
        int fast=n;//��ָ��
        int slow=n;//��ָ��
       do{
            slow=getNext(slow);//��ָ��һ����һ��
            fast=getNext(fast);//��ָ��һ��������
            fast=getNext(fast);
        }while(fast!=slow);//Ҫ����һ�����жϣ���Ȼ��ͷ����ͷָ��
        return slow==1;//�ж��Ƿ�ָ��1��Ҫô1��Ҫô�Ǹ���

    }

    /**
     * ͨ���˺���ʵ����������������ת��Ϊ�����Ƿ��л����л���������1����һֱѭ����
     * @param n
     * @return
     */
    public int getNext(int n){
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=d*d;
            n=n/10;
        }
        return sum;
    }
}
