package uscs;

public class TesteEmpregado {
	
	public static void main(String[] args) {
		Empregado e1 = new Empregado(
				1232,
				"Paulo Silva",
				"Gerente Financeiro",
				15400.00
				);
		
		System.out.println("----------------");
		e1.ImprimeEmpregado();
		System.out.println("----------------");
		e1.TotalEmpregados();
		
		Empregado e2 = new Empregado();
		
		System.out.println("------------------");
		//e2.codEmpregado = 4567;
		e2.setCodEmpregado(4567);
		
		//e2.nomeEmpregado = "Ana Paula";
		e2.setNomeEmpregado("Ana Paula");
		
		//e2.cargoEmpregado = "Analista de Sistemas Senior";
		e2.setCargoEmpregado("Analista de Sistemas Senior");
		
		//e2.salarioEmpregado = 10700;
		e2.setSalarioEmpregado(10700.00);
		
		e2.ImprimeEmpregado();
		System.out.println("------------------");
		
		e2.TotalEmpregados();
				
	}
}
