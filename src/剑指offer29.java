public class 剑指offer29 {
    public int[] spiralOrder(int[][] matrix) {
    if (matrix.length==0)return new int[0];//首先判断矩阵是否为空
    int[] arr=new int[matrix[0].length* matrix.length];//创建数组存放遍历的结果，长度为 行长*列长 不一定是正方形矩阵！！！
    int top=0;//上边界
    int right= matrix[0].length-1;//右边界
    int bottom= matrix.length-1;//下边界
    int left=0;//左边界
    int index=0;//结果数组下标
    while(true){//优化：第二次循环不用遍历完，设定break条件（只要一条界限越界就跳出大循环）
        for (int i=left;i<=right;i++){//遍历上边界
            arr[index++]=matrix[top][i];//行不变列变
        }
        if (++top>bottom)break;//跳出循环，如果是正方形矩阵，最后一个值一定是第n次while循环的第一个for循环的一次遍历，这里直接判断跳出优化代码
        for (int i=top;i<=bottom;i++){
            arr[index++]=matrix[i][right];
        }
//        right--;
        if (--right<left)break;
        for (int i=right;i>=left;i--){
            arr[index++]=matrix[bottom][i];
        }
//        bottom--;
        if (--bottom<top)break;
        for (int i=bottom;i>=top;i--){
            arr[index++]=matrix[i][left];
        }
//        left++;
        if (++left>right)break;
    }
    return arr;
    }
}
