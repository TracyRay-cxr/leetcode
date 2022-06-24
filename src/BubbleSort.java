import java.util.Arrays;

public class BubbleSort {
//    public static void bubblesort(int[] arr) {
//        if(arr==null){
//            return;
//        }
//        for(int i= arr.length-1;i>0;i--){
//            for(int j=0;j<i;j++){
//                if(arr[j]>arr[j+1]){
//                    swap(arr,j,j+1);
//                }
//            }
//        }
//    }
//
//    public static void swap(int[] arr, int i, int j) {
//        int tmp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = tmp;
//    }
//    public static int[] generateRandomArray(int maxSize,int maxValue){
//        int[] arr=new int[(int)((maxSize+1)*Math.random())];
//        for (int i=0;i<arr.length;i++){
//            arr[i]=(int)((maxValue+1)*Math.random()-maxValue*Math.random());
//        }
//        return arr;
//    }
//    public static int[] copyArray(int[] arr){
//        int[] rtn=new int[arr.length];
//        for (int i=0;i< arr.length;i++){
//            rtn[i]=arr[i];
//        }
//        return rtn;
//    }
//    public static boolean isEqual(int[] arr1,int[] arr2){
//        if((arr1==null&&arr2!=null)||(arr1!=null&&arr2==null)){
//            return false;
//        }
//        if(arr1==null&&arr2==null){
//            return true;
//        }
//        if (arr1.length!=arr2.length){
//            return false;
//        }
//        for(int i=0;i<arr1.length;i++){
//            if (arr1[i]!=arr2[i]){
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void printArray(int[] arr){
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//    }
//    public static void main(String[] args) {
//      int timeout=10000;
//      int maxSize=100;
//      int maxValue=100;
//      boolean succeed=true;
//      for (int i=0;i<timeout;i++){
//          int[] arr1=generateRandomArray(maxSize,maxValue);
//          int[] arr2=copyArray(arr1);
//          bubblesort(arr1);
//          Arrays.sort(arr2);
//          if(!isEqual(arr1,arr2)){
//              succeed=false;
//              printArray(arr1);
//              printArray(arr2);
//              break;
//          }
//      }
//        System.out.println(succeed?"对了":"错了");
//
//    }
    public static void bubblesort(int[] arr){
        if(arr.length<=1||arr==null){
            return;
        }
        for (int i=arr.length-1;i>0;i--){
            for (int j=0; j<i; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static int[] generateRandomArray(int maxSize,int maxValue){
        int[] arr=new int[(int)((maxSize+1)*Math.random())];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)((maxValue)*Math.random()-(maxValue+1)*Math.random());
        }
        return arr;
    }
    public static int[] copyArray(int[] arr){
        int[] arr1=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
        }
        return arr1;

    }
    public static boolean isEqules(int[] arr1,int[] arr2) {
        if ((arr1 != null && arr2 == null) || (arr1 == null && arr2 != null)) {
            return false;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        if (arr1 == null && arr2 == null) {
            return true;
        }
        for (int i=0;i<arr1.length;i++){
            if (arr1[i]!=arr2[i]){
                return false;
            }

        }
        return true;
    }
    public static void main(String args[]){
        int testTime=50000;
        int maxSize=100;
        int maxValue=100;
        boolean succeed=true;
        for (int i=0;i<testTime;i++){
            int[] arr1=generateRandomArray(maxSize,maxValue);
            int[] arr2=copyArray(arr1);
            bubblesort(arr1);
            Arrays.sort(arr2);
            if (!isEqules(arr1,arr2)){
                succeed=false;
                for (int j=0;j<arr1.length;j++){
                    System.out.println(arr1[i]);
                }
                System.out.println("------------------------");
                for (int j=0;j<arr1.length;j++){
                    System.out.println(arr2[i]);
                }
                break;
            }
        }
        System.out.println(succeed?"对了":"错了");
    }
}
