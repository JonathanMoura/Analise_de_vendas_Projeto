package interfaces;

import entidades.Produto;

import java.sql.ResultSet;

import entidades.Funcionario;

public interface IRepositorioVendProd {

	public void inserir(Funcionario vendedor, Produto produto);
	public ResultSet listar();
}
