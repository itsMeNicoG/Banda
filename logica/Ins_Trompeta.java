package logica;

public class Ins_Trompeta extends Instrumento {

	public Ins_Trompeta(){
		super();
		this.setNombre("Trompeta Yamaha");
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
		//se dibujara la trompeta
		return "Trompeta";		
	}


}
