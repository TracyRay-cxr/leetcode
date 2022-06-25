public class leetcode242 {
    public boolean isAnagram(String s, String t) {
        //用数组做哈希表
        int[] record=new int[26];
        //遍历字符串，将字符转化为指针的映射
        for(char ch:s.toCharArray()){
            record[(ch-'a')]++;
        }
        for(char ch:t.toCharArray()){
            record[(ch-'a')]--;
        }
        //遍历数组；如果全为0的话就证明两个字符串异位
        for (int i:record){
            if (i!=0)return false;
        }
        return true;
    }
}
