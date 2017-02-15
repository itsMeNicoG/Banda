package logica;

public class Ins_Violin extends Instrumento {

	public Ins_Violin(){
		super();
		this.setNombre("Violin Stradivarius");
		this.setTipo("El violin del diablo ");
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
		//se dibujara el violin
		return "Violin";		
	}


}
