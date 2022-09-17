package uscs;

public class Empregado {
	private String nome;
	private String endereço;
	private Double valorHoraTrabalhada;
	private Integer quantHorasTrabalhadas;
	
	public Empregado(String nome, String endereço, double valorHoraTrabalhada, Integer quantHorasTrabalhadas) {
		//super();
		this.nome = nome;
		this.endereço = endereço;
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

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
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
		System.out.println("Endereço: " + this.endereço);
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
