package poo.composicao;

public class AlunoTeste {

	public static void main(String[] args) {
		
		Aluno objAluno1 = new Aluno("Guilherme");
		Aluno objAluno2 = new Aluno("Amanda");
		Aluno objAluno3 = new Aluno("Raphael");
		
		Curso objCurso1 = new Curso("Administra��o");
		Curso objCurso2 = new Curso("An�lise e Desenvolvimento de Sistemas");
		Curso objCurso3 = new Curso("Agroneg�cio");
		
		objAluno1.adicionarCurso(objCurso1);
		objCurso2.adicionarAluno(objAluno1);
		
		objAluno2.adicionarCurso(objCurso3);
		
		objAluno3.adicionarCurso(objCurso2);
		
		for (Aluno C: objCurso2.alunosDoCurso) {
			System.out.println("Curso: " + objCurso2.nomeDoCurso);
			System.out.println("Aluno: " + C.nomeDoAluno);
		}
		
		System.out.println(objAluno1.cursosDoAluno.get(1).alunosDoCurso);
		
		Curso cursoEncontrado = objAluno1.obterCursoPorNome("Administra��o");
		
		if (cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nomeDoCurso);
			System.out.println(cursoEncontrado.alunosDoCurso);
		}
		
	}
}
