package uscs;

public class TesteEscola {
	public static void main(String[] args) {
		//criacao dos cursos
		//Operador "new" para criar objetos;
		curso curso1 = new curso(1, "Ciência da Computação", 8);
		curso curso2 = new curso(2, "Sistemas de Informação", 8);
		curso curso3 = new curso(3, "Redes de Computadores", 5);
		curso curso4 = new curso(4, "ADS", 5);
		curso curso5 = new curso(5, "Gestão de TI", 5);
		
		curso[] tabCurso = new curso[5];
		
		tabCurso[0] = curso1;
		tabCurso[1] = curso2;
		tabCurso[2] = curso3;
		tabCurso[3] = curso4;
		tabCurso[4] = curso5;
		
		professor prof1 = new professor(10, "Paulo", "paulo@gmail.com", "44567898");
		professor prof2 = new professor(15, "Alfredo","al@gmail.com", "44578891");
		professor prof3 = new professor(20, "Marcos", "ma@gmail.com", "44579999");
		professor prof4 = new professor(25, "Ana", "ana@gmail.com", "33444666");
		
		professor[] tabProfessor = new professor[4];
		tabProfessor[0] = prof1;
		tabProfessor[1] = prof2;
		tabProfessor[2] = prof3;
		tabProfessor[3] = prof4;
		
		disciplina	disciplina1 = new disciplina(100,"Estatistica");
		disciplina disciplina2 = new disciplina(110, "Algoritmo");
		disciplina disciplina3 = new disciplina(120, "Redes");
		disciplina disciplina4 = new disciplina(130, "Algebra");
		
		disciplina[] tabDisciplina = new disciplina[4];
		
		tabDisciplina[0] = disciplina1;
		tabDisciplina[1] = disciplina2;
		tabDisciplina[2] = disciplina3;
		tabDisciplina[3] = disciplina4;
		
		//codigo para imprimir os dados dos cursos
		System.out.println("-----------------------");
		System.out.println("Exibindo dados dos Cursos");
		for(int i = 0; i < tabCurso.length; i++) {
			tabCurso[i].imprimeCurso();
			System.out.println("===================");
			
		}
		System.out.println("-----------------------");
		System.out.println("Exibindo dados dos Professores");
		for(int i = 0; i < tabProfessor.length; i++) {
			tabProfessor[i].imprimeProfessor();
			System.out.println("===================");
	
		}
		
		System.out.println("------------------");
		System.out.println("Exibindo dados das Disciplias");
		for(int i =0; i < tabDisciplina.length; i++) {
			tabDisciplina[i].imprimeDisciplina();
			System.out.println("===================");
		}
		
		
	}
}
