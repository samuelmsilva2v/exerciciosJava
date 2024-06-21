package repositories;

import java.io.PrintWriter;

import entities.Curso;

public class CursoRepository {

	public void exportarDados(Curso curso) throws Exception {
		
		PrintWriter printWriter = new PrintWriter("curso.txt");
		
		printWriter.write("Turma:\n");
		printWriter.write("\nIdTurma: "+ curso.getTurma().getId());
		printWriter.write("\nDataInicio: "+ curso.getTurma().getDataInicio());
		printWriter.write("\n\nProfessor: \n");
		printWriter.write("\nIdProfessor: "+ curso.getTurma().getProfessor().getId());
		printWriter.write("\nNome: "+ curso.getTurma().getProfessor().getNome());
		printWriter.write("\nEmail: "+ curso.getTurma().getProfessor().getEmail());
		printWriter.write("\n\nCurso: \n");
		printWriter.write("\nIdCurso: "+ curso.getId());
		printWriter.write("\nTitulo: "+curso.getTitulo());
		printWriter.write("\nCargaHoraria: "+curso.getCargaHoraria());
		
		printWriter.close();
	}
}
