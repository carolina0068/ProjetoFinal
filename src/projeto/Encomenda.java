package projeto;

/**
 * Esta classe serve para identificar a encomenda feita pelo utilizador
 * @author Luis Bispo, José Boieiro, Carolina Timóteo
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
	 * o seu código postal, o número da encomenda, a data pedida da mesma e a sua quantidade
	 * @param nome_Cliente é o primeiro e ultimo nome do cliente
	 * @param morada é o nome da rua, número da porta e andar, onde o cliente mora
	 * @param codigo_Postal é o código postal da cidade onde cliente vive
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
	 * Devolve o preço total depois de calculado o preço do artigo e a sua quantidade pedida
	 * @return Preço Total
	 */
	public double precoTotal() {
		return super.calcularPrecoTotal() * quantidade;
	}

	// TOSTRING
	
}
