import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class createGui {

    
    public static void createGUI() {
        // Erstelle das Haupt-Fenster
        JFrame frame = new JFrame("Mein GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Erstelle ein Panel, um Komponenten hinzuzufügen
        JPanel panel = new JPanel();

        // Erstelle zwei Textfelder
        JTextField impuTextField = new JTextField(20);
        JTextArea outputTextArea = new JTextArea();

        outputTextArea.setFocusable(false);
        

        // Erstelle vier Buttonsvoid
        JButton filterChromosomButton = new JButton("Filter nach Chromosomen");
        JButton getDataFade = new JButton("Lade eine Datei");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");

        filterChromosomButton.addActionListener(new filterActionListener(outputTextArea));
        getDataFade.addActionListener(new explorer());



        // Füge die Komponenten zum Panel hinzu
        panel.add(impuTextField);
        panel.add(outputTextArea);
        panel.add(filterChromosomButton);
        panel.add(getDataFade);
        panel.add(button3);
        panel.add(button4);

        // Füge das Panel zum Haupt-Fenster hinzu
        frame.add(panel);

        // Zeige das GUI-Fenster an
        frame.setVisible(true);
    }

    
}
