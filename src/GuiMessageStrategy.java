
import javax.swing.JOptionPane;

public class GuiMessageStrategy implements MessageStrategy{
     

    @Override
    public String displayMessage() {
        return JOptionPane.showInputDialog("What message would you like to display?");
    }

}