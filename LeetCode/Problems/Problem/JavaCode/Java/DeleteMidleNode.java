public class DeleteMidleNode {

public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


    public ListNode deleteMiddle(ListNode head) {
        int countSize = 0;
        ListNode currentNode = head;
        while (currentNode != null) {
            countSize ++;
            currentNode = currentNode.next;
        }
        //System.out.println(countSize);
        if (countSize == 2) {
            head.next = null;
            return head;
        }
        if (countSize == 1) {
            return null;
        }
        int index = countSize / 2;
        // if (countSize % 2 == 0) {
        //     index = countSize / 2 + 1;
        // } else {
        //     index = countSize / 2;
        // }

        //System.out.println(countSize + " " + index);
        currentNode = head;
        int currentIndex = 0;
        while(currentNode != null) {
            if (currentIndex + 1 == index) {
                ListNode nextNode = currentNode.next.next;
                currentNode.next = nextNode;
                break;
            }
            currentIndex++;
            currentNode = currentNode.next;
        }
        return head;
    }
}
