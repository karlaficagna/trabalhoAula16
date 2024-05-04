package com.fundatec.aula11.repositorio;

import com.fundatec.aula11.dominio.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoaRepositorio extends JpaRepository<Pessoa, Long> {
}
