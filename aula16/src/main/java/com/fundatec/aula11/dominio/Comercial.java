package com.fundatec.aula11.dominio;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
@Entity
@Table(name = "comercial")
public class Comercial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "empresa")
    private String empresa;

    @Column(name = "cnpj")
    private String cnpj;

    @OneToOne
    @JoinColumn(name = "id_pessoa", referencedColumnName = "id")
    @JsonBackReference
    private Pessoa pessoa;

    public Comercial() {
    }

    public Comercial(Long id, String empresa, String cnpj, Pessoa pessoa) {
        this.id = id;
        this.empresa = empresa;
        this.cnpj = cnpj;
        this.pessoa = pessoa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}



