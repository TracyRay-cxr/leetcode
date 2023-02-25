package À¶ÇÅ±­;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ë«ÏòÅÅÐò {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int optionTime=scan.nextInt();
        if (N<2){
            System.out.println(1);
        }
        int[][] option=new int[optionTime][2];
        Integer[] ans=new Integer[N];
        for (int m=0;m<N;m++){
            ans[m]=m+1;
        }
        for(int i=0;optionTime>i;i++){
            option[i][0]=scan.nextInt();
            option[i][1]=scan.nextInt();
        }
        for(int j=0;j<option.length;j++){
            if(option[j][0]==0){
                down(option[j][1],ans);
            }else {
                up(option[j][1],ans);
            }
        }
        for (int n=0;n< N-1;n++){
            System.out.print(ans[n]+" ");
        }
        System.out.print(ans[N-1]);

    }

    public static void down(int t, Integer[] ans){
        Arrays.sort(ans,0,t, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
    }
    public static void up(int t, Integer[] ans){
        Arrays.sort(ans,t-1,ans.length);
    }

}
