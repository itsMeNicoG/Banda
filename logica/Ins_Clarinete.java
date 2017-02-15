package logica;

public class Ins_Clarinete extends Instrumento {

	public Ins_Clarinete(){
		super();
		this.setNombre("Clarinete Yamaha");
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
		//se dibujara el clarinete
		return "Clarinete";		
	}


}
