
public class CampoDeBatalha {

	public static void main(String[] args) {
		
		/**
		 * Reino do fogo
		 */

		Cavaleiro cv = new Cavaleiro();
		cv.setNome("Arthu");
		cv.setPontosDeVida(20);
		
		Mago mg = new Mago();
		mg.setNome("Merlin");
		mg.setPontosDeVida(20);
		
		
		/**
		 * Reino do gelo
		 */
		
		Fada fd = new Fada();
		fd.setNome("Mavis");
		fd.setPontosDeVida(20);
		
		Monstro mt = new Monstro();
		mt.setNome("Bicho Papão");
		mt.setPontosDeVida(20);
		
		
		/**
		 * Batalha
		 */
		
		cv.retiradaPontosDeVida(fd.usarMagia());
		System.out.println(" "+cv.getPontosDeVida());
		
		
		
		
	}

}
