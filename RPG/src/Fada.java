
public class Fada extends ReinoG {

	private int durabilidadeMagica;

	Fada(){
		
		durabilidadeMagica = 10;
	}
	
	public int getDurabilidadeMagica() {
		return durabilidadeMagica;
	}

	public void setDurabilidadeMagica(int durabilidadeMagica) {
		this.durabilidadeMagica = durabilidadeMagica;
	}
	
	public int incluirPontosDeVida(){
		
		durabilidadeMagica = durabilidadeMagica -1;
		if(durabilidadeMagica>0){
			return 3;
		}else {
			return 0;
		}
}
	public int usarMagia(){
		durabilidadeMagica = durabilidadeMagica -1;
		if(durabilidadeMagica>0){
			return 1;
		}else {
			return 0;
		}
}


	
}
