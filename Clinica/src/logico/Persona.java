package logico;

public abstract class Persona {
	protected String Cedula;
	protected String nombre;
	protected String apellido;
	protected String Telefono;
	public Persona(String cedula, String nombre, String apellido, String telefono) {
		super();
		Cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		Telefono = telefono;
	}
	public String getCedula() {
		return Cedula;
	}
	public void setCedula(String cedula) {
		Cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	
}
