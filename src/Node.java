public class Node {
	private Message data;
	public Node next;
	
	public Node(Message data) {
		this.data = data;
		this.next = null;
	} 
	
	public void printData() {
		System.out.println("Message from " + this.data.getSender() +" is " +this.data.getMessage());  
	}
}