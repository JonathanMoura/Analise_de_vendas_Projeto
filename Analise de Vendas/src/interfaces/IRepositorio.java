/*---------------------------------------------
 * Autor: Jonathan Moura
 * Data:30/04/2018
 *---------------------------------------------
 * Descri��o: Interface dos Repositorios
 * 
 *---------------------------------------------
 * Hist�rico de modifica��o
 * Data    Autor    Descri��o
 *       |        |
 *-------------------------------------------*/
package interfaces;
import excecoes.CPFNaoEncontradoException;
import negocio.Objetos;
public interface IRepositorio {
	public void inserir(Objetos objeto,String comando);
//	public boolean existe(String identificador);
	public Object procurar(String comando, String identificador) throws CPFNaoEncontradoException;
	public void remover(String comando, String identificador);
	public void atualizar(Objetos objeto,String comando);
}
