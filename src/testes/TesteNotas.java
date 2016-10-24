/*
 * Eden Paulo Gill
 * 
 * Linguagem de Programação II
 * 
 * Exercício NotaFiscal
 * 
 * Classe TesteNotas
 * 
 */

package testes;

import dominio.Cliente;
import dominio.NotaFiscal;
import dominio.NotaFiscalComplexa;
import dominio.NotaFiscalSimples;
import dominio.Produto;

import java.util.ArrayList;
import java.util.List;

public class TesteNotas {
	
	
	public static void main(String [] args){
		
		List<NotaFiscal> listaNF = new ArrayList<NotaFiscal>();
		
		Cliente clienteJoao = new Cliente("João");
		Cliente clienteJose = new Cliente("Jose");
		Cliente clienteMaria = new Cliente("Maria");
		Cliente clientePaula = new Cliente("Paula");
		
		Produto produto;
		
		NotaFiscal notaFiscal = new NotaFiscalSimples(clienteJoao, 1);
		
		produto= new Produto("Computador", 900.00f);
		notaFiscal.incluirProduto(produto);
		
		produto= new Produto("Teclado", 20.00f);
		notaFiscal.incluirProduto(produto);
		
		produto= new Produto("Mouse", 15.00f);
		notaFiscal.incluirProduto(produto);

		listaNF.add(notaFiscal);
		
		
		notaFiscal = new NotaFiscalSimples(clienteMaria, 2);
		
		produto= new Produto("Caderno", 10.00f);
		notaFiscal.incluirProduto(produto);
		
		produto= new Produto("Caneta", 5.00f);
		notaFiscal.incluirProduto(produto);
		
		produto= new Produto("Lápis", 1.00f);
		notaFiscal.incluirProduto(produto);
		
		listaNF.add(notaFiscal);

		
		notaFiscal = new NotaFiscalComplexa(clienteJoao, 3);
		
		produto= new Produto("Sensor pH", 1000.00f);
		notaFiscal.incluirProduto(produto);
		
		produto= new Produto("Sensor Temperatura", 2000.00f);
		notaFiscal.incluirProduto(produto);
		
		listaNF.add(notaFiscal);

		
		notaFiscal = new NotaFiscalComplexa(clienteJose, 4);
		
		produto= new Produto("Medidor UV", 10500.00f);
		notaFiscal.incluirProduto(produto);
		
		produto= new Produto("Medidor Solar", 20500.00f);
		notaFiscal.incluirProduto(produto);
		
		produto= new Produto("Lápis", 1.00f);
		notaFiscal.incluirProduto(produto);
		
		listaNF.add(notaFiscal);
		
		
		for (NotaFiscal nf: listaNF) {
			System.out.println("Número: " + nf.getNumero());
			System.out.println("Cliente: " + nf.getCliente());
			System.out.println("Produtos:");
			
			for (Produto prod: nf.getProdutos()) {
				System.out.println(prod.toString());
			}
			
			System.out.println("Valor Produtos = " + nf.valorProdutos());
			System.out.println("Valor Imposto  = " + nf.imposto());
			System.out.println("Valor Total    = " + nf.valorTotal());
			
		}
		
		
		
    }
	
}