public class leetcode24 {

    //�ݹ�

    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode cur=dummy;
        return   swap(head);
    }
    public ListNode swap(ListNode head){
        if (head==null||head.next==null){
            return head;
        }
        ListNode temp=head.next;
        head.next=swap(temp.next);
        temp.next=head;
        return temp;
    }
}
