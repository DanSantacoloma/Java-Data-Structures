public class LinkedList {

    private Node head;
    private Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int data) {

        if (this.head == null) {
            this.head = new Node(data);

        } else {
            Node newNode = new Node(data);
            newNode.setNext(head);
            head = newNode;
        }
    }

    public void remove(int data) {
        if (head == null) {
            return;
        }

        if (head.getData() == data) {
            head = head.getNext();
            return;
        }

        Node current = head;
        Node previous = null;
        while (current != null) {
            previous = current;
            current = current.getNext();
            if (current.getData() == data) {
                previous.setNext(current.getNext());
                return;
            }

        }

    }

    public void printLL() {
        Node current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    public static void main(String[] args) throws Exception {
        LinkedList myLl = new LinkedList();
        myLl.insert(15);
        myLl.insert(20);
        myLl.insert(25);
        myLl.insert(30);
        myLl.insert(35);
        myLl.insert(40);
        myLl.printLL();
        myLl.remove(20);
        myLl.printLL();
    }
}
