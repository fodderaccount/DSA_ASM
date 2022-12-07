public class Message {
    private String sender;
    private String message;

    public Message() {
        this.message = "";
    }

    public Message(String mess) {
        this.message = mess;
    }

    public String getMessage() {
        return this.message;
    }

   
    public void setMessage(String str) {
        
            this.message = str;
            
    }
        
        
       

    public String getSender() {
        return this.sender;
    }

    public void setSender(String name) {
        this.sender = name;
    }

}
