package logica;

public class Ins_Arpa extends Instrumento {

	public Ins_Arpa(){
		super();
		this.setNombre("Arpa Erard");
		this.setTipo(":v");
		this.setAfinacion("Mi");
	}
	@Override
	public String tocar(String nota) {
		return "Esta sonando"+nota;
	}

	@Override
	public String afinar(String nota) {
		this.setAfinacion(nota);
		return getAfinacion();
	}

	@Override
	public String dibujar() {
		//se dibujara el arpa
		return "Arpa";		
	}


}
