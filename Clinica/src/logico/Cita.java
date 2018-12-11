package logico;

import java.time.LocalDateTime;

public class Cita {
	private Paciente paciente;
	private Doctor doctor;
	private LocalDateTime fecha;
	private String Descripcion;
	public Cita(Paciente paciente, Doctor doctor, LocalDateTime fecha, String descripcion) {
		super();
		this.paciente = paciente;
		this.doctor = doctor;
		this.fecha = fecha;
		Descripcion = descripcion;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
	
}
