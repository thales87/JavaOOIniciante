package cont;

public class MiniLivro extends Livro{

	public MiniLivro(Autor autor) {
		super(autor);
	}
	
	public boolean aplicaDescontoDe(double porcentagem) {
		return false;
	}

}
