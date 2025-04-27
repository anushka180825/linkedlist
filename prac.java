public class prac {
    public static class Node {
        int val;
        Node next;

         Node(int val) {
            this.val =val;
        }

        public static class linkedlist{
            Node head = null;
            Node tail = null;
            void insertatend (int val){
            Node temp = new Node(val);
            if (head == null){
                head=temp;
            }
            else {
                tail.next = temp;
            }
            tail = temp;
        }
            void display () {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
        }

        }

        public static void main(String[] args) {
            linkedlist ll = new linkedlist();
            ll.insertatend(2);
            ll.display();
            ll.insertatend(4);
            ll.insertatend(6);
            ll.insertatend(8);
            ll.insertatend(10);
            ll.display();

        }
    }
}