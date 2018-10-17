package model;

import utilitaires.Connexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.DefaultListModel;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import com.mysql.cj.xdevapi.Statement;
import java.sql.*;

//import GamerDTO;

public  class GamerDAO extends DAO {
	private Statement state;
	private Connection maConnextion = getConnexion();
	

	@Override
	public Object selectOne() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList selectAll() {
	
		//////// *********************  MA REQUETTE
		//ArrayList maliste = new ArrayList();
		       ArrayList maliste = new ArrayList<GamerDTO>();
		//Création d'un objet Statement
		
		//Connection con = getConnexion();  // passer url et autres
		//state = maConnextion.createStatement();

		
		//L'objet ResultSet contient le résultat de la requête SQL
	///	ResultSet result = state.executeQuery("SELECT * FROM gamer"); 
	//	java.sql.ResultSetMetaData resultMeta = result.getMetaData();//On récupère les Meta Data
		
		/////////  Afficher le resultat 
		
		//JList liste = new JList(maliste);
		//maliste.addElement("crée le :");
		//maliste.addElement("pseudo ");
		
//		
//		while(result.next()) {
//			String pseudo = result.getString("pseudo") ;
//			String created_at = result.getString("created_at") ;
//			GamerDTO agame = new GamerDTO(pseudo);
//			maliste.add(agame);
//			//System.out.println(nom_ville + " *********** " + cp + " "); 
//			}
		
	//	System.out.println(maliste.toString());
	 //////////////////// ************************$
	  
	 

		return null;
}

	@Override
	public int insert() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update() {
		// TODO Auto-generated method stub
		return 0;
	}

}


