public class leetcode27 {
    public int removeElement(int[] nums, int val) {
        int leftindex=0;
        int rightindex=nums.length-1;//����ָ��
        while(leftindex<=rightindex){//������ָ�����ʱ����ѭ��
            while(leftindex<=rightindex&&nums[leftindex]!=val){//�ҵ�Ŀ��ֵ
                ++leftindex;//ָ������ƶ�һλ������ֱ���ҵ�Ŀ��ֵ
            }
            while(leftindex<=rightindex&&nums[rightindex]==val){//�ҵ���Ŀ��ֵ
                --rightindex;//ָ����ǰ�ƶ�һλ������ֱ���ҵ���Ŀ��ֵ
            }
            if(leftindex<rightindex){
                nums[leftindex++]=nums[rightindex--];//���ҵ���Ŀ��ֵ�ͷ�Ŀ��ֵ���ǣ��������������֤�´α���,�ȼ��������
                //nums[leftindex]=nums[rightindex--];
                //leftindex++;
                //rightindex--;
            }
        }
        return leftindex;
    }
}
