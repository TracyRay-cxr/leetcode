package À¶ÇÅ±­;

import java.util.HashSet;

public class ÈıÁ¬»÷ {
    public static void main(String[] args) {
        int[] num = new int[]{1,2,3,4,5,6,7,8,9};

        for (int i =0 ;i<9;i++){
            int bai=num[i];
            for (int j =0;j<9;j++){
                int shi=num[j];
                for (int k = 0;k<9;k++){
                    int ge= num[k];
                    int one=bai*100+shi*10+ge;
                    int two=one*2;
                    int three=one*3;
                    if (istrue(one,two,three)){
                        System.out.println(one+","+two+","+three);
                    }
                }
            }
        }
    }
    public static boolean istrue(int one,int two,int three){
        HashSet<Integer> res = new HashSet<>();
        toSet(one,res);
        toSet(two,res);
        toSet(three,res);
        if (res.size()==9){
            return true;
        }
        return false;

    }
    public static void toSet(int n,HashSet res){
        res.add(n/100);
        res.add((n%100)/10);
        res.add(n%10);
    }
}
