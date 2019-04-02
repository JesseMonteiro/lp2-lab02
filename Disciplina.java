package lab02JesseMonteiroFerreira;

/**
 * Representa uma disciplina escolar
 * 
 * @author Jesse Monteiro Ferreira - 118210282
 *
 */
public class Disciplina {
	
	/**
	 * Nome da disciplina
	 */
	private String disciplina;
	
	/**
	 * Horas cursadas na disciplina
	 */
	private int horasEstudo;
	
	/**
	 * Array com as 4 notas das disciplinas
	 */
	private double[] notas = new double[4];
	
	/**
	 * Media aritimética das notas
	 */
	private double media;
	
	
	
	/**
	 * Construtor de disciplina que recebe o nome da disciplina e inicia as horas
	 * 
	 * de estudo com 0 e as notas com 0.
	 * @param nomeDisciplina Nome recebido da disciplina
	 */
	public Disciplina(String nomeDisciplina) {
			this.disciplina = nomeDisciplina;
			this.horasEstudo = 0;
			this.notas[0] = 0.0;
			this.notas[1] = 0.0;
			this.notas[2] = 0.0;
			this.notas[3] = 0.0;

	}


	
	/**
	 * Cadastro de horas de estudo
	 * 
	 * @param horas quantidade de horas estudadas
	 */
	public void cadastraHoras(int horas) {
		this.horasEstudo = horasEstudo + horas;
	}
	
	
	/**
	 * Cadastra as notas no sistema, recebendo qual a nota a ser salva e a nota.
	 * 
	 * @param nota qual a nota a ser salva
	 * @param valorNota valor da nota a ser salva
	 */
	public void cadastraNota(int nota, double valorNota) {
		if (nota > 4) {
			System.out.println("Nota maior que 4, não possivel salvar");
		} else {
			this.notas[nota - 1] = valorNota;	
		}	
	}
	
	
	
	/**
	 * Verifica se o aluno foi aprovado (média maior ou igual a 7)
	 * 
	 * @return true se foi aprovado, false se reprovado
	 */
	public boolean aprovado() {
		media = (this.notas[0] + this.notas[1] + this.notas[2]+ this.notas[3]) / 4;
		
		if (media >= 7) {
			return true;
		} else {
			return false;
		}
	}
	
	
	/**
	 * Representação da disciplina com todos os seus atributos
	 * 
	 * @return nome da disciplina, horas de estudo, a média e as 4 notas
	 */
	public String toString() {
		String retorno = (this.disciplina + " " + this.horasEstudo + " " + this.media + " " + "[" + this.notas[0] + ", " + this.notas[1] + ", " + this.notas[2] + ", " +  this.notas[3] + "]");
		return retorno;
	}
	
	
	
}
