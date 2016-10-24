/*
 * Eden Paulo Gill
 * 
 * Linguagem de Programação II
 * 
 * Exercício NotaFiscal
 * 
 * Classe Produto
 * 
 */

package dominio;

public class Produto {
	private String descricao;
	private float preco;
	
	public Produto (String _descricao, float _preco) {
		setDescricao(_descricao);
		setPreco(_preco);
	}
	
	@Override
	public String toString() {
		return (descricao + "\t\t" + preco);
	}

	public void setDescricao(String _descricao) {
		if (_descricao != "") 
			descricao = _descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setPreco(float _preco) {
		if (_preco > 0)
			preco = _preco;
	}
	
	public float getPreco() {
		return preco;
	}

}
