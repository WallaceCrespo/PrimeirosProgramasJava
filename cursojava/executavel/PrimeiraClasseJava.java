package cursojava.executavel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.interfaces.PermitirAcesso;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		try {

			String login = JOptionPane.showInputDialog("Informe o login");
			String senha = JOptionPane.showInputDialog("Informe a senha");

			if (new Secretario().autenticar(login, senha)) {
				JOptionPane.showMessageDialog(null, "Bem vindo, acesso permitido!!");

				List<Aluno> alunos = new ArrayList<Aluno>();
				List<Aluno> alunosAprovados = new ArrayList<Aluno>();
				List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
				List<Aluno> alunosReprovados = new ArrayList<Aluno>();

				for (int qtd = 1; qtd <= 1; qtd++) {

					String nome = JOptionPane.showInputDialog("Qual o nome do aluno ?");
					String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
					String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
					String registroGeral = JOptionPane.showInputDialog("Qual o RG do aluno?");
					String numeroCpf = JOptionPane.showInputDialog("Qual o CPF do aluno?");
					String nomeMae = JOptionPane.showInputDialog("Qual o nome da mãe do aluno?");
					String nomePai = JOptionPane.showInputDialog("Qual o nome do pai?");
					String dataMatricula = JOptionPane.showInputDialog("Qual a data da matrícula?");
					String serieMatriculado = JOptionPane.showInputDialog("Qual a série do aluno?");
					
					Aluno aluno1 = new Aluno();

					aluno1.setNome(nome);
					aluno1.setIdade(Integer.valueOf(idade));
					aluno1.setDataNascimento(dataNascimento);
					aluno1.setRegistroGeral(registroGeral);
					aluno1.setNumeroCpf(numeroCpf);
					aluno1.setNomeMae(nomeMae);
					aluno1.setNomePai(nomePai);
					aluno1.setDataMatricula(dataMatricula);
					aluno1.setSerieMatriculado(serieMatriculado);

					for (int pos = 1; pos <= 4; pos++) {
						String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
						String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");

						Disciplina disciplina = new Disciplina();
						disciplina.setDisciplina(nomeDisciplina);
						disciplina.setNota(Double.valueOf(notaDisciplina));

						aluno1.getDisciplinas().add(disciplina);

					}

					int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

					if (escolha == 0) {

						int continuarRemover = 0;
						int posicao = 1;

						while (continuarRemover == 0) {

							String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina: 1, 2, 3 ou 4?");
							aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
							posicao++;
							continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja continuar removendo?");

						}
					}
					alunos.add(aluno1);

					for (Aluno aluno : alunos) {

						if (aluno1.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
							alunosAprovados.add(aluno1);
						} else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
							alunosRecuperacao.add(aluno1);
						} else
							alunosReprovados.add(aluno1);
					}
				}

				System.out.println("-------------------- Lista dos aprovados----------------------");
				for (Aluno aluno : alunosAprovados) {

					System.out.println(aluno);

					System.out.println("Resultado = " + aluno.getAlunoAprovado());

					System.out.println("Média = " + aluno.getMediaNota0());

				}

				System.out.println("--------------- Lista dos alunos em recuperação ------------");
				for (Aluno aluno : alunosRecuperacao) {

					System.out.println(aluno);

					System.out.println("Resultado = " + aluno.getAlunoAprovado());

					System.out.println("Média = " + aluno.getMediaNota0());

				}

				System.out.println("--------------- Lista dos alunos reprovados ------------");
				for (Aluno aluno : alunosReprovados) {

					System.out.println(aluno);

					System.out.println("Resultado = " + aluno.getAlunoAprovado());

					System.out.println("Média = " + aluno.getMediaNota0());

				}
			} else {
				JOptionPane.showMessageDialog(null, "Acesso não permitido");
			}

		} catch (NumberFormatException e) {

			StringBuilder saida = new StringBuilder();

			System.out.println("Mensagem: " + e.getMessage());

			for (int pos = 0; pos < e.getStackTrace().length; pos++) {
				saida.append("\n Classe de erro: " + e.getStackTrace()[pos].getClassName());
				saida.append("\n Método com erro: " + e.getStackTrace()[pos].getMethodName());
				saida.append("\n Linha com erro: " + e.getStackTrace()[pos].getLineNumber());
				saida.append("\n Class:" + e.getClass().getName());

			}

			e.printStackTrace();
			JOptionPane.showMessageDialog(null, " Erro de conversão de números  " + saida.toString());
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, " Erro de NullPointerException  " + e.getClass());
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro inesperado : " + e.getClass().getName());
		} finally {
			JOptionPane.showMessageDialog(null, "Obrigado por utilizar este programa.");
		}
	}
}