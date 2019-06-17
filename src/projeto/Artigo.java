package projeto;

/**
 * Esta classe serve para definir o artigo da encomenda a ser feita pelo cliente
 * @author Luis Bispo, José Boieiro, Carolina Timóteo
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
	 * Construtor de um artigo com o especifico código do mesmo, sua descrição, o preço
	 * e o desconto.
	 * @param codigo_Artigo serve para identificar o artigo em questão
	 * @param descricao é uma breve explicação do que se trata o artigo
	 * @param preco é o custo de inicio do artigo
	 * @param desconto é o valor que poderá reduzir o preço do artigo
	 */
	
	public Artigo(int codigo_Artigo, String descricao, int preco, double desconto) {
		super();
		this.codigo_Artigo = codigo_Artigo;
		this.descricao = descricao;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	/**
	 * Devolve o preço real depois de calcular o preço do artigo com o desconto dado
	 * @return Preço final
	 */
	// METODOS
	public double calcularPrecoTotal() {
		return preco * 1 - desconto; 	
	}

}
