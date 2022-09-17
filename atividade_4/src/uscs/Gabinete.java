package uscs;

public class Gabinete {
	
	private String numeroSerie;
	private String fabricante;
	private String cor;
	
	public Gabinete(String numeroSerie, String fabricante, String cor) {
		super();
		this.numeroSerie = numeroSerie;
		this.fabricante = fabricante;
		this.cor = cor;
	}
	
	public Gabinete() {
		
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
	
	public void imprimeGabinete() {
		
		System.out.println("Número de serie do gabinete: " + this.numeroSerie);
		System.out.println("Fabricante do Gabinete " + this.fabricante);
		System.out.println("Cor do Gabinete " + this.cor);
		
	}
}
