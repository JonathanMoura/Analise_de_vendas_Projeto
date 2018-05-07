/*------------------------------------------------
 * Autor: Diogo Souza
 * Data:04/05/2018
 *------------------------------------------------
 * Descri��o: Telas Assistentes: Para confirma-
 *  ��es e entre outros;
 *------------------------------------------------
 * Hist�rico de modifica��o
 * Data    Autor    Descri��o
 *       |        |
 *----------------------------------------------*/

package telas;

import javax.swing.JOptionPane;

public class TelasAssistentes {
	
	private static int confirm;
	
	public TelasAssistentes(int confirm) {
		super();
		TelasAssistentes.confirm = confirm;
	}
    
	public int getConfirm() {
		return confirm;
	}


	public void setConfirm(int confirm) {
		TelasAssistentes.confirm = confirm;
	}


	public static void ConfirmarCadastro() {
		
		confirm = JOptionPane.showConfirmDialog(null, "Voc� realmente deseja cadastrar?", "Cadastrado", JOptionPane.YES_NO_OPTION);
	}
	

}