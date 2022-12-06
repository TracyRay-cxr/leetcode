public class quicksort {
    public static void main(String[] args){
        //test
        int[] i=new int[]{3,1,2,8,4,6,9,5,7,8,3,1,5,7,9,5,1,3,1,0};
        quickSort(i);
        for(int h:i){
            System.out.print(h+",");
        }
    }
    //快速排序
    public static  void quickSort(int[] arr){
        if (arr==null||arr.length<2){
            return ;
        }
        quickSort(arr,0, arr.length-1);
    }
    public static void quickSort(int[] arr,int L,int R){//递归函数
        if(L<R){
            swap(arr,L+(int)(Math.random()*(R-L+1)),R);//用随机数来提升性能
            int[] P=partition(arr,L,R);
            quickSort(arr,L,P[0]-1);
            quickSort(arr,P[1]+1,R);
        }
    }
    public static int[] partition(int[] arr,int L,int R){
        int less=L-1;//左区右边界
        int more=R;//右区左边界
        while(L<more){
            if (arr[L]<arr[R]) {
                swap(arr,++less,L++);
            }else if(arr[L]>arr[R]){
                swap(arr,--more,L);
            }else{
                L++;
            }
        }
        swap(arr,more,R);
        return new int[]{less+1,more};
    }
    public static void swap(int[] arr,int a,int b){
       int temp=arr[a];
       arr[a]=arr[b];
       arr[b]=temp;
    }
}
