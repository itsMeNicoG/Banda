package logica;

public class Musico {
	
	private Instrumento miInstrumento;

	private String nombre;

	public Musico(){
		
	}
	public Musico(int i){
		setNombre(""+i);
	}
	public Musico(String name){
		setNombre(""+name);
	}
	
	public String tocar(String nota) {
		return this.miInstrumento.tocar(nota);
	}

	public void afinar(String nota) {
		this.miInstrumento.afinar(nota);
	}

	public void asignarIntrumento(Instrumento instrumento) {
		this.miInstrumento=instrumento;		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Instrumento getMiInstrumento() {
		return miInstrumento;
	}

}
