package uniandes.edu.co.proyecto.App;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class DataPanel extends JPanel {

	private JTextArea textArea;

    public DataPanel() {
        setBorder (new TitledBorder ("Info Panel"));
        setLayout( new BorderLayout( ) );
        
        textArea = new JTextArea("Results here");
        textArea.setEditable(false);
        add (new JScrollPane(textArea), BorderLayout.CENTER);
    }

    public void updateApp (String text) {
    	textArea.setText(text);
    }

}
