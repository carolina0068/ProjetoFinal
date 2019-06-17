package projeto;

/**
 * Esta classe serve para identificar a encomenda feita pelo utilizador
 * @author Luis Bispo, Jos� Boieiro, Carolina Tim�teo
 *
 */

public class Encomenda extends Cliente{
	// ATRIBUTOS
	protected int numero;
	protected String data;
	protected int quantidade;
	
	// ACESSORES
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	// CONSTRUTORES
	
	public Encomenda() {
		
	}
	
	/**
	 * Construor da encomenda com o respetivo nome do cliente, a sua morada, 
	 * o seu c�digo postal, o n�mero da encomenda, a data pedida da mesma e a sua quantidade
	 * @param nome_Cliente � o primeiro e ultimo nome do cliente
	 * @param morada � o nome da rua, n�mero da porta e andar, onde o cliente mora
	 * @param codigo_Postal � o c�digo postal da cidade onde cliente vive
	 * @param numero serve para identificar a encomenda
	 * @param data em que a encomenda foi feita pelo cliente
	 * @param quantidade que o cliente encomendou
	 */
	
	public Encomenda(String nome_Cliente, String morada, int codigo_Postal, int numero,
			String data, int quantidade) {
		super(nome_Cliente, morada, codigo_Postal);
		this.numero = numero;
		this.data = data;
		this.quantidade = quantidade;
	}
	
	
	
	// METODOS
	
	/**
	 * Devolve o pre�o total depois de calculado o pre�o do artigo e a sua quantidade pedida
	 * @return Pre�o Total
	 */
	public double precoTotal() {
		return super.calcularPrecoTotal() * quantidade;
	}

	// TOSTRING
	
}
