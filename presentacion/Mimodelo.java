package presentacion;

import java.util.Random;
import logica.Banda;

public class Mimodelo {
	private Banda miBanda;
	private VistaBanda miventana;
	
	Random num_musicosRan;
	
	public void iniciar() {
		getVentanaInicial().setSize(450, 600);
		getVentanaInicial().setVisible(true);
	}

	public VistaBanda getVentanaInicial() {
		if (miventana == null) {
			miventana = new VistaBanda(this);
		}
		return miventana;
	}
	public Banda getMiBanda(){
		if(this.miBanda ==null){
			miBanda= new Banda();
		}
		return miBanda;		
	}
	
	public void contratar(){
		getMiBanda().llamarMusicos((int) ( new Random().nextDouble()*7 + 3) );
		getVentanaInicial().getTxtBandaTocando().setText( getMiBanda().verbanda());				
	}

	public void vizualizar(){
		getVentanaInicial().getTxtBandaTocando().setText( getMiBanda().verbanda());				
	}
	
	
}
