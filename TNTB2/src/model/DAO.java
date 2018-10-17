package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import com.mysql.cj.xdevapi.Statement;

import utilitaires.Connexion;

public abstract class DAO<T> {
	private static Connection connexion = null;
	
private static void Connexion() {
		
		
		try {
			
			Class.forName( "com.mysql.cj.jdbc.Driver" );
			
			String bddAdresse = "//localhost:8889/tntb" ;
			    
			String optionsConnection = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC ";
			     
			String url = "jdbc:mysql:" + bddAdresse + optionsConnection;
			String user = "root"; 
			String password = "root";
			
			
			connexion = DriverManager.getConnection(url, user, password);
			
			
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
			}
		
		
	}


	public static synchronized Connection getConnexion() {
		if (connexion == null) {
			// alors Créer l'instance connexion
			 Connexion();
		}
		return connexion;
	}
	
	
		
		public abstract T selectOne() ;
	 
	 // Sauvegarde sa propre class
	 public abstract void add();
	 
public abstract ArrayList selectAll();
 public abstract int insert(); 
 
 public abstract int delete();
 public abstract int update();




}
