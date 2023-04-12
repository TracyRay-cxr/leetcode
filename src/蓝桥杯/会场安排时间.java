package 蓝桥杯;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class 会场安排时间 {
    public static void main(String[] args) {
        int greedyCount=10;
        int[] timeBegin={5,8,7,9,10,12,14,10,12,5};
        int[] timeEnd={9,9,8,11,15,13,20,14,15,6};
        int[] greedySelector = greedySelector(timeBegin, timeEnd, greedyCount);
        System.out.println("=====================结果向量============================");
        for (int i : greedySelector) {
            System.out.print(i+" ");
        }
    }
    public static int[] greedySelector(int[] timeBegin,int[] timeEnd,int greedyCount){
        //用队列来安排会议
        LinkedList<greedy> greedies=new LinkedList<>();
        //将开始时间和结束时间对应起来方便后续排序
        for (int i=0;i<greedyCount;i++){
            greedies.offerLast(new greedy(timeBegin[i],timeEnd[i],i));
        }
        //按照结束时间从小到大排序
       greedies.sort(Comparator.comparing(greedy::getEnd));
        System.out.println("================排序后的顺序==============");
        for (greedy greedy : greedies) {
            System.out.println(greedy);
        }
        int temp;//记录已安排的最后一个结束时间
        int[] restful=new int[greedyCount];
        for (int i : restful) {
            //初始化结果向量
            restful[i]=0;
        }
        //第一个处理
        {
            //排好序后的第一个会议一定是最优解
            greedy first = greedies.pollFirst();
            temp = first.getEnd();
            //找到该会议的序号，在结果向量附一
            restful[first.getIndex()] = 1;
        }
        while(!greedies.isEmpty()){
            greedy greedy = greedies.pollFirst();
            //判断是否相容
            if (temp<=greedy.getStart()){
                //相容直接安排为已安排状态
                restful[greedy.getIndex()]=1;
                temp= greedy.getEnd();
            }

        }
        return restful;
    }

}
class greedy{
    int index;
    int start;
    int end;

    public greedy(int start, int end,int index) {
        this.index=index;
        this.start = start;
        this.end = end;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "greedy{" +
                "index=" + index +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
