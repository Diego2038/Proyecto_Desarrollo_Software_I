package getset;

import java.time.zone.ZoneOffsetTransition;

public class variable {

	private static String Usuario_id;
	private static String usuario_name;
	private static String usuario_cargo;
	private static String usuario_contrasena;
	private static String usuario_estado;
	
	private static String cliente_id;
	private static String cliente_name;
	private static String cliente_telefono;
	private static String cliente_direccion;
	private static String cliente_entidad;
	
	
	
	public static String getCliente_id() {
		return cliente_id;
	}
	public static void setCliente_id(String cliente_id) {
		variable.cliente_id = cliente_id;
	}
	public static String getCliente_name() {
		return cliente_name;
	}
	public static void setCliente_name(String cliente_name) {
		variable.cliente_name = cliente_name;
	}
	public static String getCliente_telefono() {
		return cliente_telefono;
	}
	public static void setCliente_telefono(String cliente_telefono) {
		variable.cliente_telefono = cliente_telefono;
	}
	public static String getCliente_direccion() {
		return cliente_direccion;
	}
	public static void setCliente_direccion(String cliente_direccion) {
		variable.cliente_direccion = cliente_direccion;
	}
	public static String getCliente_entidad() {
		return cliente_entidad;
	}
	public static void setCliente_entidad(String cliente_entidad) {
		variable.cliente_entidad = cliente_entidad;
	}
	
	
	
	public static String getUsuario_estado() {
		return usuario_estado;
	}
	public void setUsuario_estado(String usuario_estado) {
		this.usuario_estado = usuario_estado;
	}
	
	public String getUsuario_id() {
		return Usuario_id;
	}
	public void setUsuario_id(String usuario_id) {
		this.Usuario_id = usuario_id;
	}
	
	public String getUsuario_name() {
		return usuario_name;
	}
	public void setUsuario_name(String usuario_name) {
		this.usuario_name = usuario_name;
	}
	
	public String getUsuario_cargo() {
		return usuario_cargo;
	}
	public void setUsuario_cargo(String usuario_cargo) {
		this.usuario_cargo = usuario_cargo;
	}
	
	public String getUsuario_contrasena() {
		return usuario_contrasena;
	}
	public void setUsuario_contrasena(String usuario_contrasena) {
		this.usuario_contrasena = usuario_contrasena;
	}
	
}


