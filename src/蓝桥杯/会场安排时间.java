package ���ű�;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class �᳡����ʱ�� {
    public static void main(String[] args) {
        int greedyCount=10;
        int[] timeBegin={5,8,7,9,10,12,14,10,12,5};
        int[] timeEnd={9,9,8,11,15,13,20,14,15,6};
        int[] greedySelector = greedySelector(timeBegin, timeEnd, greedyCount);
        System.out.println("=====================�������============================");
        for (int i : greedySelector) {
            System.out.print(i+" ");
        }
    }
    public static int[] greedySelector(int[] timeBegin,int[] timeEnd,int greedyCount){
        //�ö��������Ż���
        LinkedList<greedy> greedies=new LinkedList<>();
        //����ʼʱ��ͽ���ʱ���Ӧ���������������
        for (int i=0;i<greedyCount;i++){
            greedies.offerLast(new greedy(timeBegin[i],timeEnd[i],i));
        }
        //���ս���ʱ���С��������
       greedies.sort(Comparator.comparing(greedy::getEnd));
        System.out.println("================������˳��==============");
        for (greedy greedy : greedies) {
            System.out.println(greedy);
        }
        int temp;//��¼�Ѱ��ŵ����һ������ʱ��
        int[] restful=new int[greedyCount];
        for (int i : restful) {
            //��ʼ���������
            restful[i]=0;
        }
        //��һ������
        {
            //�ź����ĵ�һ������һ�������Ž�
            greedy first = greedies.pollFirst();
            temp = first.getEnd();
            //�ҵ��û������ţ��ڽ��������һ
            restful[first.getIndex()] = 1;
        }
        while(!greedies.isEmpty()){
            greedy greedy = greedies.pollFirst();
            //�ж��Ƿ�����
            if (temp<=greedy.getStart()){
                //����ֱ�Ӱ���Ϊ�Ѱ���״̬
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
