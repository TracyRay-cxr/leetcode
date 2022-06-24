import java.util.Arrays;

public class Selectionsort {
//    public static void selectionsort(int[] arr){
//      if(arr==null||arr.length<=2){
//          return;
//      }
//     for(int i=0;i< arr.length-1;i++){
//         int minIndex=i;
//         for (int j=i+1;j<arr.length;j++){
//             minIndex=arr[j]<arr[minIndex]?j:minIndex;
//         }
//         swap(arr,i,minIndex);
//     }
//    }
//    public static void swap(int[]arr,int i,int j){
//        int tmp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=tmp;
//    }
//    public static void main(String[] args) {
//        int []arr=new int[]{4,6,7,9,8,1,2,3,0,5};
//        selectionsort(arr);
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//    }
    public static void selectionsort(int[] arr) {
        if (arr.length < 1 || arr == null) {
            return;
        }
        for (int i=0;i<arr.length-1;i++){
            int minIndex = i;
            for (int j=i+1;j<arr.length;j++){
                minIndex = arr[minIndex] > arr[j] ? j : minIndex;
            }
            swap(arr,i,minIndex);
        }
    }
    public static void swap(int[]arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
    public static int[] generateRandomArray(int maxSize,int maxValue){
        int[] arr=new int[(int) ((maxSize+1)*Math.random())];
        for (int i=0;i<arr.length;i++){
            arr[i]=(int)((maxValue+1)*Math.random()-(maxValue*Math.random()));
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
    public static boolean isEqules(int[] arr1,int[] arr2){
        if ((arr1!=null&&arr2==null)||(arr1==null&&arr2!=null)){
            return false;
        }
        if (arr1==null&&arr2==null){
            return true;
        }
        if (arr1.length!=arr2.length){
            return false;
        }
        for (int i=0;i<arr1.length;i++){
            if (arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int testTime=50000;
        int maxSize=100;
        int maxValue=100;
        boolean succeed=true;
        for (int i=0;i<testTime;i++){
            int[] arr1=generateRandomArray(maxSize,maxValue);
            int[] arr2=copyArray(arr1);
            Selectionsort.selectionsort(arr1);
            Arrays.sort(arr2);
            if (!isEqules(arr1,arr2)){
                succeed=false;
                for(int m=0;m<arr1.length;m++){
                    System.out.println(arr1[m]);
                }
                System.out.println("对比");
                for(int j=0;j<arr1.length;j++){
                    System.out.println(arr2[j]);
                }
                break;
            }
        }
        System.out.println(succeed?"对了":"错了");
    }

}
