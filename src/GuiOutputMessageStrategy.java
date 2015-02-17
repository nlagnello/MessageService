
import javax.swing.JOptionPane;

public class GuiOutputMessageStrategy implements OutputMessageStrategy{

    @Override
    public void outputMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
}