public class LinkedList {

    private Node head;
    private Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int data) {

        if (this.head == null) {
            Node newNode = new Node(data);
            this.head = newNode;
            this.tail = newNode;

        } else {
            Node newNode = new Node(data);
            tail.setNext(newNode);
            tail = newNode;
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

    public int getSize() {
        int size = 0;
        Node current = head;
        while (current != null) {
            current = current.getNext();
            size++;
        }
        return size;
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
        System.out.println("The current list size is: " + myLl.getSize());
        myLl.remove(20);
        myLl.printLL();
        System.out.println("The current list size is: " + myLl.getSize());
    }
}
