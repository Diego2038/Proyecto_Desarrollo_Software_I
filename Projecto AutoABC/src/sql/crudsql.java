package sql;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;

import getset.variable;

public class crudsql extends conectionsql {
	
	java.sql.Statement st;
	ResultSet rs;
	variable var = new variable();
	 
	public void insertar(String cliente_id, String name, String telefono, String direccion, String entidad) {
		try {
			Connection conexion = conectar();
		    st = conexion.createStatement();
			String sql = "insert into cliente(cliente_id, name, telefono, direccion, entidad) values('"+cliente_id+"', '"+name+"', '"+telefono+"', '"+direccion+"', '"+entidad+"') ";
			st.execute(sql);
			st.close();
			conexion.close();
			JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "El registro no se guardo correctamente"+e, "Mensaje", JOptionPane.ERROR_MESSAGE);
		}
	}

	
	
	public void insertarUsuarios(String usuario_id, String name, String contrasena, String cargo, String estado) {
		try {
			Connection conexion = conectar();
		    st = conexion.createStatement();
			String sql = "insert into usuario(usuario_id, name, cargo, contrasena, estado) values('"+usuario_id+"', '"+name+"', '"+contrasena+"', '"+cargo+"', '"+estado+"') ";
			st.execute(sql);
			st.close();
			conexion.close();
			JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Mendaje", JOptionPane.INFORMATION_MESSAGE);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "El registro no se guardo correctamente"+e, "Mendaje", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	
	
	
	public void mostrar(String usuario_id) {
		
		try {
			Connection conexion = conectar();
			st = conexion.createStatement();
			String sql = "select * from usuario where usuario_id = '"+usuario_id+"' ;";
			rs=st.executeQuery(sql);
			if(rs.next()) {
				var.setUsuario_id(rs.getString("usuario_id"));
				var.setUsuario_name(rs.getString("name"));
				var.setUsuario_contrasena(rs.getString("contrasena"));
				var.setUsuario_cargo(rs.getString("cargo"));
			}else {
				var.setUsuario_id("");
				var.setUsuario_name("");
				var.setUsuario_contrasena("");
				var.setUsuario_cargo("");
				JOptionPane.showMessageDialog(null, "No se encontro Registro", "Sin Registro", JOptionPane.INFORMATION_MESSAGE );
			}
			
			st.close();
			conexion.close();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error en el sistema de Busqueda", "Error Busqueda", JOptionPane.ERROR_MESSAGE );
		}
		
	}
	
	
	
	  public void mostrarUsuario(String usuario_id) {
			
			try {
				Connection conexion = conectar();
				st = conexion.createStatement();
				String sql = "select * from usuario where usuario_id = '"+usuario_id+"' ;";
				rs=st.executeQuery(sql);
				if(rs.next()) {
					var.setUsuario_estado(rs.getString("estado"));
					
				}else {
					var.setUsuario_estado("");
					
					JOptionPane.showMessageDialog(null, "No se encontro Registro", "Sin Registro", JOptionPane.INFORMATION_MESSAGE );
				}
				
				st.close();
				conexion.close();
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error en el sistema de Busqueda", "Error Busqueda", JOptionPane.ERROR_MESSAGE );
			}
			
		}
	  
	  
	  
	  
	  public void IniciarUsuario(String usuario_id) {
			
			try {
				Connection conexion = conectar();
				st = conexion.createStatement();
				String sql = "select * from usuario where usuario_id = '"+usuario_id+"' ;";
				rs=st.executeQuery(sql);
				if(rs.next()) {
					var.setUsuario_estado(rs.getString("estado"));
					
				}else {
					var.setUsuario_estado("");
					
					JOptionPane.showMessageDialog(null, "No se encontro Registro", "Sin Registro", JOptionPane.INFORMATION_MESSAGE );
				}
				
				st.close();
				conexion.close();
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error en el sistema de Busqueda", "Error Busqueda", JOptionPane.ERROR_MESSAGE );
			}
			
		}
		
	  
	  
	  
	  public String mostrarTabla() {
			
			String texto = "";
			
			try {
				Connection conexion = conectar();
				st = conexion.createStatement();
				ResultSet respuesta = st.executeQuery("Select * from usuario");
				
				while (respuesta.next()) {
					
					texto = texto + respuesta.getString("usuario_id") + "   " + respuesta.getString("name")  + "   " + respuesta.getString("cargo")  + "   " + respuesta.getString("estado")+"/n";
					
				}
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			return texto;
		}
		
	
	  
	  public String Reporte() {
			
			String texto = "";
			
			try {
				Connection conexion = conectar();
				st = conexion.createStatement();
				ResultSet respuesta = st.executeQuery("Select * from cliente");
				
				while (respuesta.next()) {
					
					texto = texto + respuesta.getString("cliente_id") + "   " + respuesta.getString("name")  + "   " + respuesta.getString("telefono")  + "   " + respuesta.getString("direccion")
					+ "   " + respuesta.getString("entidad") +"\n";
					
				}
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			return texto;
		}
	  
	
	  
	
	public void actualizar(String name, String contrasena, String cargo, String usuario_id) {
		
		try {
			Connection conexion = conectar();
			st=conexion.createStatement();
			String sql="update usuario set name='"+name+"', contrasena='"+contrasena+"', cargo='"+cargo+"' where usuario_id ='"+usuario_id+"'; ";
			st.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "El registro se actualizo", "Exito", JOptionPane.INFORMATION_MESSAGE);
			
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al Actulizar"+e, "Error", JOptionPane.ERROR_MESSAGE);
	}
	
}	

	
	 
	
      public void activarUsuario( String estado, String usuario_id) {
		
		try {
			Connection conexion = conectar();
			st=conexion.createStatement();
			String sql="update usuario set estado='"+estado+"' where usuario_id ='"+usuario_id+"'; ";
			st.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "El registro se actualizo", "Exito", JOptionPane.INFORMATION_MESSAGE);
			
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al Actulizar"+e, "Error", JOptionPane.ERROR_MESSAGE);
	}
	
}	
	
      
      
      
	
	
}
