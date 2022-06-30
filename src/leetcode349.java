import java.util.*;

public class leetcode349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        //�п�
       if (nums1==null||nums2==null||nums1.length<0||nums2.length<0){
           return null;
       }
       //����ɢ������¼�̵������е�ֵ
        Set<Integer> cnt=new HashSet();
       //����ɢ�������������鶼���ڵ���
       Set<Integer> res=new HashSet();
       //��nums1Ϊ�����
       if (nums1.length<nums2.length){
           int[] temp=nums1;
           nums1=nums2;
           nums2=temp;
       }
       //����̵������ֵ
       for (int i:nums2){
           cnt.add(i);
       }
       //�����������飬�ж��Ƿ���̵������ֵһ��
       for (int j:nums1){
           if (cnt.contains(j)){
               res.add(j);
           }
       }
       //������ת���ɷ�������Ҫ�������
        int[] resArr = new int[res.size()];
        int index = 0;
        for (int i : res) {
            resArr[index++] = i;
        }
        return resArr;
    }
}
