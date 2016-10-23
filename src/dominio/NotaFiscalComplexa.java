/*
 * Eden Paulo Gill
 * 
 * Linguagem de Programação II
 * 
 * Exercício NotaFiscal
 * 
 * Classe NotaFiscalComplexa
 * 
 */

package dominio;

public class NotaFiscalComplexa extends NotaFiscal{

public NotaFiscalComplexa(Cliente _cliente, int _numero) {
	super(_cliente, _numero);
}

public float imposto() {
	return (this.valorProdutos() + 100f);
};

}
