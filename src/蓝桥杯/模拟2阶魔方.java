package 蓝桥杯;

import java.util.Scanner;

public class 模拟2阶魔方 {
    public int[] front={1,1,1,1};
    public int[] back={2,2,2,2};
    public int[] right={3,3,3,3};
    public int[] left={4,4,4,4};
    public int[] up={5,5,5,5};
    public int[] down={6,6,6,6};


    public void reX(){
        int[] view=new int[8];
        //记录翻转x前的颜色数字
        view[0]=right[0];
        view[1]=right[3];
        view[2]=down[1];
        view[3]=down[0];
        view[4]=left[2];
        view[5]=left[1];
        view[6]=up[3];
        view[7]=up[2];
        //交换后的颜色
        right[0]=view[6];
        right[3]=view[7];
        down[1]=view[0];
        down[0]=view[1];
        left[2]=view[2];
        left[1]=view[3];
        up[3]=view[4];
        up[2]=view[5];
        //X面的颜色交换
        view[0]=front[0];
        view[1]=front[1];
        view[2]=front[2];
        view[3]=front[3];
        front[0]=view[3];
        front[1]=view[0];
        front[2]=view[1];
        front[3]=view[2];
    }
    public void reY(){
        int[] view=new int[8];
        //记录翻转Y前的颜色数字
        view[0]=back[0];
        view[1]=back[3];
        view[2]=down[2];
        view[3]=down[1];
        view[4]=front[2];
        view[5]=front[1];
        view[6]=up[2];
        view[7]=up[1];
        //交换后的颜色
        back[0]=view[6];
        back[3]=view[7];
        down[2]=view[0];
        down[1]=view[1];
        front[2]=view[2];
        front[1]=view[3];
        up[2]=view[4];
        up[1]=view[5];
        //Y面的颜色交换
        view[0]=right[0];
        view[1]=right[1];
        view[2]=right[2];
        view[3]=right[3];
        right[0]=view[3];
        right[1]=view[0];
        right[2]=view[1];
        right[3]=view[2];
    }
    public void reZ(){
        int[] view=new int[8];
        //记录翻转x前的颜色数字
        view[0]=right[1];
        view[1]=right[0];
        view[2]=front[1];
        view[3]=front[0];
        view[4]=left[1];
        view[5]=left[0];
        view[6]=up[1];
        view[7]=up[0];
        //交换后的颜色
        right[1]=view[6];
        right[0]=view[7];
        front[1]=view[0];
        front[0]=view[1];
        left[1]=view[2];
        left[0]=view[3];
        up[1]=view[4];
        up[0]=view[5];
        //X面的颜色交换
        view[0]=up[0];
        view[1]=up[1];
        view[2]=up[2];
        view[3]=up[3];
        up[0]=view[3];
        up[1]=view[0];
        up[2]=view[1];
        up[3]=view[2];
    }
    public void run(String s){
        String[] d=s.split("");
        for (int i=0;i<d.length;i++){
            if(d[i].equals("x")){
                reX();
            }
            else if(d[i].equals("y")){
                reY();
            }
            else if (d[i].equals("z")){
                reZ();
            }
        }
        String base[]={"","绿","蓝","红","橙","白","黄"};
        int color[]=new int[3];
        color[0]=front[1];
        color[1]=right[0];
        color[2]=up[2];
        for (int x:color){
            System.out.print(base[x]);
        }
    }
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
        模拟2阶魔方 l=new 模拟2阶魔方();
        l.run(str);
    }
}
