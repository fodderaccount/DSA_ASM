public class QueueMessage {
    Node front, rear;

    public QueueMessage() {
        this.front = this.rear= null;
        
    }
    public void enQueue(Text mess){
        Node temp =new Node(mess);
        if(this.rear == null){
            this.front = this.rear =temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }

    public void dequeue()
    {
        // If queue is empty, return NULL.
        if (this.front == null)
            return;
 
        // Store previous front and move front one node
        // ahead
        Node temp = this.front;
        this.front = this.front.next;
 
        // If front becomes NULL, then change rear also as
        // NULL
        if (this.front == null)
            this.rear = null;
    }

}
