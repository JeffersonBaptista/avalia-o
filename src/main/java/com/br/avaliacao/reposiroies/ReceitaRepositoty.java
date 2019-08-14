package com.br.avaliacao.reposiroies;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.avaliacao.models.Receita;

@Repository
public interface ReceitaRepositoty extends CrudRepository<Receita, Integer>{

}
