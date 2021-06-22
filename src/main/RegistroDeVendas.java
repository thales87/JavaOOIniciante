package main;

import cont.CarrinhoDeCompras;
import cont.livraria.Autor;
import cont.produtos.Ebook;
import cont.produtos.LivroFisico;

public class RegistroDeVendas {

	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Paulo");
		
		LivroFisico livroFisico = new LivroFisico(autor);
		livroFisico.setNome("Arquitetura");
		livroFisico.setValor(100);
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("TDD");
		ebook.setValor(200);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(livroFisico);
		carrinho.adiciona(ebook);
		
		System.out.println(carrinho.getTotal());
	}
	
}
