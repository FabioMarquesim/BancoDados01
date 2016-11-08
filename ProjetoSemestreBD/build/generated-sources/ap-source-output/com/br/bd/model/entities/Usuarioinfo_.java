package com.br.bd.model.entities;

import com.br.bd.model.entities.Atracao;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-08T16:04:18")
@StaticMetamodel(Usuarioinfo.class)
public class Usuarioinfo_ { 

    public static volatile SingularAttribute<Usuarioinfo, String> senha;
    public static volatile SingularAttribute<Usuarioinfo, String> telefone;
    public static volatile ListAttribute<Usuarioinfo, Atracao> atracaoList;
    public static volatile SingularAttribute<Usuarioinfo, BigDecimal> idUsuarioinfo;
    public static volatile SingularAttribute<Usuarioinfo, String> nome;
    public static volatile SingularAttribute<Usuarioinfo, String> usuario;
    public static volatile SingularAttribute<Usuarioinfo, String> email;

}