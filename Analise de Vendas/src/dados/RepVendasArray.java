/*---------------------------------------------
 * Autor: Jonathan Moura
 * Data:29/04/2018
 *---------------------------------------------
 * Descri��o: Repositorio array para vendas
 * 
 *---------------------------------------------
 * Hist�rico de modifica��o
 * Data    Autor    Descri��o
 *       |        |
 *-------------------------------------------*/
package dados;
import negocio.Vendas;
public class RepVendasArray extends RepositorioArray{
	private Vendas[] repositorio;
	
	public RepVendasArray() {
		super();
		this.repositorio = new Vendas[TAMANHO];
	}
}