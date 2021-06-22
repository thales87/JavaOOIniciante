package cont;

import cont.produtos.Produto;

public class CarrinhoDeCompras {

	private double total;
	private Produto[] produtos = new Produto[10];
	private int contador = 0;
	
	public void adiciona(Produto produto) {
		System.out.println("Adicionando: " + produto);
		produtos[contador] = produto;
		contador++;
		total += produto.getValor();
	}
	
	public double getTotal() {
		return total;
	}
}
