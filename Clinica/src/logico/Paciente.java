package logico;

import java.time.LocalDate;
import java.util.ArrayList;

public class Paciente extends Persona{
	private float balance;
	private LocalDate FechaNacimiento;
	private ArrayList<Recibo> recibos;
	private String Direccion;
	
	public Paciente(String cedula, String nombre, String apellido, LocalDate FechaNacimiento, String genero,String Telefono, String Celular,
			String email, float balance, String direccion) {
		super(cedula, nombre, apellido, genero, email,Telefono, Celular);
		this.balance = balance;
		this.FechaNacimiento = FechaNacimiento;
		this.recibos = new ArrayList<>();
		Direccion = direccion;
	}
	
	public int getEdad() {
		return AgeCalculator.calculateAge(FechaNacimiento, LocalDate.now());
	}

	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public ArrayList<Recibo> getRecibos() {
		return recibos;
	}
	
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	
}
