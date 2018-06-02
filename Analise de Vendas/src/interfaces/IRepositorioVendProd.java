package interfaces;

import entidades.Produto;
import entidades.Vendedor;

public interface IRepositorioVendProd {

	public void inserir(Vendedor vendedor, Produto produto);

}
