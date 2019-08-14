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

	public Receita atualizarReceita(Receita atualizar) {
		Receita verifica = new Receita();
		verifica = receitaRepositoty.findById(atualizar.getId()).get();

		if (verifica != null) {
			return receitaRepositoty.save(atualizar);

		}
		return null;

	}

	public void excluirReceita(int id) {
		receitaRepositoty.deleteById(id);
	}

}
