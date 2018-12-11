package logico;

import java.time.LocalDate;

public class Doctor extends Persona {
	private Paciente[] pacientes;
	private float balance;
	private boolean activo;
	public Doctor(String cedula, String nombre, String apellido, LocalDate FechaNacimiento, String genero, String email,
			Paciente[] pacientes, float balance, boolean activo) {
		super(cedula, nombre, apellido, FechaNacimiento, genero, email);
		this.pacientes = pacientes;
		this.balance = balance;
		this.activo = activo;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public Paciente[] getPacientes() {
		return pacientes;
	}
	
}
