CREATE TABLE USUARIOINFO (
  id_USUARIOINFO INTEGER  NOT NULL,
  nome VARCHAR(45) NOT NULL,
  email VARCHAR(45) NOT NULL,
  telefone VARCHAR(20) NOT NULL,
  usuario VARCHAR(45) NOT NULL,
  senha VARCHAR(32) NOT NULL,
PRIMARY KEY(id_USUARIOINFO)
);


CREATE TABLE ATRACAO (
  id_ATRACAO INTEGER NOT NULL,
  nome VARCHAR(45) NOT NULL,
  sinopse VARCHAR(255) NOT NULL,
  id_usuario INTEGER NOT NULL,
PRIMARY KEY(id_ATRACAO),
FOREIGN KEY(id_usuario) REFERENCES USUARIOINFO(id_USUARIOINFO)
);


CREATE TABLE FILME (
  id_FILME INTEGER NOT NULL ,
  indicacoesOscar INTEGER NOT NULL,
PRIMARY KEY(id_FILME),
FOREIGN KEY(id_FILME) REFERENCES ATRACAO(id_ATRACAO)
);

CREATE TABLE SERIE (
  id_SERIE INTEGER NOT NULL,
  numTemporadas INTEGER NOT NULL,
PRIMARY KEY(id_SERIE),
FOREIGN KEY(id_SERIE) REFERENCES ATRACAO(id_ATRACAO)
);

CREATE TABLE EPISODIO (
  id_EPISODIO INTEGER NOT NULL,
  nome VARCHAR(45)NOT NULL,
  fk_serie INTEGER NOT NULL,
PRIMARY KEY(id_EPISODIO),
FOREIGN KEY(fk_serie) REFERENCES SERIE(id_SERIE)
);

-- Drops
Drop table usuarioinfo;
Drop table atracao;
Drop table filme;
Drop table serie;
Drop table episodio;
