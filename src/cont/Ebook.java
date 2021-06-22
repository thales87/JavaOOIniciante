package cont;

public class Ebook extends Livro{
	
	private String waterMark;

	public Ebook(Autor autor) {
		super(autor);
	}
	
	public boolean aplicaDescontoDe(double porcentagem) {
		if(porcentagem > 0.15) {
			return false;
		}
		System.out.println("Aplicando desconto de " + porcentagem + " no Ebook "+ getNome());
		double desconto = this.getValor() * porcentagem;
		this.setValor(this.getValor() - desconto);
		return true;
	}
	
	public String getWaterMark() {
		return waterMark;
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}

}
