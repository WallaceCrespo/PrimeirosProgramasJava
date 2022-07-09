package cursojava.classes;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.lang.Iterable;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import cursojava.constantes.StatusAluno;

public class Aluno extends Pessoa {

	public final String getDisciplina = null;
	private String dataMatricula;
	private String serieMatriculado;

	private List<Disciplina> Disciplinas = new ArrayList<Disciplina>();

	public void setDisciplinas(List<Disciplina> disciplinas) {
		Disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
		return Disciplinas;
	}

	public Aluno() {

	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public double getMediaNota0() {

		double somaNotas = 0.0;

		for (Disciplina disciplina : Disciplinas) {
			somaNotas += disciplina.getNota();
		}
		return somaNotas / Disciplinas.size();
	}

	public String getAlunoAprovado() {
		double media = this.getMediaNota0();
		if (media >= 50) {
			if (media >= 70) {
				return StatusAluno.APROVADO;
			} else {
				return StatusAluno.RECUPERACAO;
			}
		} else {
			return StatusAluno.REPROVADO;
		}

	}

	@Override
	public String toString() {
		return "Aluno [Nome : " + nome + ", Idade : " + idade + ", Data de Nascimento : " + dataNascimento + ", RG : "
				+ registroGeral + ", Número do Cpf : " + numeroCpf + ", Nome da mae : " + nomeMae + ", Nome do Pai : " + nomePai
				+ ", Data da Matricula : " + dataMatricula + ", Série do Matriculado : " + serieMatriculado + "]";
	}

}