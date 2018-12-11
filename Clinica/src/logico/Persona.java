package logico;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Persona {
	protected String Cedula;
	protected String nombre;
	protected String apellido;
	protected ArrayList<String> telefono;
	protected LocalDate FechaNacimiento;
	protected String genero;
	protected String email;
	
	public Persona(String cedula, String nombre, String apellido,LocalDate FechaNacimiento, String genero, String email) {
		super();
		Cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.FechaNacimiento = FechaNacimiento;
		this.genero = genero;
		this.email = email;
	}
	
	public int getEdad() {
		return AgeCalculator.calculateAge(FechaNacimiento, LocalDate.now());
	}

	public void setFechaNacimiento(LocalDate FechaNacimiento) {
		this.FechaNacimiento = FechaNacimiento;
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

	public void setTelefono(ArrayList<String> telefono) {
		this.telefono = telefono;
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
	public ArrayList<String> getTelefono() {
		return telefono;
	}
	public void addTelefono(String tele) {
		telefono.add(tele);
	}
}
