public class leetcode206 {
    public ListNode reverseList(ListNode head) {
        /**
         * ˫ָ�뷨
         *
         *
         *        if (head.next==null)
         *         return  head;
         *        ListNode pred=null;
         *        ListNode cur=head;
         *        ListNode temp=null;
         *        while(cur!=null){
         *            temp=cur;
         *            cur=cur.next;
         *            temp.next=pred;
         *            pred=temp;
         *        }
         *        return pred;
         */

        /**
         * �ݹ鷨
         */
        return reverse(null,head);
    }
    public ListNode reverse(ListNode pred,ListNode cur){
        if (cur==null){
            return pred;
        }
        ListNode temp=null;
        temp=cur.next;
        cur.next=pred;
        return reverse(cur,temp);

    }


}

