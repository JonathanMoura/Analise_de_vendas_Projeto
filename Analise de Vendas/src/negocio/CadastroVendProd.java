package negocio;

import entidades.Produto;

import java.sql.ResultSet;

import entidades.Funcionario;
import interfaces.IRepositorioVendProd;

public class CadastroVendProd {
private IRepositorioVendProd repositorio;
	
	public CadastroVendProd(IRepositorioVendProd repositorio) {
		this.repositorio = repositorio;
	}
	public void inserir(Funcionario vendedor,Produto produto){
		repositorio.inserir(vendedor,produto);
	}
	public ResultSet listar(){
		return repositorio.listar();
	}
}
