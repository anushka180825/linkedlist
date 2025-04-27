public class linkedlist_length{
    public static class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
    }
    public static int length (Node data){
        int count =0;
        while (data!=null){
        count++;
        data=data.next;
    }
    return count;
    }
    public static void main(String[]args){
        Node a=new Node(5);
        Node b=new Node(15);
        Node c=new Node(25);
        Node d=new Node(35);
        Node e=new Node(45);
        Node f=new Node(55);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        System.out.println(length(a));

    }
}
