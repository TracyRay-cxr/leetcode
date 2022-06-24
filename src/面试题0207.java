public class ������0207 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null||headB==null)return null;//�п�
        ListNode curA=headA;//����Aͷ�ڵ�
        ListNode curB=headB;//����Bͷ�ڵ�

        int sizeA=0;//����A�Ĵ�С
        int sizeB=0;//����B�Ĵ�С

        while(curA!=null){//����A���õ���С��ע�����ﲻ����next�п���Ϊ��������ڵ㣬��������СΪһ���޷�����ѭ����
            sizeA++;
            curA=curA.next;
        }
        while(curB!=null){//ͬ��
            sizeB++;
            curB=curB.next;
        }

        curA=headA;//���õ�ǰA�ڵ�
        curB=headB;//���õ�ǰB�ڵ�

        if (sizeB>sizeA){//��֪��AB˭�󣬴�ʱ��Ҫ��������ۣ�ֱ�Ӱ����Ľ�����A,��A���
            //����AB�Ĵ�С
            int tempsize=sizeA;
            sizeA=sizeB;
            sizeB=tempsize;
            //����ABͷ�ڵ�
            ListNode tempNode=curA;
            curA=curB;
            curB=tempNode;

        }
        //�������������ߵ��ȴ�С�Ľڵ�
        while ((sizeA--)-sizeB>0){//���ֵ���Լ�
            curA=curA.next;
        }

        while (curA!=null){//��ʼ���������б�
            if (curA==curB){//�ж��Ƿ���ͬһ��ַ��ͬһ�ڵ�
               return curA;//���ؽ���
            }
            curA=curA.next;
            curB=curB.next;
        }
    return null;//û�н���
    }
}
