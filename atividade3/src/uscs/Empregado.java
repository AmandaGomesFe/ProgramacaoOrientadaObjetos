package uscs;

public class Empregado {
	private int codEmpregado;
	private String nomeEmpregado;
	private String cargoEmpregado;
	private double salarioEmpregado;
	private static int contadorEmpregados = 0; 
	/*public static int contadorEmpregados = 0: 
	 * É uma variavel que defini uma informação que vale para todos os objetos, 
	 * a medida que for criando objetos a var será incrementada*/
	
	//Getter e Setter: Não deixa entrar valores invalidos desde que defina os valores permitidos no Getter.
	public int getCodEmpregado() {
		return codEmpregado;
	}
	public void setCodEmpregado(int codEmpregado) {
		this.codEmpregado = codEmpregado;
	}
	public String getNomeEmpregado() {
		return nomeEmpregado;
	}
	public void setNomeEmpregado(String nomeEmpregado) {
		this.nomeEmpregado = nomeEmpregado;
	}
	public String getCargoEmpregado() {
		return cargoEmpregado;
	}
	public void setCargoEmpregado(String cargoEmpregado) {
		this.cargoEmpregado = cargoEmpregado;
	}
	public double getSalarioEmpregado() {
		return salarioEmpregado;
	}
	public void setSalarioEmpregado(double salarioEmpregado) {
		this.salarioEmpregado = salarioEmpregado;
	}
	public static int getContadorEmpregados() {
		return contadorEmpregados;
	}
	public static void setContadorEmpregados(int contadorEmpregados) {
		Empregado.contadorEmpregados = contadorEmpregados;
	}
	
	//Construtor sempre tem o mesmo nome da classe
	public Empregado(
			int codEmpregado, 
			String nomeEmpregado, 
			String cargoEmpregado, 
			double salarioEmpregado) {
		//super();
		this.codEmpregado = codEmpregado;
		this.nomeEmpregado = nomeEmpregado;
		this.cargoEmpregado = cargoEmpregado;
		this.salarioEmpregado = salarioEmpregado;
		Empregado.contadorEmpregados++; //Incrementando a variavel;
		
	}
	
	//construtor sem parametros
	public Empregado() {
		Empregado.contadorEmpregados++;
	}
	
	public void ImprimeEmpregado(){
		System.out.println("Código do empregado: " + this.codEmpregado);
		System.out.println("Nome do empregado: " + this.nomeEmpregado);
		System.out.println("Cargo do empregado: " + this.cargoEmpregado);
		System.out.println("Salario do empregado: " + this.salarioEmpregado);
	}
	
	public void TotalEmpregados() {
		System.out.println("Total de Empregados: " + Empregado.contadorEmpregados);
	}
	
}
