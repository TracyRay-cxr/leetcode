public class binarySearch {
//    public static int binarySearch(int[]arr,int x){
//        int L=0;
//        int R=arr.length-1;
//        int index=-1;
//        while(L<=R) {
//            int m = L + ((R - L) >> 1);
//            if(arr[m]>=x){
//                index=m;
//                R=m-1;
//            }else{
//                L=m+1;
//            }
//        }
//        return index;
//    }
    public static int binarySearch(int[] arr,int target){
        int L=0;
        int R=arr.length-1;
        int index=-1;
        while(L<=R){
            int m=L+((R-L)>>1);
            if (arr[m]>=target){
                index=m;
                R=m-1;
            }else{
                L=m-1;
            }
        }
        return index;
    }
    public static int[] generateRandomArray(int maxSize,int maxValue){
        int[] arr=new int[(int)((maxSize+1)*Math.random())];
        for (int i=0;i<arr.length;i++){
            arr[i]=(int)((maxValue)*Math.random())-(int)((maxValue+1)*Math.random());
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
    public static void main(String[] args){
        int testTime=10000;
        int maxSize=100;
        int maxValue=100;
        int x;
        int y;
        for (int i=0;i<testTime;i++){
            int[] arr1=generateRandomArray(maxSize,maxValue);
            int[] arr2=copyArray(arr1);
            binarySearch(arr1,9);

        }
    }
}
