public class 面试题0207 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null||headB==null)return null;//判空
        ListNode curA=headA;//保存A头节点
        ListNode curB=headB;//保存B头节点

        int sizeA=0;//保存A的大小
        int sizeB=0;//保存B的大小

        while(curA!=null){//遍历A，得到大小，注意这里不能用next判空因为不是虚拟节点，如果链表大小为一就无法进入循环；
            sizeA++;
            curA=curA.next;
        }
        while(curB!=null){//同上
            sizeB++;
            curB=curB.next;
        }

        curA=headA;//重置当前A节点
        curB=headB;//重置当前B节点

        if (sizeB>sizeA){//不知道AB谁大，此时不要分情况讨论，直接把最大的交换给A,让A最大；
            //交换AB的大小
            int tempsize=sizeA;
            sizeA=sizeB;
            sizeB=tempsize;
            //交换AB头节点
            ListNode tempNode=curA;
            curA=curB;
            curB=tempNode;

        }
        //让最大的链表先走到等大小的节点
        while ((sizeA--)-sizeB>0){//求插值并自减
            curA=curA.next;
        }

        while (curA!=null){//开始遍历两个列表
            if (curA==curB){//判断是否是同一地址，同一节点
               return curA;//返回交点
            }
            curA=curA.next;
            curB=curB.next;
        }
    return null;//没有交点
    }
}
