package lab02JesseMonteiroFerreira;

/**
 * Representa a condição de saude mental e fisica do estudante.
 * @author Jesse Monteiro Ferreira - 118210282
 *
 */
public class Saude {
	
	/**
	 * Condição de saúde mental do estudante.
	 */
	private String saudeMental;
	
	/**
	 * Condição de saúde física do estudante.
	 */
	private String saudeFisica;
	
	
	
	/**
	 * Construtor que inicia os dois atributos em "boa" a condição de saúde.
	 */
	public Saude() {
		this.saudeMental = "boa";
		this.saudeFisica = "boa";
	}
	
	
	/**
	 * Definir o estado de saude mental do estudante.
	 * 
	 * @param valor estado de saúde para qual deve ser alterado
	 */
	public void defineSaudeMental(String valor) {
		this.saudeMental = valor;
	}
	
	
	/**
	 * Definir o estado de saúde física do estudante.
	 * @param valor estado de saúde para qual deve ser alterado
	 */
	public void defineSaudeFisica(String valor) {
		this.saudeFisica = valor;
	}
	
	
	/**
	 * Verifica o estado atual de saude fisica e mental e retorna o estado de saúde
	 * Boa para saúde fisica e mental "boa"
	 * OK para uma condição "boa" e outra "fraca"
	 * Fraca caso as duas estejam fraca
	 * @return condição de saúde
	 */
	public String getStatusGeral() {
		if (this.saudeMental.equals("boa")) {
			if (this.saudeFisica.equals("boa")) {
				return "boa!";
			} if(this.saudeFisica.equals("fraca")) {
				return "ok!";
			}
		} if (this.saudeMental.equals("fraca")) {
			if (this.saudeFisica.equals("boa")) {
				return "ok!";
			}
		} 
		
		return "fraca!";

	}
}
	
