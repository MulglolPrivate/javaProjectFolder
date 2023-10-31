import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

public class explorer implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Bag Files", "bag");
        fileChooser.setFileFilter(filter);

        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            fileChooser.getSelectedFile().getAbsolutePath();
        } else {
            // Benutzer hat den Auswahlvorgang abgebrochen
            
        }
    }

}