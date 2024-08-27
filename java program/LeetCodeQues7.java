class LeetCodeQues7{
    public ListNode getMiddle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while (fast.next!=null&&slow.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while (curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head){
        if(head==null||head.next==null){
            return true;
        }
        ListNode firstHalfEnd=getMiddle(head);
        ListNode secondHalfStart=reverse(firstHalfEnd.next);
        ListNode firstHalfStart=head;
        while(secondHalfStart!=null){
            if(secondHalfStart.val!=firstHalfStart.val){
                return false;
            }
            secondHalfStart=secondHalfStart.next;
            firstHalfStart=firstHalfStart.next;
        }
        return true;

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
              // Creating a sample linked list: 1 -> 2 -> 3 -> 2 -> 1
              ListNode head = new ListNode(1);
              head.next = new ListNode(2);
              head.next.next = new ListNode(3);
              head.next.next.next = new ListNode(2);
              head.next.next.next.next = new ListNode(1);
      
              System.out.println("Original Linked List:");
              printLinkedList(head);
      
              LeetCodeQues7 solution = new LeetCodeQues7();
              boolean isPalindrome = solution.isPalindrome(head);
      
              System.out.println("\nIs Palindrome: " + isPalindrome);
      
    }     
}