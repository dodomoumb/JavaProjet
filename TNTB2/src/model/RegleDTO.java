package model;

public class RegleDTO {
	private int id;
	private String titre;
	private String description;
	/**

	 * @param titre
	 * @param description
	 */
	public RegleDTO(String titre, String description) {
		super();
		this.titre = titre;
		this.description = description;
	}
	
	public RegleDTO() {
		super();
		this.titre = "Regle Simple";
	}

	public int getId() {
		return id;
	}

	public String getTitre() {
		return titre;
	}

	public String getDescription() {
		return description;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
