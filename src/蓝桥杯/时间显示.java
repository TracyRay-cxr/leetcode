package ¿∂«≈±≠;

import java.util.Scanner;

public class  ±º‰œ‘ æ {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        long time=scan.nextLong();
        int second= (int) (time/1000);
        String SS=second%60<10?"0"+second%60:""+second%60;
        int munite=second/60;
        String MM=munite%60<10?"0"+munite%60:""+munite%60;
        int hourse=munite/60;
        String HH=hourse%24<10?"0"+hourse%24:""+hourse%24;

        System.out.println(HH + ":" + MM + ":" + SS);
    }
}
