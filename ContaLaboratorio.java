package lab02JesseMonteiroFerreira;

/**
 * Representa uma conta no laboratório de informática.
 * 
 * @author Jessé Monteiro Ferreira - 118210282
 *
 */
public class ContaLaboratorio {

	/**
	 * Representa o nome do laboratório
	 */
	private String nome;
	
	/**
	 * Representa o uso de dados da cota disponibilizada
	 */
	private int cotaOcupada;
	
	/**
	 * Representa o valor da cota de dados de cada aluno no laboratório
	 * Valor de entrada em mb
	 */
	private int cotaInicial;
	
	
	
	/**
	 * Constroi a conta a partir do nome do laboratório
	 * Nesse construtor a cota inicial é 2000mb
	 * 
	 * @param nomeLab o nome do laboratório
	 */
	public ContaLaboratorio(String nomeLab) {
		this.nome = nomeLab;
		this.cotaInicial = 2000;
	}
	
	
	
	/**
	 * Constroi a conta a partir do nome do laboratório e da cota inicial
	 * 
	 * @param nomeLab o nome do laboratório
	 * @param cotaLab a cota inicial de dados
	 */
	public ContaLaboratorio(String nomeLab, int cotaLab) {
		this.nome = nomeLab;
		this.cotaOcupada = cotaLab;
		this.cotaInicial = cotaLab;
	}
	

	
	/**
	 * Retorna o nome do laboratório
	 * 
	 * @return string que representa o nome do laboratótio
	 */
	public String getNome() {
		return this.nome;
	}

	
	/**
	 * Retornar o espaço de cota ocupada
	 * 
	 * @return o valor do inteiro ocupado da cota de dados
	 */
	public int getEspacoOcupado() {
		return this.cotaOcupada;
	}
	

	
	/**
	 * Retorna a cota inicial de dados
	 * 
	 * @return o valor do inteiro cota inicial
	 */
	public int getCota() {
		return this.cotaInicial;
	}
	
	// ********************** Sets  ***********************
	

	/**
	 * Altera o valor do nome do laboratório
	 * 
	 * @param nomeSet o nome do laboratório
	 */
	public void setNome(String nomeSet) {
		this.nome = nomeSet;
	}
	
	
	/**
	 * Altera o valor da cota ocupada.
	 * 
	 * @param cotaSet o valor de cota ocupada
	 */
	public void setCota(int cotaSet) {
		this.cotaOcupada = cotaSet;
	}
	
	// Função Consome Espaço que recebe um valor em mbytes de dados a ser subtraido da cota de uso de dados
	
	/**
	 * Recebe o valor consumido e incrementa a cota ocupado
	 * 
	 * @param mbytes espaço consumido
	 */
	public void consomeEspaco(int mbytes) {
		this.cotaOcupada += mbytes;
	}	
	
	
	/**
	 * Recebe um valor liberado da cota e decrementa da cota ocupada.
	 * 
	 * @param mbytes valor de espaço liberado da cota
	 */
	public void liberaEspaco(int mbytes) {
		this.cotaOcupada -= mbytes;
	}
	
	
	
	/**
	 * Verifica se o valor de cota ocupada é maior que o valor de cota inicial
	 * 
	 * @return true se atingiu a cota, caso contrário, false
	 */
	public boolean atingiuCota() {
		if (this.cotaOcupada >= this.cotaInicial) {
			return true;
		} else {
			return false;
		}
	}
	
	
	/**
	* Representação da conta no labratório com todos seus atributos
	* 
	* @return o nome do laboratorio, a cota ocupada e a cota inicial
	*/
	public String toString() {
		String saida = (this.nome + " " + this.cotaOcupada + "/" + this.cotaInicial); 
		return saida;
	}
	
	
}
