import java.util.*;

public class leetcode49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        /**
         * 排序方法
         */
        //用散列表存储映射关系来判断每个单词所对应的映射
        Map<String,List<String>> map=new HashMap<>();
        //对所有单词排序
        for (String s:strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            //散列表不存在排序后的单词时，加入列表里
            List<String> list=map.getOrDefault(key,new ArrayList<>());
            list.add(s);
            //更新散列表
            map.put(key,list);
        }
        //构造返回值
        return new ArrayList<List<String>>(map.values());
    }
    /**
     * 质数构造映射关系
     * 乘积太容易溢出了，不推荐
     */
    public List<List<String>> groupAnagrams2(String[] strs){
        //用散列表存储映射关系
        //用质数代表字母相乘来区分不同的字母
        Map<Integer,List<String>> map =new HashMap<>();
        int[] record=new int[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101 };
        //构造映射关系
        for (String s:strs){
            char[] ch=s.toCharArray();
            //映射的键
            int product=1;
            int length = s.length();
            for (int i = 0; i < length; i++) {
                //根据每个字母在质数表里的质数相乘得到唯一值
                product=product*record[ch[i]- 'a'];
            }
            List<String> list=map.getOrDefault(product,new ArrayList<>());
            list.add(s);
            map.put(product,list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
