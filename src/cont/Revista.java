package cont;

public class Revista implements Produto, Promocional {
	
	private String nome;
	private String descricao;
	private double valor;
	private Editora editora;
	
	public boolean aplicaDescontoDe(double porcentagem) {
		if(porcentagem > 0.1) {
			return false;
		}
		System.out.println("Aplicando desconto na Revista " + this.nome);
		double desconto = this.valor * porcentagem;
		setValor(getValor() - desconto);
		return true;
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

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	
}
