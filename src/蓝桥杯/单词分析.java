package ���ű�;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ���ʷ��� {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            //�ڴ��������Ĵ���...
            String target = scan.next();
            int[] a=new int[26];
           for (int i=0;i<target.length();i++){
               a[target.charAt(i)-'a']++;
           }
           char ch= 'a';
           int max = 0;
           for (int i= 0;i<a.length;i++){
               if (a[i]>max){
                   max=a[i];
                   ch=(char)(i+'a');
               }
           }
            System.out.println(ch);
            System.out.println(max);
            scan.close();
        }


}
