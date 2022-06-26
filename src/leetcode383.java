public class leetcode383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        //用数组做哈希表
        int[] record=new int[26];
        //遍历字符串，将字符转化为指针的映射
        for (char ch:magazine.toCharArray()){
            record[ch-'a']++;
        }
        for (char ch:ransomNote.toCharArray()){
            record[ch-'a']--;
        }
        //遍历数组；如果存在一个<0的值的话就证明magazine无法包含ransomNote
        for (int i:record){
            if (i<0)return false;
        }
       return true;
    }
}
