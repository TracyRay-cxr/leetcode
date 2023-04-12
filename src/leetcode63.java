public class leetcode63 {
    //不同路径2
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid.length-1;
        int m=obstacleGrid[n].length-1;
        int[][] dp =new int[n][m];
        //特殊情况
        if (obstacleGrid[n-1][m-1]==1||obstacleGrid[0][0]==1){
            return 0;
        }
        //初始化
        for (int i=0;i<m&&obstacleGrid[0][i]==0;i++){
            dp[0][i]=1;
        }
        //初始化
        for (int j=0;j<n&&obstacleGrid[j][0]==0;j++){
            dp[j][0]=1;
        }
        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                if (obstacleGrid[j][i]==0){
                    dp[j][i]=dp[j-1][i]+dp[j][i-1];
                }else{
                    dp[j][i]=0;
                }
            }
        }
        return dp[n-1][m-1];

    }
}
