import presentacion.Mimodelo;

public class Launcher {
	Mimodelo model;
	public Launcher(){
		model= new Mimodelo();
		model.iniciar();
	}
	public static void main(String[] args){
		 new Launcher();
	}

}
