package LinkedList.Medium;

public class removing_Nth_node_from_end {
    public static class  Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static Node nthNode(Node head,int n){
        Node slow =head;
        Node fast =head;
        for(int i=1; i<=n;i++){
            fast = fast.next;
        }
        if(fast == null ){
            head = head.next;
            return head;
        }
        while (fast.next!=null) {
            fast =fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void display(Node head){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(4);
        Node c = new Node(5);
        Node d = new Node(2);
        Node e = new Node(9);   
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
       
        display(a);
        System.out.println();
         a= nthNode(a,5);
        display(a);

    }





}
