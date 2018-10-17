package model;

import java.sql.Date;

public class GamerDTO {
	
	private String pseudo;
	private Date create_at;
	
	public GamerDTO() {
		super();
	}
	
	public GamerDTO( String pseudo) {
		super();
		this.pseudo = pseudo;
	}

	public String getPseudo() {
		return pseudo;
	}

	public Date getCreate_at() {
		return create_at;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	
}
