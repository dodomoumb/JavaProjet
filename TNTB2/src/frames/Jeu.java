package frames;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;

import ecrans.EcranAccueil;
import ecrans.EcranApropos;
import ecrans.EcranJeu;
import ecrans.MainCard;
import strategy.Regle;
import strategy.RegleSimple;
import utilitaires.Parametres;

public class Jeu extends JFrame{

	private EcranJeu ecranJeu ;
	private EcranAccueil ecranAccueil ;
	private EcranApropos ecranApropos ;
	private Regle regleSimple ;
	private GameFrame game ;
	
	public Jeu() {
		
		setTitle(Parametres.APP_NAME);
		setPreferredSize(Parametres.TAILLE_FENETRE_DEFAUT);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		MainCard cards = new MainCard() ;
		Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		cards.setBorder(padding);
		
		ecranAccueil = new EcranAccueil(cards);
		ecranApropos = new EcranApropos(cards);
		ecranJeu = new EcranJeu(cards);
		regleSimple = new RegleSimple(ecranJeu.getGrille()) ;
		regleSimple.apply();
		game = new GameFrame();
		
		// Card, MainCard se comporte 
		cards.showEcranApropos();
		cards.showEcranAccueil();
		//cards.showEcranGameFrame();
		
		getContentPane().add(cards);
		pack() ;
		setVisible(true);
	}
	
}
