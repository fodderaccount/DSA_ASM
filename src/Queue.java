
public class Queue { 
	private Node head; 
	private Node tail;
	private int size;
	
	public Queue() {
		this.size = 0;
		this.head = null;
		this.tail = null;
	} 

	public void enqueue(Node node) {
		if (this.isEmpty()) {
			this.head = node;
			this.tail = node;
			this.size++;
			return;
		}
		
		this.tail.next = node; 
		this.tail = node;

		this.size++;
	}

	public Node dequeue() {
		if (this.isEmpty()) {
			System.out.print("Queue is empty \n"); 
			return null;
		}
		Node node = this.head;
		this.head = this.head.next;
		this.size--; 
		return node;
	}

	public boolean isEmpty() {  
		return (this.size == 0);
	}  
	
	public void print() {
		System.out.print("Queue: \n");  
		Node node = this.head;
		while (node != null) {
			node.printData();
			node = node.next;
		}
	} 
}
