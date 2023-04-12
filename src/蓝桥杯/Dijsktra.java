package 蓝桥杯;

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
        //最短路径数组->动态的
        int[] dist =new int[adjMatrix.length];
        boolean[] S = new boolean[adjMatrix.length];
        //前驱顶点数组
        int[] pre = new int[adjMatrix.length];
        S[0] = true; //表示顶点0已经被遍历,加入到S集合
        //源点的最短路径的前驱是它本身
        pre[0]=0;
        //初始化最短路径数组和S集合，最短路径数组的初始化是从源点到各个顶点的距离
        for (int i=1;i< adjMatrix.length;i++){
            dist[i]=adjMatrix[0][i];
            S[i]=false;
            //初始化前驱数组都是从前驱节点开始的
            pre[i]=0;
        }
        for (int i = 1;i< adjMatrix.length;i++){
            int min = Integer.MAX_VALUE;
            int k=0;
            //寻找可以到达的点中的最短路径的那个点以及权值
            for (int j=1;j< adjMatrix.length;j++){
                if (!S[j]&&dist[j]!=-1&&min>dist[j]){
                    min = dist[j];
                    k = j;
                }
            }
            //记录当前顶点，认为已经找到特殊路径
            S[k]=true;
            //比较特殊路径到各个顶点的距离和以前的最短距离比较，维持dist数组总是最短路径
            for (int j =1;j<adjMatrix.length;j++){
                if (!S[j]&&adjMatrix[k][j]!=-1&&(dist[j]>min+adjMatrix[k][j]||dist[j]==-1)){
                    dist[j] = min + adjMatrix[k][j];
                    //记录该顶点最短路径的前驱顶点
                    pre[j]=k;
                }
            }
        }
        System.out.println("===============源点0到其他顶点的最短路径==================");
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
