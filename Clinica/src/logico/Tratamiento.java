package logico;

public class Tratamiento {
	private String Descripcion;
	private boolean activo;
	public Tratamiento(String descripcion) {
		super();
		Descripcion = descripcion;
		this.activo = true;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
}
