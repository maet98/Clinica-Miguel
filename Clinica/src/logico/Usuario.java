package logico;

public class Usuario {
	private String nombre;
	private String cuenta;
	private String contrasenna;
	private String Tipo;
	public Usuario(String nombre, String cuenta, String contrasenna, String tipo) {
		super();
		this.nombre = nombre;
		this.cuenta = cuenta;
		this.contrasenna = contrasenna;
		Tipo = tipo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public String getContrasenna() {
		return contrasenna;
	}
	public void setContrasenna(String contrasenna) {
		this.contrasenna = contrasenna;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	
}
