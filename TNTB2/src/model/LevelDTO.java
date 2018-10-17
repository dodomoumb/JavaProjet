package model;

import java.sql.Date;

public class LevelDTO {
	private int id;
	private String libelle;
	private int nbL;
	private int nbC;
	
	public LevelDTO() {
		super();
		this.nbL = 6;
		this.nbC = 6;
		this.libelle = "Facile";
	}
	
	public LevelDTO( String libelle) {
		super();
		this.libelle = libelle;
	}
	
	public int getId() {
		return id;
	}


	public String getLibelle() {
		return libelle;
	}

	public int getNbL() {
		return nbL;
	}

	public int getNbC() {
		return nbC;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public void setNbL(int nbL) {
		this.nbL = nbL;
	}

	public void setNbC(int nbC) {
		this.nbC = nbC;
	}

		
}
