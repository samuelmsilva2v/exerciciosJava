package repositories;

import java.io.PrintWriter;

import entities.Exame;

public class ExameRepository {

	public void exportarDados(Exame exame) throws Exception {

		PrintWriter printWriter = new PrintWriter("exame_" + exame.getId() + ".txt");

		printWriter.write("ID: " + exame.getId());
		printWriter.write("\nTipo: " + exame.getTipo());
		printWriter.write("\nData: " + exame.getData());
		printWriter.write("\nResultado: " + exame.getResultado());
		printWriter.write("\nMédico: " + exame.getMedico().getNome());
		printWriter.write("\nPaciente: " + exame.getPaciente().getNome());

		printWriter.close();

	}
}
