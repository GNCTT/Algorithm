public class ReverseLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode node = head.next;
        ListNode currentNode = head;
        head.next = null;
        while(node != null) {
            currentNode = node;
            node = node.next;
            //System.out.println(currentNode.val);
            currentNode.next = head;
            head = currentNode;
        }
        //System.out.println(currentNode.val);
        return currentNode;
    }

}
