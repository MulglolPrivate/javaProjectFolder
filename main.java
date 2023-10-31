

public class main {
    public static void main(String[] args) {
        
        createGui crrCreateGuiClass = new createGui();

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGui.createGUI();
            }
        });

    }
    
}