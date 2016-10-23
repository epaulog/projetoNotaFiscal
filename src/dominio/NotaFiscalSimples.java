/*
 * Eden Paulo Gill
 * 
 * Linguagem de Programação II
 * 
 * Exercício NotaFiscal
 * 
 * Classe NotaFiscalSimples
 * 
 */

package dominio;

public class NotaFiscalSimples extends NotaFiscal{

	public NotaFiscalSimples(Cliente _cliente, int _numero) {
		super(_cliente, _numero);
	}
	
	public float imposto() {
		return (this.valorProdutos() * 1.20f);
	};
	
}
