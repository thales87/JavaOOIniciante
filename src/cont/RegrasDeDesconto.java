package cont;

public class RegrasDeDesconto {

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.setValor(100);
		
		if(!livro.aplicaDescontoDe(0.2)) {
			System.out.println("Desconto não pode ser maior que 30%");
		}else {
			System.out.println(livro.getValor());
		}
	}
	
}
