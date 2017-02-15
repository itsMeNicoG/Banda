package logica;

import java.util.ArrayList;
import java.util.Random;

public class Banda {
	private ArrayList<Musico> integrante=new ArrayList<Musico>();
	private ArrayList<Instrumento> insParalabanda=new ArrayList<Instrumento>();
	private String[] nota = {"do","re", "mi", "fa", "sol", "la", "si"};
	private String visualbanda;
	
		
	public  Banda() {
		initInstparalabanda();
	}
	
	private void initInstparalabanda() {
		insParalabanda.add(new Ins_Arpa());
		insParalabanda.add( new Ins_Bajo() );
		
		insParalabanda.add(new Ins_Clarinete());
		insParalabanda.add( new Ins_Guitarra() );
		insParalabanda.add(new Ins_Saxofon());
		insParalabanda.add( new Ins_Triangulo() );
		insParalabanda.add(new Ins_Trombon());
		insParalabanda.add( new Ins_Trompeta() );
		insParalabanda.add(new Ins_Violin());
		
		
	}

	public void contratar_musicos( Musico musiconuevo, Instrumento instrumento){
		musiconuevo.asignarIntrumento(instrumento);
		this.integrante.add(musiconuevo);
	}

	public void tocar(int i){
		for(int k=0;k<this.integrante.size();k++){
			this.integrante.get(k).tocar(nota[0]);	
		}
	}
	public void afinar(int n_nota){
		
		for(int k=0;k<this.integrante.size();k++){
			this.integrante.get(k).afinar(nota[0]);	
		}
	}
	//recibimos un array de instrumentos al azar y 
	//se los asignamos a un musico nuevo, num musicos se recibe aleatorio
	public void llamarMusicos(int numMusicos){
		String auxNota=this.getNotaRand();
		integrante=new ArrayList<Musico>();
		for(int i=0;i<numMusicos;i++){
			this.contratar_musicos(new Musico(i), insParalabanda.get((int) (new Random().nextDouble()* insParalabanda.size()) ));
			integrante.get(i).getMiInstrumento().afinar(auxNota);
		}
	}
	

	public String verbanda(){
		visualbanda="Se contrataran "+ integrante.size() +" Musicos \n";
		
		for(int i=0;i<integrante.size();i++){
			visualbanda= visualbanda+
					"\n\n \t El musico "+ integrante.get(i).getNombre()
					+"\n tiene el instrumento: "+ integrante.get(i).getMiInstrumento().dibujar()
					+"\n afinado en: "+ integrante.get(i).getMiInstrumento().getAfinacion()
					+" " +integrante.get(i).tocar(this.getNotaRand()) ;
		}


		return visualbanda;
	}

	private String getNotaRand() {
		
		return nota[(int) (new Random().nextDouble()* nota.length) ];
	}
	
	
	
	
}
