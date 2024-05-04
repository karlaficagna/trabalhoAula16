package com.fundatec.aula11.dominio;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "telefone")
public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "numeroResidencial")
    private String numerResidencial;
    @Column(name = "numeroComercial")
    private String numeroComercial;


    @ManyToOne
    @JoinColumn(name = "id_pessoa", referencedColumnName = "id")
    @JsonBackReference
    private Pessoa pessoa;

    public Contato(Long id, String logradouro) {
        this.id = id;
        this.logradouro = logradouro;
    }

    public Contato() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumerResidencial() {
        return numerResidencial;
    }

    public void setNumerResidencial(String numerResidencial) {
        this.numerResidencial = numerResidencial;
    }

    public String getNumeroComercial() {
        return numeroComercial;
    }

    public void setNumeroComercial(String numeroComercial) {
        this.numeroComercial = numeroComercial;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
