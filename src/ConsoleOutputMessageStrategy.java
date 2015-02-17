public class ConsoleOutputMessageStrategy implements OutputMessageStrategy {

    @Override
    public void outputMessage(String message) {
        System.out.println(message);
    }
    
}