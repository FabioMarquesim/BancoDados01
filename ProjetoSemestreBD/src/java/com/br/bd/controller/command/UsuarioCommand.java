/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.bd.controller.command;

import com.br.bd.model.dao.AtracaoDAO;
import com.br.bd.model.dao.EpisodioDAO;
import com.br.bd.model.dao.FilmeDAO;
import com.br.bd.model.dao.SerieDAO;
import com.br.bd.model.dao.UsuarioinfoDAO;
import com.br.bd.model.entities.Atracao;
import com.br.bd.model.entities.Episodio;
import com.br.bd.model.entities.Filme;
import com.br.bd.model.entities.Serie;
import com.br.bd.model.entities.Usuarioinfo;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fabio
 */
public class UsuarioCommand implements Command {

    SerieDAO serieDAO = lookupSerieDAOBean();

    FilmeDAO filmeDAO = lookupFilmeDAOBean();

    EpisodioDAO episodioDAO = lookupEpisodioDAOBean();

    AtracaoDAO atracaoDAO = lookupAtracaoDAOBean();

    UsuarioinfoDAO usuarioinfoDAO = lookupUsuarioinfoDAOBean();

    private HttpServletRequest request;
    private HttpServletResponse response;
    private String responsePage;

    @Override
    public void init(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }

    @Override
    public void execute() {
        String action = request.getParameter("command").split("\\.")[1];

        switch (action) {
            case "login":

                String username = request.getParameter("username");
                String password = request.getParameter("password");
                Usuarioinfo user = usuarioinfoDAO.findByUser(username);

                if (user.getSenha().equals(password)) {
                    request.getSession().setAttribute("user", user);

                    List<Atracao> atracoes = atracaoDAO.findAll();
                    List<Atracao> atracoes2 = new ArrayList<>();
                    
                    for(Atracao a : atracoes){
                        if(a.getIdUsuario().getIdUsuarioinfo().equals(user.getIdUsuarioinfo())){
                            atracoes2.add(a);
                        }
                    }
                    
                    List<Episodio> episodios = episodioDAO.findAll();
                    
                    request.getSession().setAttribute("atracoes", atracoes2);
                    request.getSession().setAttribute("episodios", episodios);
                    

                    responsePage = "index.jsp";
                } else {
                    responsePage = "login.jsp";
                }

                break;
            case "logout":
                request.getSession().setAttribute("user", null);
                responsePage = "index.jsp";
                break;
        }
    }

    @Override
    public String getResponsePage() {
        return this.responsePage;
    }

    private UsuarioinfoDAO lookupUsuarioinfoDAOBean() {
        try {
            Context c = new InitialContext();
            return (UsuarioinfoDAO) c.lookup("java:global/ProjetoSemestreBD/UsuarioinfoDAO!com.br.bd.model.dao.UsuarioinfoDAO");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

    private AtracaoDAO lookupAtracaoDAOBean() {
        try {
            Context c = new InitialContext();
            return (AtracaoDAO) c.lookup("java:global/ProjetoSemestreBD/AtracaoDAO!com.br.bd.model.dao.AtracaoDAO");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

    private EpisodioDAO lookupEpisodioDAOBean() {
        try {
            Context c = new InitialContext();
            return (EpisodioDAO) c.lookup("java:global/ProjetoSemestreBD/EpisodioDAO!com.br.bd.model.dao.EpisodioDAO");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

    private FilmeDAO lookupFilmeDAOBean() {
        try {
            Context c = new InitialContext();
            return (FilmeDAO) c.lookup("java:global/ProjetoSemestreBD/FilmeDAO!com.br.bd.model.dao.FilmeDAO");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

    private SerieDAO lookupSerieDAOBean() {
        try {
            Context c = new InitialContext();
            return (SerieDAO) c.lookup("java:global/ProjetoSemestreBD/SerieDAO!com.br.bd.model.dao.SerieDAO");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

}
