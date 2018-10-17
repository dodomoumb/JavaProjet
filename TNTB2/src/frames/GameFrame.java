package frames;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GameFrame extends JPanel {
	
	private JButton save;

	public GameFrame() {
	     setName("sauvegarder Partie");
		 save = new JButton("Save");
		 buildeInterfaz();
		// setLayout(getLayout().BorderLayout);
		
	}

	private void buildeInterfaz() {
		JLabel pseudolbl = new JLabel("Entrez votre Pseudo");
		JTextArea pseudoInput = new JTextArea(1,1);
		pseudoInput.setEditable(true);
		add(pseudolbl);
		add(pseudoInput);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new GameFrame();
	}

}
