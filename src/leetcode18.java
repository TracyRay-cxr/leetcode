import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0;i< nums.length;i++){
            if (nums[i]>0&&nums[i]>target){
                break;//һ����֦
            }
            if (i>0
                    &&nums[i]==nums[i-1]){
                continue;//һ��ȥ��
            }
            for(int j=i+1;j< nums.length;j++)
            {
                if (nums[i]+nums[j]>0&&nums[i]+nums[j]>target){
                    break;//������֦
                }
                if(j>i+1&&nums[j]==nums[j-1]){
                    continue;//����ȥ��
                }
                int left=j+1;//˫ָ���жϣ�ͬ����֮��
                int right= nums.length-1;
                while(left<right){
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum > target) {
                        right--;
                    } else if (sum < target) {
                        left++;
                    }
                    else{
                        list.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));//�������ӵ����������
                        //�ƶ��±�,�ж���һ�飬��ʱͬʱ�ƶ������ֻ����һ������һ��ֵ�ѹ̶�����֮ǰ���ظ�
                        right--;
                        left++;
                        //��֦��ȥ��
                        while(nums[left]==nums[left-1]&&left<right)left++;
                        while (nums[right]==nums[right+1]&&left<right)right--;

                    }
                }
            }
        }
        return list;
    }
}
