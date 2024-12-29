package LinkedList.Medium;

public class FindNthNodeEnd_oneInteration {
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
        while (fast!=null) {
            fast =fast.next;
            slow = slow.next;
        }return slow;
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
        Node temp = nthNode(a,5);
        System.out.println(temp.data);
    }
}



