public class ��ָoffer29 {
    public int[] spiralOrder(int[][] matrix) {
    if (matrix.length==0)return new int[0];//�����жϾ����Ƿ�Ϊ��
    int[] arr=new int[matrix[0].length* matrix.length];//���������ű����Ľ��������Ϊ �г�*�г� ��һ���������ξ��󣡣���
    int top=0;//�ϱ߽�
    int right= matrix[0].length-1;//�ұ߽�
    int bottom= matrix.length-1;//�±߽�
    int left=0;//��߽�
    int index=0;//��������±�
    while(true){//�Ż����ڶ���ѭ�����ñ����꣬�趨break������ֻҪһ������Խ���������ѭ����
        for (int i=left;i<=right;i++){//�����ϱ߽�
            arr[index++]=matrix[top][i];//�в����б�
        }
        if (++top>bottom)break;//����ѭ��������������ξ������һ��ֵһ���ǵ�n��whileѭ���ĵ�һ��forѭ����һ�α���������ֱ���ж������Ż�����
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
