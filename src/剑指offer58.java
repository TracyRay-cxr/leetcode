public class 剑指offer58 {
    public String reverseLeftWords(String s, int n) {
        /**
         * 开辟新的存储空间
        if (s==null||s.length()==0||n<=0){
            return s;
        }
        StringBuilder sb=new StringBuilder();
        for (int j=n;j<s.length();j++){
            sb.append(s.charAt(j));
        }
        for (int i=0;i<n;i++){
            sb.append(s.charAt(i));
        }
        return new String(sb);
         */
        if (s==null||s.length()==0||n<=0){
            return s;
        }
        char[] ch=s.toCharArray();
        swap(ch,0,n-1);
        swap(ch,n,ch.length-1);
        swap(ch,0, ch.length-1);
        return new String(ch);
    }
    public void swap(char[] ch,int a,int b){
        for (;a<b;a++,b--){
            ch[a]^=ch[b];
            ch[b]^=ch[a];
            ch[a]^=ch[b];
        }
    }
}
