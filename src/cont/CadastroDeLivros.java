package cont;

public class CadastroDeLivros {

	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Joshua Bloch");
		autor.setCpf("123.456.789-09");
		autor.setEmail("autor@gmail.com");

		Livro livro = new Livro(autor);
		livro.setNome("Java Efetivo");
		livro.setDescricao("Melhores práticas no java");
		livro.setValor(49.9);
		livro.setIsbn("123-456-789");

		livro.mostrarDetalhes();

		Autor outroAutor = new Autor(); 
		outroAutor.setNome("Keith Sierra"); 
		outroAutor.setCpf("000.111.222-33"); 
		outroAutor.setEmail("bart@useacabeca.com");
		  
		Livro outroLivro = new Livro(outroAutor);
		outroLivro.setNome("Use a cabeça Java");
		outroLivro.setDescricao("Introdução ao Java");
		outroLivro.setValor(89.9);
		outroLivro.setIsbn("000-999-888");
		 
		outroLivro.mostrarDetalhes();
	}

}
