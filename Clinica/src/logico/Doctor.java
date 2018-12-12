package logico;

public class Doctor extends Persona {
	private Paciente[] pacientes;
	private float balance;
	private boolean activo;
	
	public Doctor(String cedula, String nombre, String apellido, String genero, String email,String Telefono, String Celular,
			Paciente[] pacientes, float balance) {
		super(cedula, nombre, apellido, genero, email, Telefono, Celular);
		this.pacientes = pacientes;
		this.balance = balance;
		this.activo = true;
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
