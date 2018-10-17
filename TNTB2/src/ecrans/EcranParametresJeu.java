package ecrans;

import java.awt.Color;
import java.awt.Dimension;

public class EcranParametresJeu extends Ecran {
	
	/* - Constantes de la grille - */
	private   int NB_L_DEFAUT ;
	private   int NB_C_DEFAUT ;
	private   Color COULEUR_DEB ;
	private   Color COULEUR_FIN;
	
	/* Constantes de la fen�tre */
	private  Dimension TAILLE_FENETRE_DEFAUT ;
	private String APP_NAME ;
	
	
	public EcranParametresJeu(int nB_L_DEFAUT, int nB_C_DEFAUT, Color cOULEUR_DEB, Color cOULEUR_FIN,
			Dimension tAILLE_FENETRE_DEFAUT, String aPP_NAME) {
		NB_L_DEFAUT = nB_L_DEFAUT;
		NB_C_DEFAUT = nB_C_DEFAUT;
		COULEUR_DEB = cOULEUR_DEB;
		COULEUR_FIN = cOULEUR_FIN;
		TAILLE_FENETRE_DEFAUT = tAILLE_FENETRE_DEFAUT;
		APP_NAME = aPP_NAME;
	}


	public int getNB_L_DEFAUT() {
		return NB_L_DEFAUT;
	}


	public int getNB_C_DEFAUT() {
		return NB_C_DEFAUT;
	}


	public Color getCOULEUR_DEB() {
		return COULEUR_DEB;
	}


	public Color getCOULEUR_FIN() {
		return COULEUR_FIN;
	}


	public Dimension getTAILLE_FENETRE_DEFAUT() {
		return TAILLE_FENETRE_DEFAUT;
	}


	public String getAPP_NAME() {
		return APP_NAME;
	}


	public void setNB_L_DEFAUT(int nB_L_DEFAUT) {
		NB_L_DEFAUT = nB_L_DEFAUT;
	}


	public void setNB_C_DEFAUT(int nB_C_DEFAUT) {
		NB_C_DEFAUT = nB_C_DEFAUT;
	}


	public void setCOULEUR_DEB(Color cOULEUR_DEB) {
		COULEUR_DEB = cOULEUR_DEB;
	}


	public void setCOULEUR_FIN(Color cOULEUR_FIN) {
		COULEUR_FIN = cOULEUR_FIN;
	}


	public void setTAILLE_FENETRE_DEFAUT(Dimension tAILLE_FENETRE_DEFAUT) {
		TAILLE_FENETRE_DEFAUT = tAILLE_FENETRE_DEFAUT;
	}


	public void setAPP_NAME(String aPP_NAME) {
		APP_NAME = aPP_NAME;
	}
	
	
	
	

}
