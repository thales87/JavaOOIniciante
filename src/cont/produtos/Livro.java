package cont.produtos;

import cont.exception.AutorNuloException;
import cont.livraria.Autor;

public abstract class Livro implements Produto{

	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	
	public Livro(Autor autor) {
		if(autor == null) {
			throw new AutorNuloException("O Autor não pode ser nulo");
		}
		this.autor = autor;
		this.isbn = "000-00-00000-00-0";
	}
	
	public void mostrarDetalhes() {
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
