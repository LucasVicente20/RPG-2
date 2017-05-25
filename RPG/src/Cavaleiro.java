
public class Cavaleiro extends ReinoF {
	
private int durabilidadeEspada;
	
	//construtor
	Cavaleiro() {
		durabilidadeEspada = 10;
	}
	
	public int getDurabilidadeEspada() {
		return durabilidadeEspada;
	}

	public void setDurabilidadeEspada(int durabilidadeEspada) {
		this.durabilidadeEspada = durabilidadeEspada;
	}

	
	public int usarEspada(){
		
		durabilidadeEspada = durabilidadeEspada -1;
		if (durabilidadeEspada>0){
			return 1;
		}else {
			
			return 0;
		}
		
		
	}


}
