/*
 * Eden Paulo Gill
 * 
 * Linguagem de Programação II
 * 
 * Exercício NotaFiscal
 * 
 * Classe NotaFiscal
 * 
 */

package dominio;

import java.util.ArrayList;
import java.util.List;

public abstract class NotaFiscal {
	private int numero;
	private Cliente cliente;
	private List<Produto> listaProdutos = new ArrayList<Produto>();
	
	public NotaFiscal(Cliente _cliente, int _numero) {
		cliente = _cliente;
		numero = _numero;
	}
	
	public float valorProdutos() {
		float valorProd = 0;
		for (Produto prod: listaProdutos) {
	    	valorProd += prod.getPreco();
	    }
		return valorProd;
	}
	
	public float valorTotal() {
		return (this.valorProdutos() + this.imposto());
	}
	
	public void incluirProduto(Produto _produto) {
		listaProdutos.add(_produto);
	}
	
	abstract public float imposto();
	
	public int getNumero() {
		return numero;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public List<Produto> getProdutos() {
		return listaProdutos;
	}

	
	
}