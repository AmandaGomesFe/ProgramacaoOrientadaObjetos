package uscs;

public class Mouse {
	
	private String numeroSerie;
	private String fabricante;
	private String cor;
	
	public Mouse(String numeroSerie, String fabricante, String cor) {
		//super();
		this.numeroSerie = numeroSerie;
		this.fabricante = fabricante;
		this.cor = cor;
	}
	
	public Mouse() {
		
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void iprimeMouse() {
		System.out.println("Numero de serie do mouse: " + this.numeroSerie);
		System.out.println("Fabricante do mouse: " + this.fabricante);
		System.out.println("Cor do mouse: " + this.cor);
	}
	
	
	
	
	
	
}
