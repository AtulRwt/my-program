import java.util.Scanner;
class ListNode {
    int val;
    ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class addTwoLinkedList{
    public static ListNode addTwoLL(ListNode l1,ListNode l2){
        ListNode dummyNode=new ListNode(0);
        ListNode cuurentNode=dummyNode;
        int carry=0;
        while(l1!=null||l2!=null||carry!=0){
            int digit1=(l1!=null)?l1.val:0;
            int digit2=(l2!=null)?l2.val:0;
            int sum=digit1+digit2+carry;
            int digit=sum%10;
            carry=sum/10;
            ListNode newNode=new ListNode(digit);
            cuurentNode.next=newNode;
            cuurentNode=cuurentNode.next;
            l1=(l1!=null)?l1.next:null;
            l2=(l2!=null)?l2.next:null;
        }
        ListNode result=dummyNode.next;
        dummyNode.next=null;
        return result;
    }
    public static void main(String args[]){
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3))); // representing the number 342
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4))); // representing the number 465
    
        // Perform addition and print the result
        ListNode result = addTwoLL(l1, l2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }

    }
}