public class MessageService {
    
    private MessageStrategy message;
    private OutputMessageStrategy output;

    public MessageService(){
    }
    
    public MessageService(MessageStrategy theMessage, OutputMessageStrategy output){
        message = theMessage;
        this.output = output;
    }
    
    public MessageStrategy getMessage() {
        return message;
    }

    public void setMessage(MessageStrategy message) {
        this.message = message;
    }

    public OutputMessageStrategy getOutput() {
        return output;
    }

    public void setOutput(OutputMessageStrategy output) {
        this.output = output;
    }
    
    public String getMessageString() {
        return message.displayMessage();
    }
    
    public void outputMessage(){
        output.outputMessage(message.displayMessage());
    }
    
}