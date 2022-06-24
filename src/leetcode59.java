public class leetcode59 {
    public int[][] generateMatrix(int n) {
        int[][] res=new int[n][n];
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=n-1;
        int k=1;
        while(k<=n*n){//遍历所有数

            /**
             * 逆时针所以是上 右 下 左
             */
            for (int i=left;i<=right;i++){//遍历上边界从top left处开始
                res[top][i]=k++;//行不变列变，k自增
            }
            top++;//上边界向下移动
            for (int i=top;i<=right;i++){//遍历右边界从top right 开始
                res[i][right]=k++;//列不变行变，k自增
            }
            right--;//右边界向左移动
            for (int i=right;i>=left;i--){//遍历下边界从bottom right开始
                res[bottom][i]=k++;//行不变列变，k自增
            }
            bottom--;//下边界向上移动
            for (int i=bottom;i>=top;i--){//遍历左边界从bottom left开始
                res[i][left]=k++;//列不变行变，k自增
            }
            left++;//左边界向右移动
        }
        return res;
    }
}
