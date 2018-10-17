package model;

import java.sql.Date;

public class ScoreDTO {
	private int id;
	private int duree_seconde;
	private int nb_click;
	private int id_gamer;
	private int id_level;
	private int id_strategy;
	private Date create_at;
	
	public ScoreDTO() {
		super();
	}
	
	
	/**
	 * @param duree_seconde
	 * @param nb_click
	 * @param id_gamer
	 * @param id_level
	 * @param id_strategy
	 */
	public ScoreDTO(int duree_seconde, int nb_click, int id_gamer, int id_level, int id_strategy) {
		super();
		this.duree_seconde = duree_seconde;
		this.nb_click = nb_click;
		this.id_gamer = id_gamer;
		this.id_level = id_level;
		this.id_strategy = id_strategy;
	}


	public int getId() {
		return id;
	}


	public int getDuree_seconde() {
		return duree_seconde;
	}


	public int getNb_click() {
		return nb_click;
	}


	public int getId_gamer() {
		return id_gamer;
	}


	public int getId_level() {
		return id_level;
	}


	public int getId_strategy() {
		return id_strategy;
	}


	public Date getCreate_at() {
		return create_at;
	}


//	public void setId(int id) {
//		this.id = id;
//	}


	public void setDuree_seconde(int duree_seconde) {
		this.duree_seconde = duree_seconde;
	}


	public void setNb_click(int nb_click) {
		this.nb_click = nb_click;
	}


	public void setId_gamer(int id_gamer) {
		this.id_gamer = id_gamer;
	}


	public void setId_level(int id_level) {
		this.id_level = id_level;
	}


	public void setId_strategy(int id_strategy) {
		this.id_strategy = id_strategy;
	}


	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}
	
	
	
	

}
