package uscs;

public class curso {
	public int codCurso;
	public String desCurso;
	public int duracaoSemestre;
	
	//construtor com passagem de dados
	public curso(int codCurso, String desCurso, int duracaoSemestre) {
		//super();
		this.codCurso = codCurso;
		this.desCurso = desCurso;
		this.duracaoSemestre = duracaoSemestre;
	}
	
	//construtor default (sem passagem de dados)
	public curso() {
		
	}
	
	public void imprimeCurso() {
		System.out.println("C�digo do Curso: " + this.codCurso);
		System.out.println("Descri��o do Curso: " + this.desCurso);
		System.out.println("Dura��o do curso: " + this.duracaoSemestre);	
	}
	
	
}
