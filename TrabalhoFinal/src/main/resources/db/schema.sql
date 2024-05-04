CREATE TABLE pessoa (
    id bigserial NOT NULL,
    nome varchar(255),
    CONSTRAINT pessoa_pkey PRIMARY KEY(id)
);

CREATE TABLE endereco (
    id bigserial NOT NULL,
    logradouro varchar(255),
    id_pessoa bigserial,
    CONSTRAINT endereco_pkey PRIMARY KEY(id),
    CONSTRAINT pessoa_fkey FOREIGN KEY(id_pessoa)
    REFERENCES pessoa(id)
);