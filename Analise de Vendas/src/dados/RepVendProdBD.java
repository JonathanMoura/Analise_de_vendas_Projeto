package dados;

import java.sql.ResultSet;
import java.sql.Statement;

import entidades.Produto;
import entidades.Funcionario;
import interfaces.IRepositorioVendProd;

public class RepVendProdBD extends RepositorioBD implements IRepositorioVendProd{
	private static final String INSERIR   = "INSERT INTO vendedor_produto ";
	private static final String CAMPOS    = "(id, produto_nome, descricao, quantidade, valor, vendedor_cpf) ";	
	private static final String PROCURAR  = "SELECT * FROM vendedor_produto ";
	
	public void inserir(Funcionario vendedor, Produto produto){
		/*Construir comando sql para inserir os valores 
		 *dos atributos do produto e do vendedor 
		 *no repositorio de banco de dados */
		String valores =  "values (default,\'" + produto.getNome() 		 + "\',\'" 
				 							   + produto.getDescricao()  + "\'," 
				 							   + produto.getQuantidade() + "," 
				 							   + produto.getValor() 	 + ",\'" 
											   + vendedor.getCpf()	 + "\')";
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
	public ResultSet listar(){
		String comando = PROCURAR;
		try {
			Statement stm = con.createStatement(1, 0);
			ResultSet rs = stm.executeQuery(comando);
			if (rs != null) {
				System.out.println("Sucesso!");
				return rs;
			} else {
				System.err.println("Erro!");
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
