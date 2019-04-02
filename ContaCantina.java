package lab02JesseMonteiroFerreira;

/**
 * Representa a conta de um aluno na cantina
 * 
 * @author Jesse Monteiro Ferreira
 *
 */
public class ContaCantina {
	
	/**
	 * Nome da cantina
	 */
	private String nomeCantina;
	
	/**
	 * Valor devedor do aluno com a cantina
	 */
	private int debitoEmConta;
	
	/**
	 * Valor total vendido pela cantina ao aluno
	 */
	private int valorTotalDebitos;
	
	/**
	 * Quantidade de itens vendidos pela cantina
	 */
	private int itensVendidos;
	
	
	
	/**
	 * Construtor que atribui o nome que recebe como nome da cantina
	 * 
	 * @param nomeDaCantina nome recebido para ser salvo como nome da cantina
	 */
	public ContaCantina(String nomeDaCantina){
		this.nomeCantina = nomeDaCantina;
	}
	
	

	/**
	 * Cadastrar uma venda da lanchonete 
	 * @param qtdItens quantidade de itens vendidos
	 * @param valorCentavos valor em centavos vendido
	 */
	public void cadastraLanche(int qtdItens, int valorCentavos) {
		this.debitoEmConta = this.debitoEmConta + valorCentavos;
		this.valorTotalDebitos = this.valorTotalDebitos + valorCentavos;
		this.itensVendidos = this.itensVendidos + qtdItens;
	}
	
	
	
	/**
	 * Pagar saldo devedor na cantina.
	 * 
	 * @param valorCentavos valor a ser abatido do saldo devedor
	 */
	public void pagaConta(int valorCentavos) {
		this.debitoEmConta = this.debitoEmConta - valorCentavos;
	}
	
	
	
	/**
	 * Retorna o valor do saldo devedor a ser pago.
	 * 
	 * @return saldo devedor
	 */
	public int getFaltaPagar() {
		return debitoEmConta;
	}
	
	
	
	/**
	 * Retorna a conta na cantina com seus atributos.
	 * 
	 * @return nome da cantina, itens vendos e valor total vendido
	 */
	public String toString() {
		String retorno = (this.nomeCantina + " " + this.itensVendidos + " " + this.valorTotalDebitos); 
		return retorno;
	}
}
