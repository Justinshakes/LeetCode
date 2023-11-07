public class MergeTwoSortedLists_21 {
    // Nov 7th 2023

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 == null)
            current.next = l2;
        else
            current.next = l1;

        return dummyHead.next;
    }

    public static void main(String[] args) {
        // Test Case 1: Merge two empty lists, should return an empty list
        ListNode merged1 = mergeTwoLists(null, null);
        printList(merged1);

        // Test Case 2: Merge one empty list with a non-empty list
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(5)));
        ListNode merged2 = mergeTwoLists(null, list2);
        printList(merged2);

        // Test Case 3: Merge two non-empty lists
        ListNode list1 = new ListNode(2, new ListNode(4, new ListNode(6)));
        ListNode merged3 = mergeTwoLists(list1, list2);
        printList(merged3);
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

}
