package ecrans;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import utilitaires.Parametres;

public class EcranAccueil extends Ecran {

	private JLabel title ;
	private JButton partie ;
	private JButton reglages ;
	private JButton aPropos ;
	private Image background = Toolkit.getDefaultToolkit().createImage("Background.png");
	
	
	public EcranAccueil(MainCard mainCard) {
		this.mainCard = mainCard ;
		this.mainCard.add(this,MainCard.ECRAN_HOME_KEY) ;
		buildComponent();
		addListener();
	}
	
	private void buildComponent() {
		title = new JLabel(Parametres.APP_NAME) ;
		title.setForeground(Color.BLACK);
		title.setFont(new Font(title.getFont().getFontName(), Font.BOLD,30));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setVerticalAlignment(SwingConstants.CENTER);
		
		partie = new JButton("Nouvelle Partie") ;
		partie.setBackground(Color.GRAY);
		
		reglages = new JButton("Paramètres") ;
		reglages.setBackground(Color.GRAY);
		
		aPropos = new JButton("A Propos") ;
		aPropos.setBackground(Color.GRAY);
		
		setLayout(new BorderLayout());
		
		GridLayout layoutMenu = new GridLayout(3, 1) ;
		layoutMenu.setVgap(30);
		JPanel center = new JPanel(layoutMenu) ;
		
		// background
		//center.drawImage(background, 0, 0, null);
		//center.
		
		center.add(partie) ;
		center.add(reglages);
		center.add(aPropos);
		
		add(title, BorderLayout.NORTH) ;
		add(center,BorderLayout.CENTER) ;
	}
	
	public void addListener() {
		partie.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mainCard.showEcranJeu();
			}
		});
		
		aPropos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mainCard.showEcranApropos();
				
			}
		});
	}
}
