package cont;

public class Ebook extends Livro{
	
	private String waterMark;

	public Ebook(Autor autor) {
		super(autor);
	}
	
	public boolean aplicaDescontoDe(double percentual) {
		if(percentual > 0.15) {
			return false;
		}
		double desconto = this.getValor() * percentual;
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
