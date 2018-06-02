package negocio;

import entidades.Produto;
import entidades.Vendedor;
import interfaces.IRepositorioVendProd;

public class CadastroVendProd {
private IRepositorioVendProd repositorio;
	
	public CadastroVendProd(IRepositorioVendProd repositorio) {
		this.repositorio = repositorio;
	}
	public void inserir(Vendedor vendedor,Produto produto){
		repositorio.inserir(vendedor,produto);
	}
}
