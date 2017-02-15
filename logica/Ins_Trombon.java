package logica;

public class Ins_Trombon extends Instrumento {

	public Ins_Trombon(){
		super();
		this.setNombre("Trombon Yamaha");
		this.setTipo(":v");
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
		//se dibujara el trombon
		return "Trombon";		
	}


}
