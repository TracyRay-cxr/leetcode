public class leetcode242 {
    public boolean isAnagram(String s, String t) {
        //����������ϣ��
        int[] record=new int[26];
        //�����ַ��������ַ�ת��Ϊָ���ӳ��
        for(char ch:s.toCharArray()){
            record[(ch-'a')]++;
        }
        for(char ch:t.toCharArray()){
            record[(ch-'a')]--;
        }
        //�������飻���ȫΪ0�Ļ���֤�������ַ�����λ
        for (int i:record){
            if (i!=0)return false;
        }
        return true;
    }
}
