package projeto;

/**
 * Esta classe serve para definir o artigo da encomenda a ser feita pelo cliente
 * @author Luis Bispo, Jos� Boieiro, Carolina Tim�teo
 *
 */
public class Artigo{
	// ATRIBUTOS
	protected int codigo_Artigo;
	protected String descricao;
	protected int preco;
	protected double desconto;
	
	// ACESSORES
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCodigo_Artigo() {
		return codigo_Artigo;
	}
	public void setCodigo_Artigo(int codigo_Artigo) {
		this.codigo_Artigo = codigo_Artigo;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	// CONSTRUTORES
	public Artigo() {
		super();
	}
	
	/**
	 * Construtor de um artigo com o especifico c�digo do mesmo, sua descri��o, o pre�o
	 * e o desconto.
	 * @param codigo_Artigo serve para identificar o artigo em quest�o
	 * @param descricao � uma breve explica��o do que se trata o artigo
	 * @param preco � o custo de inicio do artigo
	 * @param desconto � o valor que poder� reduzir o pre�o do artigo
	 */
	
	public Artigo(int codigo_Artigo, String descricao, int preco, double desconto) {
		super();
		this.codigo_Artigo = codigo_Artigo;
		this.descricao = descricao;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	/**
	 * Devolve o pre�o real depois de calcular o pre�o do artigo com o desconto dado
	 * @return Pre�o final
	 */
	// METODOS
	public double calcularPrecoTotal() {
		return preco * 1 - desconto; 	
	}

}
