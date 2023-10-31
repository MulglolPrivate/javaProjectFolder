import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

public class filterActionListener implements ActionListener{

    private static JTextArea outputTextArea;

    public filterActionListener(JTextArea outputTextArea){
        this.outputTextArea = outputTextArea;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        outputTextArea.setText("May It work");
    }

}