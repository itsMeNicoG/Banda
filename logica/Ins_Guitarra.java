package logica;

public class Ins_Guitarra extends Instrumento{

	public Ins_Guitarra(){
		super();
		this.setNombre("Guitarra Fender de 6 cuerdas");
		this.setTipo("6 Cuerdas");
		this.setAfinacion("Mi");
	}
	@Override
	public String tocar(String nota) {
		return "Esta sonando "+nota;
	}

	@Override
	public String afinar(String nota) {
		this.setAfinacion(nota);
		return getAfinacion();
	}

	@Override
	public String dibujar() {
		//se dibujara la guitarra
		return "Guitarra";		
	}



}
