public class leetcode383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        //����������ϣ��
        int[] record=new int[26];
        //�����ַ��������ַ�ת��Ϊָ���ӳ��
        for (char ch:magazine.toCharArray()){
            record[ch-'a']++;
        }
        for (char ch:ransomNote.toCharArray()){
            record[ch-'a']--;
        }
        //�������飻�������һ��<0��ֵ�Ļ���֤��magazine�޷�����ransomNote
        for (int i:record){
            if (i<0)return false;
        }
       return true;
    }
}
