package uscs;

public class disciplina {
	
	public int codDisciplina;
	public String descDisciplina;
	
	public disciplina(int codDisciplina, String descDisciplina) {
		//super();
		this.codDisciplina = codDisciplina;
		this.descDisciplina = descDisciplina;
	}
	
	public disciplina() {
		
	}
	
	public void imprimeDisciplina() {
		System.out.println("C�digo da disciplina: " + this.codDisciplina);
		System.out.println("Descri��o da disciplina: " + this.descDisciplina);
	}
	
}
