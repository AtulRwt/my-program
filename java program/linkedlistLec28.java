class linkedlist{
    Node head;
    private int size;
    linkedlist(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //add - first last
    public void addfirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return ;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return ;
        }
        Node currNode=head;
        while (currNode.next!=null) {
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    //print nodes
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode=head;
        while (currNode!=null) {
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public void deletefirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        head=head.next;
    }
    public void deletelast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;

        }
        secondLast.next=null;
    }
    public int getSize(){
        return size;
    }
    public void reverseIterate(){
        if (head==null||head.next==null){
            return;
        }

        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;


            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }
    public static void main(String args[]){
        linkedlist list=new linkedlist();
        list.addfirst("a");
        list.addfirst( "is");
        list.printList();
        list.addLast("list");
        list.printList();
        list.addfirst("this");
        list.printList();
        list.deletefirst();
        list.printList();
        list.deletelast();
        list.printList();
        System.out.println(list.getSize());
        list.addfirst( "this");
        list.printList();
        System.out.println(list.getSize());
        list.reverseIterate();
        list.printList();
    }
}