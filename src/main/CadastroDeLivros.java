package main;

import cont.livraria.Autor;
import cont.produtos.Ebook;
import cont.produtos.Livro;
import cont.produtos.LivroFisico;

public class CadastroDeLivros {

	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Joshua Bloch");
		autor.setCpf("123.456.789-09");
		autor.setEmail("autor@gmail.com");

		Livro livro = new LivroFisico(autor);
		livro.setNome("Java Efetivo");
		livro.setDescricao("Melhores pr?ticas no java");
		livro.setValor(49.9);
		livro.setIsbn("123-456-789");

		livro.mostrarDetalhes();

		Autor outroAutor = new Autor(); 
		outroAutor.setNome("Keith Sierra"); 
		outroAutor.setCpf("000.111.222-33"); 
		outroAutor.setEmail("bart@useacabeca.com");
		  
		Livro outroLivro = new Ebook(outroAutor);
		outroLivro.setNome("Use a cabe?a Java");
		outroLivro.setDescricao("Introdu??o ao Java");
		outroLivro.setValor(29.9);
		outroLivro.setIsbn("000-999-888");
		 
		outroLivro.mostrarDetalhes();
	}

}
