import java.util.Scanner;
// Creating Node Object
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class RemoveDuplicatesFromSortedList {
    // Deleting Duplicates from Linked List
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        // Initializing scanner.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values of the sorted linked list (space-separated): ");
        String[] values = scanner.nextLine().split(" ");

        // Creating LinkedList.
        ListNode head = createLinkedList(values);
    
        ListNode result = deleteDuplicates(head);
        displayLinkedList(result);
    }

    
    private static ListNode createLinkedList(String[] values) {
        if (values.length == 0) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (String value : values) {
            current.next = new ListNode(Integer.parseInt(value));
            current = current.next;
        }

        return dummy.next;
    }

    
    private static void displayLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}