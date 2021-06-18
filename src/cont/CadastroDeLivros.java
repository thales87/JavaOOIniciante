package cont;

public class CadastroDeLivros {

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.setNome("Java Efetivo");
		livro.setDescricao("Melhores práticas no java");
		livro.setValor(49.9);
		livro.setIsbn("123-456-789");
		
		Autor autor = new Autor();
		autor.setNome("Joshua Bloch");
		autor.setCpf("123.456.789-09");
		autor.setEmail("autor@gmail.com");

		livro.setAutor(autor);
		
		livro.mostrarDetalhes();
		
		
		Livro outroLivro = new Livro();
		outroLivro.setNome("Use a cabeça Java");
		outroLivro.setDescricao("Introdução ao Java");
		outroLivro.setValor(89.9);
		outroLivro.setIsbn("000-999-888");
		
		/*
		 * Autor outroAutor = new Autor(); outroAutor.nome = "Keith Sierra";
		 * outroAutor.cpf = "000.111.222-33"; outroAutor.email = "bart@useacabeca.com";
		 * 
		 * outroLivro.autor = outroAutor;
		 */
		
		outroLivro.mostrarDetalhes();
	}
	
}
