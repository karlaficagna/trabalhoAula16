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
CREATE TABLE contato (
    id bigserial NOT NULL,
    telefone varchar(255),
    id_pessoa bigserial,
    CONSTRAINT pessoa_fkey PRIMARY KEY(id_pessoa)
    REFERENCES pessoa(id)
);

CREATE TABLE Comercial(
      id bigserial NOT NULL,
      nome_empresa varchar(255),
      cnpj varchar(255),
      id_pessoa bigserial,
      CONSTRAINT pessoa_fkey PRIMARY KEY(id_pessoa)
      REFERENCES pessoa(id)
  );

  CREATE TABLE Hobby(
          id bigserial NOT NULL,
          nome_Hobby varchar(255),
          id_pessoa bigserial,
          CONSTRAINT pessoa_fkey PRIMARY KEY(id_pessoa)
          REFERENCES pessoa(id)
      );