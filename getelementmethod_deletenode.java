public class getelementmethod_deletenode{

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist {
        Node head = null;
        Node tail = null;
        int size;
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }

            tail = temp;

        }

        void insertathead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void insert(int idx, int val) {
            Node temp = new Node(val);
            Node x = head;
            for (int i = 1; i <= idx - 1; i++) {
                x = x.next;
            }
            temp.next = x.next;
            x.next = temp;


        }
        int getAt(int idx){
            Node temp=head;
            for(int i=1;i<idx;i++){
                temp=temp.next;
            }
           return temp.data;
        }
        void deleteathead()throws Error{
            if(head==null)throw new Error("this is empty");
            head=head.next;
            size--;

        }
        void deleteat(int idx){
            Node temp=head;
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
    }

    public static void main(String[]args){
        linkedlist ll=new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.display();
        System.out.println();
        ll.insertathead(8);
        ll.display();
        ll.insert(1,8);
        ll.insertAtEnd(6);
        ll.insertathead(2);
        ll.display();
        System.out.println(ll.getAt(3));
        ll.deleteathead();
        ll.display();
        ll.deleteat(2);
        ll.display();
        ll.getAt(1);
        ll.display();


    }
}
