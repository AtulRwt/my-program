
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

public class LeetCodeQues6{
    public static ListNode removeNthFromEnd(ListNode head,int n)
    {
        if(head.next==null){
            return null;
        }
        int size=0;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            size++;
        }    
        if(n==size){
            return head.next;
        }
        int indexTosearch=size-n;
        ListNode prev=head;
        int i=0;
        while(i<indexTosearch){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;

    }
    private static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        printLinkedList(head);

        int n = 3; // Specify the value of N

        // Delete the N-th element
        head = removeNthFromEnd(head, n);

        System.out.println("\nLinked List after deleting " + n + "-th element:");
        printLinkedList(head);
    }     
}
