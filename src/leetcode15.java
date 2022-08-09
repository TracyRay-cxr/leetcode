import java.util.*;

public class leetcode15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
            if (nums[i]>0){
                break;//�����!��һ��Ԫ�ؾ�С��0��˵����������������֮�Ͳ���=0
            }
            if (i>0
                    &&nums[i]==nums[i-1]){
                continue;//ȥ�أ�Ҫ��֮ǰ�ı���������©����{-2��-1��-1��-1��-1��-1��-1��-1��2}���������i+1�Ȼ�©��һ��
            }
            int left=i+1;
            int right= nums.length-1;
            while(left<right){
                if (nums[i]+nums[left]+nums[right]>0){//����֮�ʹ���0������Ϊ������������right���ƿ��Լ�С�͵�ֵ
                    right--;
                }
                else if (nums[i]+nums[left]+nums[right]<0){//ͬ��
                    left++;
                }
                else{
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));//�ų����ں�С�ھ����ҵ�����=0��������ӵ�Ҫ���ص�list
                    //Ȼ��ȥ��
                    //�ظ������ֱ������ ,���ַ�ʽ
                    //1.����һ����,Ҫ���Ƚ���һ��left++��right--֮ǰ��
//                    while(left<right&&nums[left]==nums[left+1])left++;
//                    while (left< right&&nums[right]==nums[right-1])right--;
                    //�����������ظ��Ķ�Ҫ����left��right��һ�����
                    left++;
                    right--;
                    //2.����һ���ȣ�Ҫ���Ƚ���һ��left++��right--֮����
                    while(left<right&&nums[left]==nums[left-1])left++;
                    while (left< right&&nums[right]==nums[right+1])right--;
                }
            }
        }
        return res;
    }
}
