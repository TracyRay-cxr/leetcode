public class leetcode209 {
    public int minSubArraylen(int target,int[] nums){
        int i=0;//�������ڵ���ʼָ��
        int j=0;//�������ڵ���ָֹ��
        int result=nums.length;//���ս��
        int subArraylen=0;//��������ĳ��ȣ����ڳ��ȣ�
        int sum=0;//������֮��
        for (j=0;j<nums.length;j++){
            sum+=nums[j];
            while(sum>=target){//�ж��Ƿ�������Ŀ����
                subArraylen=j-i+1;//���ڵĳ���
                result=result<subArraylen?result:subArraylen;//ȡС��ֵ����result
                sum-=nums[i++];//��Ϊsum�Ǵ���֮�ͣ�����С����ʱ��sumҲҪ�ı䣬i++��ȡֵ������;
            }
        }
        if (subArraylen==0){
            return 0;
        }
        return result;
    }
}
