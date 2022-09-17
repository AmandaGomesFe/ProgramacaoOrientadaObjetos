package uscs;

public class professor {
	public int codProfessor;
	public String nomeProf;
	public String emailProf;
	public String foneProf;
	
	public professor(int codProfessor, String nomeProf, String emailProf, String foneProf) {
		//super();
		this.codProfessor = codProfessor;
		this.nomeProf = nomeProf;
		this.emailProf = emailProf;
		this.foneProf = foneProf;
	}
	
	public professor() {
		
	}
	
	public void imprimeProfessor() {
		System.out.println("Código do Professor: " + this.codProfessor);
		System.out.println("Nome do Professor: " + this.nomeProf);
		System.out.println("Email do Profesor: " + this.emailProf);
		System.out.println("Telefone do Professor: " + this.foneProf);
	}
}
