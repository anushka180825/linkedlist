class insertatgivenindex{
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

        void display() {
          Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
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
        ll.display();


    }


}

