/*
 * Eden Paulo Gill
 * 
 * Linguagem de Programação II
 * 
 * Exercício NotaFiscal
 * 
 * Classe Cliente
 * 
 */

package dominio;

public class Cliente {
	private String nome;
	
	public Cliente(String _nome) {
		setNome(_nome);
	}

	public void setNome(String _nome) {
		nome = _nome;
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return nome;
	}
}
