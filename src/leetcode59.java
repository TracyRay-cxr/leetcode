public class leetcode59 {
    public int[][] generateMatrix(int n) {
        int[][] res=new int[n][n];
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=n-1;
        int k=1;
        while(k<=n*n){//����������

            /**
             * ��ʱ���������� �� �� ��
             */
            for (int i=left;i<=right;i++){//�����ϱ߽��top left����ʼ
                res[top][i]=k++;//�в����б䣬k����
            }
            top++;//�ϱ߽������ƶ�
            for (int i=top;i<=right;i++){//�����ұ߽��top right ��ʼ
                res[i][right]=k++;//�в����б䣬k����
            }
            right--;//�ұ߽������ƶ�
            for (int i=right;i>=left;i--){//�����±߽��bottom right��ʼ
                res[bottom][i]=k++;//�в����б䣬k����
            }
            bottom--;//�±߽������ƶ�
            for (int i=bottom;i>=top;i--){//������߽��bottom left��ʼ
                res[i][left]=k++;//�в����б䣬k����
            }
            left++;//��߽������ƶ�
        }
        return res;
    }
}
