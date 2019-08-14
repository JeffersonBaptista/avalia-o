package com.br.avaliacao.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.avaliacao.models.Receita;
import com.br.avaliacao.services.ReceitaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/receitas/brasileiras")
public class ReceitaControle {
	@Autowired
	private ReceitaService receitaService;

	@PostMapping("/")
	public ResponseEntity<?> salvarReceita(@RequestBody Receita receita) {

		try {
			receitaService.criarReceira(receita);
			return ResponseEntity.status(HttpStatus.CREATED).body(receita);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}

	}

	@GetMapping("/")
	public ResponseEntity<?> exibirTodos() {
		try {
			return ResponseEntity.ok().body(receitaService.exibirTodas());

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> pegarPorId(@PathVariable int id) {
		try {
			return ResponseEntity.ok().body(receitaService.buscarPoId(id));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}

	@PutMapping("/")
	public ResponseEntity<?> atualizarReceita(@RequestBody Receita receita) {

		try {

			return ResponseEntity.ok().body(receitaService.atualizarReceita(receita));

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}

	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?>excluirReceita(@PathVariable int id){
		try {
			receitaService.excluirReceita(id);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	
	
	

}
