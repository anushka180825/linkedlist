class All_linkedlistmethod_in_one{
       public static class Node {
            int val;
            Node next;

            Node(int val) {
                this.val = val;
            }

            public static class SLL {
                private Node head;
                private Node tail;
                private int size;

                void insertAtTail(int val) {
                    Node temp = new Node(val);
                    if (head == null) head = tail = temp;
                    else {
                        tail.next = temp;
                        tail = temp;
                    }
                    size++;
                }

                void insertAthead(int val) {
                    Node temp = new Node(val);
                    if (head == null) head = tail = temp;
                    else {
                        tail.next = head;
                        head = temp;
                    }
                    size++;
                }

                void insert(int idx, int val) {
                    if (idx == 0) {
                        insertAthead(val);
                        return;
                    }
                    if (idx == size) {
                        insertAtTail(val);
                        return;
                    }
                    if (idx > size || idx < 0) {
                        System.out.println("invalid index");
                        return;
                    }
                    Node temp = new Node(val);
                    Node x = head;
                    for (int i = 1; i <= idx - 1; i++) {
                        temp.next = x.next;
                        x.next = temp;
                        size++;
                    }

                }

                int get(int idx) throws Error {
                    if (idx==size-1)return tail.val;
                    if(idx>=size||idx<0)     {
                        throw new Error("error");
                    }
                    Node temp = head;
                    for (int i = 1; i <= idx; i++) {
                        temp = temp.next;
                    }
                    return temp.val;
                }

                void set(int idx, int val) throws Error {
                    if (idx == size - 1) {
                        tail.val = val;
                    }
                    if (idx > size || idx < 0) {
                        throw new Error("error");
                    }
                    Node temp = head;
                    for (int i = 1; i <= idx; i++) {
                        temp = temp.next;
                    }
                    temp.val = val;
                }

                void deleteAthead() throws Error {
                    if (head == null) throw new Error("list is empty");
                    head = head.next;
                    size--;
                }

                void delete(int idx) throws Error {
                    if (idx == 0) {
                        deleteAthead();
                        return;
                    }
                    if (idx < 0 || idx > size)
                        throw new Error("invalid");

                    Node temp = head;
                    for (int i = 1; i <= idx - 1; i++) {
                        temp = temp.next;
                    }
                    if (temp.next == tail) tail = temp;
                    temp.next = temp.next.next;
                    size--;
                }

                void display() {
                    Node temp = head;
                    while (temp != null) {
                        System.out.print(temp.val + " ");
                        temp = temp.next;
                    }
                    System.out.println();
                }

                void size() {
                    System.out.println("size :" + size);
                }

                public static void main(String[] args) {
                    SLL list = new SLL();
                    list.insertAtTail(23);
                    list.insertAtTail(13);
                    list.insertAtTail(33);
                    list.insertAtTail(73);
                    list.display();
                    list.get(1);
                    list.display();
                    list.set(2,22);
                    list.display();
                    list.deleteAthead();
                    list.display();
                    list.delete(2);
                    list.display();
                    System.out.println(list.size);

                }

            }
        }

    }
