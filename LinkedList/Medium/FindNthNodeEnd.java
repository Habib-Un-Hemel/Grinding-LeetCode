public class  FindNthNodeEnd {
    public static class  Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    //leetcode problem I need to solve the function itself
    public static Node nthNode(Node head,int n){
        int size = 0;
        Node temp =head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int m = size - n +1;
        //find mth Node (which is from fast)
        
        Node temp2 = head;
        for(int i=1; i <= m-1;i++){
            temp2 = temp2.next;
        }
        return temp2;        
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
        Node temp = nthNode(a,1);
        System.out.println(temp.data);
    }
}

