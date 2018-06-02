package dados;

import java.sql.Statement;

import entidades.Produto;
import entidades.Vendedor;
import interfaces.IRepositorioVendProd;

public class RepVendProdBD extends RepositorioBD implements IRepositorioVendProd{
	private static final String INSERIR   = "INSERT INTO vendedor_produto ";
	private static final String CAMPOS    = "(id, nome, descricao, quantidade, valor, chave) ";	
	
	public void inserir(Vendedor vendedor, Produto produto){
		/*Construir comando sql para inserir os valores 
		 *dos atributos do produto e do vendedor 
		 *no repositorio de banco de dados */
		String valores =  "values (default,\'" + produto.getNome() 		 + "\',\'" 
				 							   + produto.getDescricao()  + "\'," 
				 							   + produto.getQuantidade() + "," 
				 							   + produto.getValor() 	 + ",\'" 
											   + vendedor.getChave()	 + "\')";
		String comando = INSERIR + CAMPOS + valores;
		//Grava no banco de dados
		try {
			Statement stm = con.createStatement();
			int res = stm.executeUpdate(comando);
			if (res > 0) {
				System.out.println("Sucesso!");
			} else {
				System.err.println("Erro!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
