package projeto;

/**
 * Esta classe serve para identificar o cliente que irá eventualmente efetuar a encomenda
 * @author Luis Bispo, José Boieiro, Carolina Timóteo
 *
 */

public class Cliente extends Artigo {
	// ATRIBUTOS
	protected String nome_Cliente;
	protected String morada;
	protected int codigo_Postal;
	
	// ACESSORES
	public String getNome_Cliente() {
		return nome_Cliente;
	}
	public void setNome_Cliente(String nome_Cliente) {
		this.nome_Cliente = nome_Cliente;
	}
	public String getMorada() {
		return morada;
	}
	public void setMorada(String morada) {
		this.morada = morada;
	}
	public int getCodigo_Postal() {
		return codigo_Postal;
	}
	public void setCodigo_Postal(int codigo_Postal) {
		this.codigo_Postal = codigo_Postal;
	}
	
	// CONSTRUTORES
	
	public Cliente() {
		
	}
	
	/**
	 * Construtor de um cliente com respetivo nome, morada e código de postal
	 * @param nome_Cliente é o primeiro e ultimo nome do cliente
	 * @param morada é o nome da rua, número da porta e andar, onde o cliente mora
	 * @param codigo_Postal é o código postal da cidade onde cliente vive
	 */
	
	
	public Cliente(String nome_Cliente, String morada, int codigo_Postal) {
		super();
		this.nome_Cliente = nome_Cliente;
		this.morada = morada;
		this.codigo_Postal = codigo_Postal;
	}

	
	// METODOS
	

	// TOSTRING
	
}
