package br.com.arm.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cano")
public class Cano extends Produto  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String comprimento;

	public String getComprimento() {
		return comprimento;
	}

	public void setComprimento(String comprimento) {
		this.comprimento = comprimento;
	}

}
