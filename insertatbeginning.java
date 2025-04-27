public class insertatbeginning {

        public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
            }
        }
        public static class linkedlist{
            Node head=null;
            Node tail=null;
            void insertAtEnd(int val){
                Node temp=new Node(val);
                if(head==null){
                    head=temp;
                }
                else{
                    tail.next=temp;
                }

                tail=temp;

            }
            void insertathead(int val){
                Node temp=new Node(val);
                if(head==null){
                    head=tail=temp;
                }else{
                    temp.next=head;
                    head=temp;
                }
            }
            void display(){
                Node temp=head;
                while(temp!=null){
                    System.out.print(temp.data+" ");
                    temp=temp.next;
                }
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
        }

    }

