package logica;

public class Ins_Bajo extends Instrumento {

	public Ins_Bajo(){
		super();
		this.setNombre("Bajo Ibanez de 4 cuerdas");
		this.setTipo("4 Cuerdas");
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
		return "bajo";		
	}


}
