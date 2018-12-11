package logico;

import java.time.LocalDate;

public class Paciente extends Persona{
	private float balance;
	private Recibo[] recibos;
	private String Direccion;
	
	public Paciente(String cedula, String nombre, String apellido, LocalDate FechaNacimiento, String genero,
			String email, float balance, Recibo[] recibos, String direccion) {
		super(cedula, nombre, apellido, FechaNacimiento, genero, email);
		this.balance = balance;
		this.recibos = recibos;
		Direccion = direccion;
	}
	
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public Recibo[] getRecibos() {
		return recibos;
	}
	public void setRecibos(Recibo[] recibos) {
		this.recibos = recibos;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	
}
