package uscs;

public class Empregado {
	private String nome;
	private String endere�o;
	private Double valorHoraTrabalhada;
	private Integer quantHorasTrabalhadas;
	
	public Empregado(String nome, String endere�o, double valorHoraTrabalhada, Integer quantHorasTrabalhadas) {
		//super();
		this.nome = nome;
		this.endere�o = endere�o;
		this.valorHoraTrabalhada = valorHoraTrabalhada;
		this.quantHorasTrabalhadas = quantHorasTrabalhadas;
	}
	
	public Empregado() {
		
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public double getValorHoraTrabalhada() {
		return valorHoraTrabalhada;
	}

	public void setValorHoraTrabalhada(double valorHoraTrabalhada) {
		this.valorHoraTrabalhada = valorHoraTrabalhada;
	}

	public double getQuantHorasTrabalhadas() {
		return quantHorasTrabalhadas;
	}

	public void setQuantHorasTrabalhadas(Integer quantHorasTrabalhadas) {
		this.quantHorasTrabalhadas = quantHorasTrabalhadas;
	}

	public void imprimeEmpregado() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Endere�o: " + this.endere�o);
		System.out.println("Valor da Hora Trabalhada: " + this.valorHoraTrabalhada);
		System.out.println("Quantidade de horas trabalhadas: " + this.quantHorasTrabalhadas);
	}
	
	public Double CalculaSalario() {
		
		return (this.valorHoraTrabalhada * this.quantHorasTrabalhadas);
	}
	
	public void imprimeSalario() {
		System.out.println("Salario: " + this.CalculaSalario());
	}
	
	
	
}
