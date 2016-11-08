insert into USUARIOINFO values (1, 'Lucas Portella', 'lucas@gmail.com', '991437343', 'lucasp', 'senha1');
insert into USUARIOINFO values (2, 'Pedro Manha', 'pedro@gmail.com', '988132432', 'ipedrinho', 'asdf');
insert into USUARIOINFO values (3, 'Fabio Marquesim', 'fabio@gmail.com', '981846343', 'fabiom', '123');
insert into USUARIOINFO values (4, 'Victor', 'victor@outlook.com', '997452162', 'i7zvictor', 'abc12');
insert into USUARIOINFO values (5, 'Alexandre', 'alexandre@outlook.com', '94452672', 'ale', 'ale3');


insert into ATRACAO values (1001, 'Clube da Luta', 'Filme com Edward Norton', 1);
insert into ATRACAO values (1002, 'Interstellar', 'Filme sobre dimensões', 1);
insert into ATRACAO values (1003, 'Silicon Valley', 'Serie de comedia no Vale do Silicio', 3);
insert into ATRACAO values (1004, 'Mr Robot', 'Serie sobre um hacker', 4);
insert into ATRACAO values (1005, 'Inception', 'Filme sobre dimensões no sonho', 2);
insert into ATRACAO values (1006, 'Harry Potter: 1', 'Filme sobre bruxos', 5);



insert into FILME values (1001, 1);
insert into FILME values (1002, 5);
insert into FILME values (1005, 7);
insert into FILME values (1006, 0);

insert into SERIE values (1003, 3);

insert into EPISODIO(ID_EPISODIO, NOME, FK_SERIE) values (101, 'Produto Minimo Viavel', 1003);
insert into EPISODIO(ID_EPISODIO, NOME, FK_SERIE) values (102, 'The Cap Table', 1003);
insert into EPISODIO(ID_EPISODIO, NOME, FK_SERIE) values (103, 'Articles of Incorporation', 1003);

insert into SERIE values (1004, 2);

insert into EPISODIO(ID_EPISODIO, NOME, FK_SERIE) values (104, 'Hello, Friend', 1004);
insert into EPISODIO(ID_EPISODIO, NOME, FK_SERIE) values (105, 'Ones and Zeros', 1004);
insert into EPISODIO(ID_EPISODIO, NOME, FK_SERIE) values (106, 'D3bug', 1004);
insert into EPISODIO(ID_EPISODIO, NOME, FK_SERIE) values (107, 'Da3m0ns', 1004);

