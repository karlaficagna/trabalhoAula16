package com.fundatec.aula11.dominio;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;


    @Entity
    @Table(name = "contato")
    public class Contato {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @Column(name = "telefone")
        private String telefone;

        @ManyToOne
        @JoinColumn(name = "id_pessoa", referencedColumnName = "id")
        @JsonBackReference
        private Pessoa pessoa;

        public Contato() {
        }

        public Contato(Long id, String telefone, Pessoa pessoa) {
            this.id = id;
            this.telefone = telefone;
            this.pessoa = pessoa;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public Pessoa getPessoa() {
            return pessoa;
        }

        public void setPessoa(Pessoa pessoa) {
            this.pessoa = pessoa;
        }
    }

