public class leetcode142 {
    public ListNode detectCycle(ListNode head) {
        if(head==null|head.next==null)return null;
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast) {
                ListNode index1 = fast;
                ListNode index2 = head;
                while (index1 != index2) {
                    index1 = index1.next;
                    index2 = index2.next;
                }
                return index2; // 返回环的入口
            }
        }
        return null;
    }
}
