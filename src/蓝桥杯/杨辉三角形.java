package 蓝桥杯;

import java.util.Scanner;

public class 杨辉三角形 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for (int k=17;k>=0;k--){
            int head=2*k;//每列最小有效行
            int tail=Math.max(n,head);//每列最大有效行
            int r=-1;
            while(head<=tail){//二分查找（因为随行数单调递增）
                int mid=(head+tail)>>1;
                if(combination(mid,k,n)>=n){//中间值是否大于等于目标值（缩区）
                    tail=mid-1;//最大行
                    r=mid;//记录上一个mid
                }else {
                    head=mid+1;
                }
            }
            if (combination(r,k,n)==n){//判断是否找到
                System.out.println((long) (r + 1) * r / 2 + k + 1);
                break;
            }
        }
        scan.close();
    }
    static long gcd(long a,long b){
        return b==0?a:gcd(b,a%b);
    }
    //运算组合数C(k,n)16
    public static long combination(long n,long k,long target){
        long up=1,down=1;
        if (k>n/2){
            k=n-k;
        }
        //求组合数公式
        for(int i=1;i<=k;i++){
            up*=n-i+1;
            down*=i;
            long g=gcd(up,down);//求最大公约数，化简
            up/=g;
            down/=g;
            if (up/down>target){//判断是否可以剪枝
                return up/down;
            }
        }
        return up/down;//？
    }

}
