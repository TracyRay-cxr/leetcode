public class leetcode151 {
    public String reverseWords(String s) {
        if(s==null||s.length()==0){
            return s;
        }
        //去除多余空格
        char[] ch=s.toCharArray();
        //双指针原地删除
        int right=0;
        int left=0;
//        for (;right<ch.length;){
//            if (ch[right]==' ') {
//                while(ch[right - 1] == ch[right]){
//                    right++;
//                }
//            }
//            if (right==left){
//                continue;
//            }
//            ch[left++]=ch[right++];
//        }
        for (;right<ch.length;right++){
            if (ch[right]!=' '){//遇到非空格进行处理
                if(left!=0)ch[left++]=' ';//看left是否为初始位置，若不是则每次进行余留一个位置并赋值‘ ’;
                while(right<ch.length&&ch[right]!=' '){//将right位置的目标单词通过循环移动到left位置,直到碰到空格，
                                                        // 说明一个单词移动完成，进入下一轮外循环，寻找下一处单词
                    ch[left++]=ch[right++];
                }

            }
        }

        //创建新数组复制到left为止
        char[] chcp=new char[left];
        for (int i=0;i<left;i++){
            chcp[i]=ch[i];
        }
        //翻转删除多余空格后的整个字符串
        swap(chcp,0,chcp.length-1);
        //然后再对每个单词翻转
        right=0;
        left=0;
//        while(left<right){
//            while(chcp[right]!=' '&&right<chcp.length){
//                right++;
//            }
//            //最终rigth一定会越界1位,因为最后一个元素一定不是空格,right++就会=length
//            if (right>=chcp.length){
//                break;
//            }
//            swap(chcp,left,right);
//            left=right+2;
//            right=left;
//        }

        //将每个单词翻转
        for (;right<=chcp.length;right++){//由于最后一个单词后面没有空格，所以要在结尾+1的地方结束
            if (right==chcp.length||chcp[right]==' '){//每当遇到‘ ’和越界时交换left和right-1之间的（right此时一定时‘ ’和越界）单词进行交换（左闭右闭）
                swap(chcp,left,right-1);
                left=right+1;//交换一个单词，将起始位置换到下一个单词头（也就是‘ ’的后面）
            }
        }

        return new String(chcp);
    }
    //对数组ch从a到b进行翻转
    public void swap(char[] ch,int a,int b){
            for (;a<b;a++,b--){
                ch[a]^=ch[b];
                ch[b]^=ch[a];
                ch[a]^=ch[b];
            }
    }
}
