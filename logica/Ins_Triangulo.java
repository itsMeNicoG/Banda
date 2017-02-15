package logica;

public class Ins_Triangulo extends Instrumento {

	public Ins_Triangulo(){
		super();
		this.setNombre("Triangulo Yamaha");
		this.setTipo("3 lados");
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
		//se dibujara el triangulo
		return "Triangulo";		
	}


}
