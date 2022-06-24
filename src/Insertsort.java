import java.util.Arrays;

public class Insertsort {
//    public static void insertsort(int[] arr) {
//        if (arr == null ) {
//            return;
//        }
//       for (int i=1;i< arr.length;i++){
//           for (int j=i;j>0&&arr[j]<arr[j-1];j--){
//               swap(arr,j,j-1);
//           }
//       }
//
//    }
    public static void insertsort(int[] arr){
        if (arr==null){
            return;
        }
        for (int i=1;i<arr.length-1;i++){
            for (int j=i;j>0&&arr[j]<arr[j-1];j--){
                swap(arr,arr[j],arr[j-1]);
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int tmp;
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
       int testTime=50000;
       int maxSize=100;
       int maxValue=100;
       boolean succeed=true;
       for(int i=0;i<testTime;i++){
           int[] arr1=generateRandomArray(maxSize,maxValue);
           int[] arr2=copyArray(arr1);
           insertsort(arr1);
           Arrays.sort(arr2);
           if(!isEqual(arr1,arr2)){
               succeed=false;
               for(int m=0;m<arr1.length;m++){
                   System.out.println(arr1[m]);
               }
               for(int j=0;j<arr1.length;j++){
                   System.out.println(arr2[j]);
               }
               break;
           }
       }
       System.out.println(succeed?"对了":"错了");
       int[] arr=generateRandomArray(maxSize,maxValue);
        for(int m=0;m<arr.length;m++){
            System.out.println(arr[m]);
        }
        insertsort(arr);
        for(int m=0;m<arr.length;m++){
            System.out.println(arr[m]);
        }
    }

    public static int[] generateRandomArray(int maxSize,int maxValue){
        int [] arr=new int [(int)((maxSize+1)*Math.random())];
        for(int i=0;i< arr.length;i++){
            //可以产生负数
            arr[i]=(int)((maxValue+1)*Math.random())-(int)(maxValue*Math.random());
        }
        return arr;
    }
    public static int[] copyArray(int[] arr){
        if(arr==null){
            return null;
        }
        int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i]=arr[i];
        }
        return res;
    }
    public static boolean isEqual(int[] arr1,int[] arr2){
        if((arr1!=null&&arr2==null)||(arr1==null&&arr2!=null)){
            return false;
        }
        if (arr1==null&&arr2==null){
            return true;
        }
        if(arr1.length!=arr2.length){
            return false;
        }
        for (int i=0;i<arr1.length;i++){
            if (arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
