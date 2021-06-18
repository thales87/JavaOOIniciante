package cont;

public class Livro {

	String nome;
	String descricao;
	double valor;
	String isbn;
	Autor autor;
	
	void mostrarDetalhes() {
		System.out.println("Dados do Livro:");
		System.out.println("Nome:" + nome);
		System.out.println("Descrição:" + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("ISBN: " + isbn);
		if(this.temAutor()) {
			autor.mostrarDetalhes();
		}
		System.out.println("--");
	}
	
	void aplicaDescontoDe(double percentual) {
		this.valor -= this.valor*percentual; 
	}
	
	boolean temAutor() {
		return this.autor != null;
	}
}
