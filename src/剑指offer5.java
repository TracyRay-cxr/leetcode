public class 剑指offer5 {
    public String replaceSpace(String s) {
        if(s==null||s.length()<=0){
            return s;
        }
        //扩充空间
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<s.length();i++){
            //str.charAt(i) 为 char 类型，为了比较需要将其转为和 " " 相同的字符串类型
            //if (" ".equals(String.valueOf(str.charAt(i)))){
            if (s.charAt(i)==' '){//char只能和‘’比
                sb.append("%20");
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();//转化字符串类型
    }

    //第二种
    public String replaceSpacePro(String s){
        if (s==null||s.length()==0){
        return s;
    }
    StringBuilder sb=new StringBuilder();
    //扩大空间
        for (int i=0;i<s.length();i++){
        if (s.charAt(i)==' '){
            sb.append("  ");
        }
    }
    //判断是否存在“ ”
        if (sb.length()==0){
        return s;
    }
    //定义双指针
    int left=s.length()-1;//左指针指向原本s的末尾
    s+=sb;
    int right=s.length()-1;//右指针指向扩充后的s的末尾
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
        return new String(chars);//转化为String类型
    }
}












