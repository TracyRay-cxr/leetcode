package À¶ÇÅ±­;

import java.util.Scanner;

public class Ãİ´Î·½ {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
        returnMi(n,0);


    }
    public static void returnMi(int n,int r){
        if (n==1){
//            System.out.print("2("+r+")");
            if (r==0){
                System.out.print("2("+0+")");
            }else if (r==1){
                System.out.print("2");
            }
            else if (r==2){
                System.out.print("2("+2+")");
            }
            else {
                System.out.print("2(");
                returnMi(r,0);
                System.out.print(")");
            }
            return;
        }
        returnMi(n/2,r+1);
        if (n%2==1){
            if (r==0){
                System.out.print("+2("+0+")");
            }else if (r==1){
                System.out.print("+2");
            }
            else if (r==2){
                System.out.print("+2("+2+")");
            }
            else {
                System.out.print("+2(");
                returnMi(r,0);
                System.out.print(")");
            }
        }
//        int i=0;
//        if (n%2==1){
//            n+=1;
//        }
//        while(n!=0){
//            n=n/2;
//            i++;
//        }
//        returnMi(i-1,0);
//        sb=""+i;
//        int one=1;
//        for (int j=i;j>0;j--){
//            one*=2;
//        }
//        yu=n-one;
//        returnMi(yu,0);
    }
}
