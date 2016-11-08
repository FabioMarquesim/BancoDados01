package com.br.bd.model.entities;

import com.br.bd.model.entities.Filme;
import com.br.bd.model.entities.Serie;
import com.br.bd.model.entities.Usuarioinfo;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-08T19:57:39")
@StaticMetamodel(Atracao.class)
public class Atracao_ { 

    public static volatile SingularAttribute<Atracao, String> sinopse;
    public static volatile SingularAttribute<Atracao, BigDecimal> idAtracao;
    public static volatile SingularAttribute<Atracao, Usuarioinfo> idUsuario;
    public static volatile SingularAttribute<Atracao, Serie> serie;
    public static volatile SingularAttribute<Atracao, String> nome;
    public static volatile SingularAttribute<Atracao, Filme> filme;

}