package ���ű�;

import java.util.Scanner;

public class ��������� {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for (int k=17;k>=0;k--){
            int head=2*k;//ÿ����С��Ч��
            int tail=Math.max(n,head);//ÿ�������Ч��
            int r=-1;
            while(head<=tail){//���ֲ��ң���Ϊ����������������
                int mid=(head+tail)>>1;
                if(combination(mid,k,n)>=n){//�м�ֵ�Ƿ���ڵ���Ŀ��ֵ��������
                    tail=mid-1;//�����
                    r=mid;//��¼��һ��mid
                }else {
                    head=mid+1;
                }
            }
            if (combination(r,k,n)==n){//�ж��Ƿ��ҵ�
                System.out.println((long) (r + 1) * r / 2 + k + 1);
                break;
            }
        }
        scan.close();
    }
    static long gcd(long a,long b){
        return b==0?a:gcd(b,a%b);
    }
    //���������C(k,n)16
    public static long combination(long n,long k,long target){
        long up=1,down=1;
        if (k>n/2){
            k=n-k;
        }
        //���������ʽ
        for(int i=1;i<=k;i++){
            up*=n-i+1;
            down*=i;
            long g=gcd(up,down);//�����Լ��������
            up/=g;
            down/=g;
            if (up/down>target){//�ж��Ƿ���Լ�֦
                return up/down;
            }
        }
        return up/down;//��
    }

}
