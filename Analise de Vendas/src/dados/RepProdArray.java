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
import interfaces.IRepositorioProduto;
import negocio.Produto;
public class RepProdArray implements IRepositorioProduto{
	public static final int TAMANHO = 1000000;
	private int indice;
	private int i;
	private Produto[] repositorio;
	
	public RepProdArray() {
		this.repositorio = new Produto[TAMANHO];
		indice = 0;
	}

	public int getIndice(String identificador) {
		i = 0;
		if (indice != 0) {
			while (!identificador.equals(repositorio[i].getNome())) {
				if (i > indice) {
					return -1;
				} else
					i++;
			}
			return i;
		}
		return -1;
	}

	public void inserir(Produto produto) {
		if (!existe(produto.getNome())) {
			repositorio[indice] = produto;
			indice++;
		}
	}

	public boolean existe(String identificador) {
		i = getIndice(identificador);
		if (i == -1)
			return false;
		else
			return true;
	}

	public Produto procurar(String identificador) {
		if (existe(identificador)) {
			return this.repositorio[i];
		}
		return null;
	}

	public void remover(String identificador) {
		if (!existe(identificador)) {
			System.err.println("Erro!");
		}
		repositorio[i] = null;
		repositorio[i] = repositorio[indice - 1];
		repositorio[indice - 1] = null;
		indice--;
	}
	
	public void atualizar(Produto produto) {
		if (!existe(produto.getNome())) {
			System.err.println("Erro!");
		}
		repositorio[i] = produto;
	}
}