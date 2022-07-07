public class leetcode202 {
    public boolean isHappy(int n) {
        int fast=n;//快指针
        int slow=n;//慢指针
       do{
            slow=getNext(slow);//慢指针一次走一步
            fast=getNext(fast);//快指针一次走两步
            fast=getNext(fast);
        }while(fast!=slow);//要先走一次再判断，不然开头都在头指针
        return slow==1;//判断是否都指向1，要么1，要么是个环

    }

    /**
     * 通过此函数实现链表构建，将问题转化为链表是否有环，有环是收敛到1还是一直循环；
     * @param n
     * @return
     */
    public int getNext(int n){
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=d*d;
            n=n/10;
        }
        return sum;
    }
}
