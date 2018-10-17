package ecrans;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

//import frames.Apropos;
import graphique.Grille;
import utilitaires.Parametres;

public class EcranApropos extends Ecran{

	private JButton retour ;
	
	private JLabel labelText ;
	private JTextArea textArea;
	private Image background = Toolkit.getDefaultToolkit().createImage("Background.png");
	
	public EcranApropos(MainCard mainCard) {
		this.mainCard = mainCard ;
		this.mainCard.add(this,MainCard.ECRAN_APROPOS_KEY) ;
		this.textArea = new JTextArea();
		
		showText();
		addListener();
		
	}
	private JTextArea getTextArea() {
		return this.textArea;
	}

	private void setfondEcrand() {
		//this.fondEcrand = new ImageIcon("src/images/background1.jpg");
	}
	
	public void showText() {
		
		    //// LE TEXT AREA 
		String text = "Tout Noir Tout Blanc est un jeu implémenté en java / Swing ";
		
		String text1 =  "par les élèves de la promo M2iFormation CDI juin 2018.";
		
		String text2 = "Le jeu consiste à Cliquer jusqu'à ce que tout deviennent blanc ";
		
		
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		
		textArea.append(text1);
		textArea.append(text2);
		
		
	
		/// LE BOUTON
		retour = new JButton("Retour");
		
		
		
		//// LE LAYOUT
		BorderLayout layoutText = new BorderLayout() ;
		
		
		// LE PANEL
		JPanel textPanel = new JPanel(layoutText) ;
		//Appliquer le fond d'ecran ;
		//textPanel.setBackground(this.fondEcrand);
		////////////////////////////////// ICI   /////////////////////////
	         	//textPanel.drawImage(background, 0, 0, null);
		//textPanel.setBackground(Color.blue);
		textPanel.setPreferredSize(new Dimension(200, 200));
		
	
		
		
		// LES AJOUTS  au panel
		textPanel.add(retour, layoutText.NORTH) ;
		textPanel.add(textArea,layoutText.CENTER);
	
		
		
		// LES AJOUTS  au frame
	   add(textPanel,BorderLayout.CENTER) ;
		
		setOpaque(true);
		
	}
	
	private void addListener() {
		
		retour.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mainCard.showEcranAccueil();
			}
		});
	}
	

}
