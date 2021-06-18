package cont;

public class CadastroDeLivros {

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.nome="Java Efetivo";
		livro.descricao="Melhores práticas no java";
		livro.valor=49.9;
		livro.isbn="123-456-789";
		
		Autor autor = new Autor();
		autor.nome = "Joshua Bloch";
		autor.cpf = "123.456.789-09";
		autor.email = "autor@gmail.com";
		
		livro.autor = autor;
		
		livro.mostrarDetalhes();
		
		Livro outroLivro = new Livro();
		outroLivro.nome="Use a cabeça Java";
		outroLivro.descricao="Introdução ao Java";
		outroLivro.valor=89.9;
		outroLivro.isbn="000-999-888";
		
		/*
		 * Autor outroAutor = new Autor(); outroAutor.nome = "Keith Sierra";
		 * outroAutor.cpf = "000.111.222-33"; outroAutor.email = "bart@useacabeca.com";
		 * 
		 * outroLivro.autor = outroAutor;
		 */
		
		outroLivro.mostrarDetalhes();
	}
	
}
