package cont;

public class LivroFisico extends Livro{

	public LivroFisico(Autor autor) {
		super(autor);
	}
	
	public double getTaxaImpressao() {
		return this.getValor() * 0.05;
	}
	
	public boolean aplicaDescontoDe(double porcentagem) {
		if(porcentagem > 0.3) {
			return false;
		}
		System.out.println("Aplicando desconto de " + porcentagem + " no livroFisico "+ getNome());
		double desconto = getValor()*porcentagem;
		this.setValor(getValor() - desconto );
		return true;
	}
	
}
