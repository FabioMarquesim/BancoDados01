package com.br.bd.model.entities;

import com.br.bd.model.entities.Serie;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-08T16:04:18")
@StaticMetamodel(Episodio.class)
public class Episodio_ { 

    public static volatile SingularAttribute<Episodio, BigDecimal> idEpisodio;
    public static volatile SingularAttribute<Episodio, Serie> fkSerie;
    public static volatile SingularAttribute<Episodio, String> nome;

}