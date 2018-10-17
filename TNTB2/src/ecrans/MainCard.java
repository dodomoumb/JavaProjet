package ecrans;

import java.awt.CardLayout;

import javax.swing.JPanel;

public class MainCard extends JPanel{
	
	public static final String ECRAN_JEU_KEY = "ecran.jeu" ;
	public static final String ECRAN_APROPOS_KEY = "ecran.apropos" ;
	public static final String ECRAN_HOME_KEY = "ecran.accueil" ;
	//public static final String ECRAN_SAVEGAME_KEY = "ecran.save";
	
	private final CardLayout layout = new CardLayout() ;
	
	public MainCard() {
		setLayout(layout);
	}

	public void showEcranAccueil() {
		layout.show(this, ECRAN_HOME_KEY);
	}
	
	public void showEcranJeu() {
		layout.show(this, ECRAN_JEU_KEY);
	}
	
	public void showEcranApropos() {
		layout.show(this, ECRAN_APROPOS_KEY);
	}
	
//	public void showEcranGameFrame() {
//		layout.show(this, ECRAN_SAVEGAME_KEY);
//	}
}
