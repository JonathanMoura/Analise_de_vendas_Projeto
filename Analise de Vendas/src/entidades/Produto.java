/*---------------------------------------------
 * Autor: Jonathan Moura
 * Data:29/04/2018
 *---------------------------------------------
 * Descri��o: Classe do produto
 * 
 *---------------------------------------------
 * Hist�rico de modifica��o
 * Data    Autor    Descri��o
 *       |        |
 *-------------------------------------------*/
package entidades;

import excecoes.ProdutoQuantidadeException;

public class Produto {
	private String nome, descricao, chave;
	private int quantidade;
	private double valor;
	
	public Produto(){
		
	}
	
	public Produto(String nome, String descricao, int quantidade, double valor, String chave) {
		this.nome = nome;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.valor = valor;
		this.chave = chave;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}
	
	public void getProduto(int quantidade) throws ProdutoQuantidadeException{
		if(this.quantidade > quantidade){
			this.quantidade -= quantidade;
		}else{
			throw new ProdutoQuantidadeException();
		}
	}
	
}

