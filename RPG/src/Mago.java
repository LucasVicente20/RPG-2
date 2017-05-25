
public class Mago extends ReinoF {

private int quantidadePoMagico;
	
	Mago(){
		
		quantidadePoMagico = 10;
	}
	
	public int usarPoMagico(){
		
		quantidadePoMagico = quantidadePoMagico -1;
		if (quantidadePoMagico>0){
			return 1;
		}else {
			return 0;
		}
		
	}
	
	public int getQuantidadePoMagico() {
		return quantidadePoMagico;
	}

	public void setQuantidadePoMagico(int quantidadePoMagico) {
		this.quantidadePoMagico = quantidadePoMagico;
	}

	public int incluirPontosDeVida(){
		
		quantidadePoMagico = quantidadePoMagico -1;
		if(quantidadePoMagico>0){
			return 1;
		}else {
			return 0;
		}
		
	}
}
