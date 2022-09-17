package uscs;

public class Teclado {
	
	//Encapsulamento = private
	private String NumeroSerie;
	private String Fabricante;
	private String Cor;
	
	public Teclado(String numeroSerie, String fabricante, String cor) {
		//super();
		NumeroSerie = numeroSerie;
		Fabricante = fabricante;
		Cor = cor;
	}
	
	public Teclado() {
		
	}

	public String getNumeroSerie() {
		return NumeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		NumeroSerie = numeroSerie;
	}

	public String getFabricante() {
		return Fabricante;
	}

	public void setFabricante(String fabricante) {
		Fabricante = fabricante;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}
	
	public void imprimeTeclado() {
		System.out.println("Numero de serie do teclado: " + this.NumeroSerie);
		System.out.println("Fabricante do teclado: " + this.Fabricante);
		System.out.println("Cor do teclado: " + this.Cor);
	}
	
}
