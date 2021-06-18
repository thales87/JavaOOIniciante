package cont;

public class Livro {

	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	
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
	
	public boolean aplicaDescontoDe(double percentual) {
		if(percentual > 0.3) {
			return false;
		}
		
		this.valor -= this.valor*percentual;
		return true;
	}
	
	boolean temAutor() {
		return this.autor != null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
}
