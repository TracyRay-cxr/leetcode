import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class text {
public static void  main(String [] agrs) {
    leetcode18 leet=new leetcode18();
    List<List<Integer>> list=new ArrayList<>();
    list=leet.fourSum(new int[]{-1000000000,-1000000000,1000000000,-1000000000,-1000000000},294967296);
    for (List<Integer> li:list){
        System.out.println(li);
    }
}



}
