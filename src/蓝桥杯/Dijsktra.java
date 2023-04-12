package ���ű�;

public class Dijsktra {
    public static void main(String[] args) {
        int[][] adjMatrix ={
                {0,2,-1,1,-1,3,-1,-1},
                {-1,0,6,-1,5,-1,-1,-1},
                {-1,-1,0,-1,-1,-1,-1,6},
                {-1,2,-1,0,-1,-1,2,-1},
                {-1,-1,9,-1,0,-1,-1,4},
                {-1,-1,-1,5,-1,0,4,-1},
                {-1,7,-1,-1,3,-1,0,8},
                {-1,-1,-1,-1,-1,-1,-1,0}
        };


        getShortestPaths(adjMatrix);
    }
    public static int[] getShortestPaths(int[][] adjMatrix){
        //���·������->��̬��
        int[] dist =new int[adjMatrix.length];
        boolean[] S = new boolean[adjMatrix.length];
        //ǰ����������
        int[] pre = new int[adjMatrix.length];
        S[0] = true; //��ʾ����0�Ѿ�������,���뵽S����
        //Դ������·����ǰ����������
        pre[0]=0;
        //��ʼ�����·�������S���ϣ����·������ĳ�ʼ���Ǵ�Դ�㵽��������ľ���
        for (int i=1;i< adjMatrix.length;i++){
            dist[i]=adjMatrix[0][i];
            S[i]=false;
            //��ʼ��ǰ�����鶼�Ǵ�ǰ���ڵ㿪ʼ��
            pre[i]=0;
        }
        for (int i = 1;i< adjMatrix.length;i++){
            int min = Integer.MAX_VALUE;
            int k=0;
            //Ѱ�ҿ��Ե���ĵ��е����·�����Ǹ����Լ�Ȩֵ
            for (int j=1;j< adjMatrix.length;j++){
                if (!S[j]&&dist[j]!=-1&&min>dist[j]){
                    min = dist[j];
                    k = j;
                }
            }
            //��¼��ǰ���㣬��Ϊ�Ѿ��ҵ�����·��
            S[k]=true;
            //�Ƚ�����·������������ľ������ǰ����̾���Ƚϣ�ά��dist�����������·��
            for (int j =1;j<adjMatrix.length;j++){
                if (!S[j]&&adjMatrix[k][j]!=-1&&(dist[j]>min+adjMatrix[k][j]||dist[j]==-1)){
                    dist[j] = min + adjMatrix[k][j];
                    //��¼�ö������·����ǰ������
                    pre[j]=k;
                }
            }
        }
        System.out.println("===============Դ��0��������������·��==================");
        System.out.print("point"+" ");
        for (int i=0;i< pre.length;i++){

            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("dist-"+" ");
        for (int i=0;i< pre.length;i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
        System.out.print("pre--"+" ");
        for (int i=0;i< pre.length;i++){
            System.out.print(pre[i]+" ");
        }
        return dist;
    }
}
