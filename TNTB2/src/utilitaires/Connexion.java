package utilitaires;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import frames.Jeu;

public abstract class Connexion {
	
	private static Connection con = null;
	private static String bddAdresse = "//localhost:8889/tntb" ;	// L'adresse de la base de données.
	private static String driver = "com.mysql.cj.jdbc.Driver";  
	

	
	private static void Connexion() {
		
		// Chargement du Driver MySQL
		try {
			Class.forName(driver);
			System.out.println("download of driver OK !"); // chargement du pilote réussie
		   } 
		catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		    }
		
		// Chargement de la base de données
		try {
			
			     // Options de connections, par exemple, le Time Zone
			String optionsConnection = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC ";
			   
			String url = "jdbc:mysql:" + bddAdresse + optionsConnection;   // L'url complète de connexion
			
			     // Identifiants de connexion à la BD
			String user = "root"; 
			String password = "root";
			// L’objet connexion qui nous permet de communiquer avec la BD
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection OK ! "); 
				
		} 
		catch (SQLException e) {
			System.out.println(e.getMessage());
			}
		
	} // fin Connexion


	

	public static synchronized Connection getConnexion() {
		if (con == null) {
			// alors Créer l'instance connexion
		Connexion();
		}
		return con;
	}


} /// class