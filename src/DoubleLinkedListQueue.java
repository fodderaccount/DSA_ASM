public class DoubleLinkedListQueue {
    // declaring an empty doubly linked list
    Node head = null;

    // Adding a node at the front of the list
    public void addHead(Text txt) {
        Node newNode = new Node(txt);
        newNode.next = head;

        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    public void addTail(Text txt) {

        if (head == null) {
            addHead(txt);
            return;
        }
        Node n = new Node(txt);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
        n.prev = temp;
    }

   public void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public void 

}
