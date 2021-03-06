/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.bd.model.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fabio
 */
public class SingleConnection {
    
    //Parametros de conexao
    public static final String driver = "oracle.jdbc.OracleDriver";
    private static final String db = "xe";
    private static final String username = "system";
    private static final String password = "system";
    private static final String protocol = "jdbc:oracle:thin:@localhost:1521:";
    
    private static SingleConnection instance = null;
    private Connection connection;

    private SingleConnection() {
        super();
        System.out.println("Singleton da conexão criado!");

        try {
            //Estabelecer a conexao
            Class.forName(driver).newInstance();
            connection = DriverManager.getConnection(protocol+db, username, password);
            System.out.println("Conectado!!");

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(SingleConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static SingleConnection getInstance() {
        if (instance == null) {
            instance = new SingleConnection();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection(){
        try {
            this.connection.close();
        } catch (SQLException ex) {
            ex.getMessage();
            ex.getErrorCode();
        }
    }
    
}
