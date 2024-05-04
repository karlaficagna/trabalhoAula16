package com.fundatec.aula11.service;

import com.fundatec.aula11.dominio.Pessoa;
import com.fundatec.aula11.repositorio.PessoaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepositorio pessoaRepositorio;

    public PessoaService(PessoaRepositorio pessoaRepositorio) {

        this.pessoaRepositorio = pessoaRepositorio;
    }

    public Pessoa findById(Long id) {
        Optional<Pessoa> resultado = pessoaRepositorio.findById(id);
        if (!resultado.isPresent()) {
            throw new RuntimeException("Pessoa não encontrada");
        }
        return resultado.get();
    }

    public Pessoa salvar(Pessoa pessoaParaSalvar) {
        if(pessoaParaSalvar.getNome() == null) {
            throw new RuntimeException("Pessoa deve conter um nome");
        }
        Pessoa pessoaSalva = pessoaRepositorio.save(pessoaParaSalvar);
        return pessoaSalva;
    }

    public List<Pessoa> procuraTodasPessoas() {
        return pessoaRepositorio.findAll();
    }
}
