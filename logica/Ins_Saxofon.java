package logica;

public class Ins_Saxofon extends Instrumento {

	public Ins_Saxofon(){
		super();
		this.setNombre("Saxofon Yamaha");
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
		//se dibujara el saxofon
		return "Saxofon";		
	}


}
