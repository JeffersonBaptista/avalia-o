package com.br.avaliacao.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Receita implements Serializable{
	private static final long serilVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	private String nome;
	
	@NotBlank(message = "Campo ingredoientes é obrigatorio")
	private String ingredientes;
	
	@NotBlank(message = "Campo modo de preparara é obrigatorio")
	private String modoDePreparar;

	public Receita() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getModoDePreparar() {
		return modoDePreparar;
	}

	public void setModoDePreparar(String modoDePreparar) {
		this.modoDePreparar = modoDePreparar;
	}
	
	
	

}
