public class TestClass {
    public static void main(String[] args) {
        MessageService theMessage = new MessageService(new GuiMessageStrategy(), new GuiOutputMessageStrategy());
        theMessage.outputMessage();
    }
}