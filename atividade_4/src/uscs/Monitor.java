package uscs;

public class Monitor {
	
	private String numeroSerie;
	private String fabricante;
	private String cor;
	
	public Monitor(String numeroSerie, String fabricante, String cor) {
		super();
		this.numeroSerie = numeroSerie;
		this.fabricante = fabricante;
		this.cor = cor;
	}
	
	public Monitor() {
		
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
	
	public void imprimeMonitor() {
		System.out.println("Numero de serie do monitor " + this.numeroSerie);
		System.out.println("Fabricante do monitor: " + this.fabricante);
		System.out.println("Cor do monitor: " + this.cor);
	}
	
	
}
