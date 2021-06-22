package main;

import cont.Autor;
import cont.Ebook;
import cont.Livro;
import cont.MiniLivro;

public class RegrasDeDesconto {

	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Joshua Bloch");
		autor.setCpf("123.456.789-09");
		autor.setEmail("autor@gmail.com");
		
		Livro livro = new MiniLivro(autor);
		livro.setValor(100);
		
		if(!livro.aplicaDescontoDe(0.2)) {
			System.out.println("Desconto não pode ser maior que 30%");
		}else {
			System.out.println(livro.getValor());
		}
		
		Ebook ebook = new Ebook(autor);
		ebook.setValor(100);
		
		if(!ebook.aplicaDescontoDe(0.2)) {
			System.out.println("Desconto não pode ser maior que 15%");
		}else {
			System.out.println(ebook.getValor());
		}
	}
	
}
