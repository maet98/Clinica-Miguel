package logico;

import java.time.LocalDateTime;

public class Recibo {
	private int id;
	private String Descripcion;
	private Paciente paciente;
	private Doctor doctor;
	private float abono;
	private LocalDateTime fechaRecibo;
	private Usuario usuario;
	public Recibo(int id, Paciente paciente,String Descripcion, Doctor doctor, float abono, LocalDateTime fechaRecibo, Usuario usuario) {
		super();
		this.id = id;
		this.Descripcion = Descripcion;
		this.paciente = paciente;
		this.doctor = doctor;
		this.abono = abono;
		this.fechaRecibo = fechaRecibo;
		this.usuario = usuario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public float getAbono() {
		return abono;
	}
	public void setAbono(float abono) {
		this.abono = abono;
	}
	public LocalDateTime getFechaRecibo() {
		return fechaRecibo;
	}
	public void setFechaRecibo(LocalDateTime fechaRecibo) {
		this.fechaRecibo = fechaRecibo;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
}
