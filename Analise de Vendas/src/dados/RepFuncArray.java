/*------------------------------------------------
 * Autor: Jonathan Moura
 * Data:29/04/2018
 *------------------------------------------------
 * Descri��o: Repositorio array para funcion�rios
 * 
 *------------------------------------------------
 * Hist�rico de modifica��o
 * Data    Autor    Descri��o
 *       |        |
 *----------------------------------------------*/
package dados;
import negocio.Funcionario;
public class RepFuncArray extends RepositorioArray{
	private Funcionario[] repositorio;
	
	public RepFuncArray() {
		super();
		this.repositorio = new Funcionario[TAMANHO];
	}
}
