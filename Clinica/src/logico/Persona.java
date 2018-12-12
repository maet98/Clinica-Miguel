package logico;


public abstract class Persona {
	protected String Cedula;
	protected String nombre;
	protected String apellido;
	protected String[] telefono;
	protected String genero;
	protected String email;
	
	public Persona(String cedula, String nombre, String apellido, String genero, String email,String Telefono, String Celular) {
		super();
		Cedula = cedula;
		this.nombre = nombre;
		this.apellido =apellido;
		this.genero = genero;
		this.email = email;
		this.telefono = new String[2];
		telefono[0] = Telefono;
		telefono[1] = Celular;
	}
	
	

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
	
	public String[] getTelefono() {
		return telefono;
	}
	
}
