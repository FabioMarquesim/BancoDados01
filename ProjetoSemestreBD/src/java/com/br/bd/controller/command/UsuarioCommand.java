/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.bd.controller.command;

import com.br.bd.model.dao.UsuarioinfoDAO;
import com.br.bd.model.entities.Usuarioinfo;
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
            case "carrega":                
                List<Usuarioinfo> uinfos = usuarioinfoDAO.findAll();
                                
                request.getSession().setAttribute("uinfos", uinfos);
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

}
