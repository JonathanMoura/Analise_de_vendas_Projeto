/*------------------------------------------------
 * Autor: Diogo Souza
 * Data:04/05/2018
 *------------------------------------------------
 * Descri��o: Telas Assistentes: Para confirma-
 *  ��es e entre outros;
 *------------------------------------------------
 * Hist�rico de modifica��o
 * Data             Autor                   Descri��o
 * 09/05/2018 |  Diogo Souza      | Adi��o do m�todo confirmar exclus�o;
 *----------------------------------------------------------------------*/

package telas;

import javax.swing.JOptionPane;

public class TelasAssistentes {
	
	private static int confirm;

	public static void ConfirmarCadastro() {
		
		confirm = JOptionPane.showConfirmDialog(null, "Voc� realmente deseja cadastrar?", "Cadastrado", JOptionPane.YES_NO_OPTION);
	}
	
	public static void ConfirmarExclusao() {
		confirm = JOptionPane.showConfirmDialog(null, "Voc� realmente deseja excluir?", "Exclu�do", JOptionPane.YES_NO_OPTION);
	}
	
	public static void ConfirmarBusca() {
		confirm = JOptionPane.showConfirmDialog(null, "Confirma os dados para busca?", "Busca Conclu�da", JOptionPane.YES_NO_OPTION);
	}
	
	public static void ConfirmarEdicaoDados() {
		confirm = JOptionPane.showConfirmDialog(null, "Confirma os dados?", "Edi��o Conclu�da", JOptionPane.YES_NO_OPTION);
	}
	
	public static void ConfirmarProduto() {
		confirm = JOptionPane.showConfirmDialog(null, "Voc� realmente deseja cadastrar o produto?", "Cadastrado", JOptionPane.YES_NO_OPTION);
	}
	
	public static void ConfirmarDistribuicao() {
		confirm = JOptionPane.showConfirmDialog(null, "Confirma a distribui��o?", "Distrubu�do", JOptionPane.YES_NO_OPTION);
	}

}