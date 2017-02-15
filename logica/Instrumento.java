package logica;

public abstract class Instrumento implements Dibujable {

	private String tipo;
	private String nombre;
	private String afinacion;
	
	public   Instrumento(){
		
	}
	
	//metodos abstractos
	abstract public  String tocar(String nota);
	abstract public String afinar(String nota);
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAfinacion() {
		return afinacion;
	}

	public void setAfinacion(String afinacion) {
		this.afinacion = afinacion;
	}
	
}
