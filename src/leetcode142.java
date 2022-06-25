public class leetcode142 {
    public ListNode detectCycle(ListNode head) {
        if(head==null|head.next==null)return null;
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;//满指针走一步
            fast=fast.next.next;//快指针走两步
            if (slow==fast) {//相遇证明有环
                /**
                 *  slow指针走过的节点数为: x + y， fast指针走过的节点数：x + y + n (y + z)，n为fast指针在环内走了n圈才遇到slow指针， （y+z）为 一圈内节点的个数A。
                 *
                 * 因为fast指针是一步走两个节点，slow指针一步走一个节点， 所以 fast指针走过的节点数 = slow指针走过的节点数 * 2：
                 *
                 * (x + y) * 2 = x + y + n (y + z)
                 *
                 * 两边消掉一个（x+y）: x + y = n (y + z)
                 *
                 * 因为要找环形的入口，那么要求的是x，因为x表示 头结点到 环形入口节点的的距离。
                 *
                 * 所以要求x ，将x单独放在左面：x = n (y + z) - y ,
                 *
                 * 再从n(y+z)中提出一个 （y+z）来，整理公式之后为如下公式：x = (n - 1) (y + z) + z 注意这里n一定是大于等于1的，因为 fast指针至少要多走一圈才能相遇slow指针。
                 *
                 * 这个公式说明什么呢？
                 *
                 * 先拿n为1的情况来举例，意味着fast指针在环形里转了一圈之后，就遇到了 slow指针了。
                 *
                 * 当 n为1的时候，公式就化解为 x = z，
                 *
                 * 这就意味着，从头结点出发一个指针，从相遇节点 也出发一个指针，这两个指针每次只走一个节点， 那么当这两个指针相遇的时候就是 环形入口的节点。
                 */
                //一个从头节点走，一个从相遇节点走，每次都走一步，相遇即为入口
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
