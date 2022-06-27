package sql;
import java.sql.Connection;

import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class conectionsql {
	Connection conn = null;
	String url = "jdbc:postgresql://localhost:5432/Telefonia";
	String usuario = "postgres";
	String clave = "123456";
	
	
	public Connection conectar() {
		
		try {
			Class.forName("org.postgresql.Driver");
			conn=DriverManager.getConnection(url,usuario,clave );
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro al conectar" +e, "Error", JOptionPane.ERROR_MESSAGE);
		}
	return conn;
		
	}
	
}