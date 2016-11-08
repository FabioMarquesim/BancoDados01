package com.br.bd.model.entities;

import com.br.bd.model.entities.Atracao;
import com.br.bd.model.entities.Episodio;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-08T19:57:39")
@StaticMetamodel(Serie.class)
public class Serie_ { 

    public static volatile SingularAttribute<Serie, BigDecimal> idSerie;
    public static volatile SingularAttribute<Serie, Atracao> atracao;
    public static volatile SingularAttribute<Serie, BigInteger> numtemporadas;
    public static volatile ListAttribute<Serie, Episodio> episodioList;

}