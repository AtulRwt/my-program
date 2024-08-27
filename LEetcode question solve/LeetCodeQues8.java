public class LeetCodeQues8{
    public static boolean detectCycle(ListNode head){
        ListNode turtle=head;
        ListNode hare=head;
        while(hare!=null && hare.next!=null){
            turtle=turtle.next;
            hare=hare.next.next;
            if(turtle==hare){
                return true;

            }
        }
        return false;

        
}
public static void removeCycle(ListNode head){
    ListNode turtle = head;
        ListNode hare = head;

        // Detect the cycle using Floyd's Tortoise and Hare algorithm
        while (hare != null && hare.next != null) {
            turtle = turtle.next;
            hare = hare.next.next;

            if (turtle == hare) {
                // Cycle detected, break out of the loop
                break;
            }
        }
    if(hare==null || hare.next==null){
        return;

    }
    turtle=head;
        
    while(turtle!=hare){
        turtle=turtle.next;
        hare=hare.next;

    }
    while(hare.next!=turtle){
        hare=hare.next;

    }
    hare.next=null;
}
public static void displayList(ListNode head, String message) {
    System.out.print(message + ": ");
    ListNode current = head;
    int count = 0;
    while (current != null && count < 10) {  // To prevent infinite loops in case of a cycle
        System.out.print(current.val + " ");
        current = current.next;
        count++;
    }
    System.out.println();
}

public static void main(String[] args) {
    // Create a linked list with a loop: 1 -> 2 -> 3 -> 4 -> 5 -> 3 (to create a loop)
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next = head.next.next;  // Creating a loop

    // Display the original linked list
    displayList(head, "Original Linked List");

    // Check if there's a cycle
    boolean hasCycle = LeetCodeQues8.detectCycle(head);
    System.out.println("Has Cycle: " + hasCycle);

    // Remove the cycle if present
    if (hasCycle) {
        LeetCodeQues8.removeCycle(head);
        System.out.println("Cycle Removed");
    }

    // Display the linked list after removing the cycle
    displayList(head, "Linked List after Removing the Cycle");
}

}