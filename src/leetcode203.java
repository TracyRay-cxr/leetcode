public class leetcode203 {
    //递归
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {//递归中归的条件，到最后一个节点才生效
            return head;//向上归
        }
        head.next = removeElements(head.next, val);//递归
        return head.val == val ? head.next : head;//删除过程
    }
    //迭代
   /* public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode temp = dummyHead;
        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return dummyHead.next;
    }*/

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
