public class ��ָoffer5 {
    public String replaceSpace(String s) {
        if(s==null||s.length()<=0){
            return s;
        }
        //����ռ�
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<s.length();i++){
            //str.charAt(i) Ϊ char ���ͣ�Ϊ�˱Ƚ���Ҫ����תΪ�� " " ��ͬ���ַ�������
            //if (" ".equals(String.valueOf(str.charAt(i)))){
            if (s.charAt(i)==' '){//charֻ�ܺ͡�����
                sb.append("%20");
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();//ת���ַ�������
    }

    //�ڶ���
    public String replaceSpacePro(String s){
        if (s==null||s.length()==0){
        return s;
    }
    StringBuilder sb=new StringBuilder();
    //����ռ�
        for (int i=0;i<s.length();i++){
        if (s.charAt(i)==' '){
            sb.append("  ");
        }
    }
    //�ж��Ƿ���ڡ� ��
        if (sb.length()==0){
        return s;
    }
    //����˫ָ��
    int left=s.length()-1;//��ָ��ָ��ԭ��s��ĩβ
    s+=sb;
    int right=s.length()-1;//��ָ��ָ��������s��ĩβ
    char[] chars = s.toCharArray();
        while(left<right){
        if (chars[left]==' '){
            chars[right--]='0';
            chars[right--]='2';
            chars[right]='%';
        }else {
            chars[right] = chars[left];
        }
        right--;
        left--;
    }
        return new String(chars);//ת��ΪString����
    }
}












