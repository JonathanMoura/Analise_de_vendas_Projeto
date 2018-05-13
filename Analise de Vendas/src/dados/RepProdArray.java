/*---------------------------------------------
 * Autor: Jonathan Moura
 * Data:29/04/2018
 *---------------------------------------------
 * Descri��o: Repositorio array para produtos
 * 
 *---------------------------------------------
 * Hist�rico de modifica��o
 * Data    Autor    Descri��o
 *       |        |
 *-------------------------------------------*/
package dados;
import negocio.Produto;
public class RepProdArray extends RepositorioArray {
	private Produto[] repositorio;
	
	public RepProdArray() {
		super();
		this.repositorio = new Produto[TAMANHO];
	}
}