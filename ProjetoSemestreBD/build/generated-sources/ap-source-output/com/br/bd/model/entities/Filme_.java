package com.br.bd.model.entities;

import com.br.bd.model.entities.Atracao;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-08T19:57:39")
@StaticMetamodel(Filme.class)
public class Filme_ { 

    public static volatile SingularAttribute<Filme, BigInteger> indicacoesoscar;
    public static volatile SingularAttribute<Filme, BigDecimal> idFilme;
    public static volatile SingularAttribute<Filme, Atracao> atracao;

}