package com.br.avaliacao.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.avaliacao.models.Receita;
import com.br.avaliacao.reposiroies.ReceitaRepositoty;

@Service
public class ReceitaService {

	@Autowired
	private ReceitaRepositoty receitaRepositoty;

	public void criarReceira(Receita novaReceita) {
		receitaRepositoty.save(novaReceita);

	}

	public long qunatidade() {
		return receitaRepositoty.count();
	}

	public Iterable<Receita> exibirTodas() {
		return receitaRepositoty.findAll();
	}

	public Receita buscarPoId(int id) {
		return receitaRepositoty.findById(id).get();
	}

	public Receita atualizarReceita(int id, Receita atualizar) {
		Receita teste = new Receita();
		teste = receitaRepositoty.findById(id).get();

		if (teste!= null) {
			atualizar.setId(id);
			return receitaRepositoty.save(atualizar);

		}
		return null;

	}

	public void excluirReceita(int id) {
		receitaRepositoty.deleteById(id);
	}

}
