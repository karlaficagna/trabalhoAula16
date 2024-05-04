package com.fundatec.aula11.controller;

import com.fundatec.aula11.dominio.Endereco;
import com.fundatec.aula11.dominio.Pessoa;
import com.fundatec.aula11.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping("teste")
    public ResponseEntity<Void> teste() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("nome");

        Endereco endereco = new Endereco();
        endereco.setLogradouro("logradouro");
        endereco.setPessoa(pessoa);

        pessoa.setEnderecos(Arrays.asList(endereco));

        pessoaService.salvar(pessoa);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Pessoa> salvar(@RequestBody Pessoa pessoa) {
        Pessoa resultado = pessoaService.salvar(pessoa);

        return new ResponseEntity(resultado, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Pessoa> findById(@PathVariable Long id) {
        Pessoa resultado;

        try {
            resultado = pessoaService.findById(id);

            return new ResponseEntity(resultado, HttpStatus.OK);
        } catch (RuntimeException exception) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<Pessoa>> findAll() {
        List<Pessoa> resultado = pessoaService.procuraTodasPessoas();

        return new ResponseEntity(resultado, HttpStatus.OK);
    }

}
