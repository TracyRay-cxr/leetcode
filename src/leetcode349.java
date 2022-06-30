import java.util.*;

public class leetcode349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        //判空
       if (nums1==null||nums2==null||nums1.length<0||nums2.length<0){
           return null;
       }
       //创建散链表，记录短的数组中的值
        Set<Integer> cnt=new HashSet();
       //创建散链表保存两个数组都存在的数
       Set<Integer> res=new HashSet();
       //令nums1为最长数组
       if (nums1.length<nums2.length){
           int[] temp=nums1;
           nums1=nums2;
           nums2=temp;
       }
       //保存短的数组的值
       for (int i:nums2){
           cnt.add(i);
       }
       //遍历长的数组，判断是否跟短的数组的值一致
       for (int j:nums1){
           if (cnt.contains(j)){
               res.add(j);
           }
       }
       //将链表转化成返回类型要求的数组
        int[] resArr = new int[res.size()];
        int index = 0;
        for (int i : res) {
            resArr[index++] = i;
        }
        return resArr;
    }
}
