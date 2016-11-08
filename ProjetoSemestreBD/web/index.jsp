<%-- 
    Document   : index
    Created on : 07/11/2016, 16:08:16
    Author     : fabio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <title>Projeto Semestre BD1</title>
        <meta charset="UTF-8">

        <!--Import Google Icon Font-->
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="materialize/css/materialize.min.css"  media="screen,projection"/>
        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

        <!-- Css do Projeto -->
        <link href="css/style.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>

        <c:if test="${uinfos == null}">
            <form action="Controller" method="Post">
                <input type="hidden" name="command" value="Usuario.carrega"/>
                <input type="submit" name="Entrar" value="Entrar"/>                
            </form>
        </c:if>       
        <div class="container">
            <nav class="valign-wrapper">
                <h1 class="valign center-align">Projeto do Semestre Banco de Dados 1</h1>
            </nav>
            <div class="row">
                <div class="col s3">
                    <div class="row">                        
                        <div class="col s12 box-integrante">
                            <h2 class="center-align">Integrantes</h2>
                            <p class="center-align">Fábio Marquesim - 31595006</p>
                            <p class="center-align">Lucas Portella - 31532632</p>
                            <p class="center-align">Pedro Manha - 31561942</p>
                            <p class="center-align">4G12</p>
                        </div>
                    </div>
                </div>
                <div class="col s9">
                    <div class="row">
                        <div class="col s12">
                            <table>
                                <thead>
                                    <tr>
                                        <th data-field="id">Nome</th>
                                        <th>Usuario</th>
                                        <th>Senha</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="u" items="${uinfos}">
                                        <tr>
                                            <td>${u.nome}</td>
                                            <td>${u.usuario}</td>
                                            <td>${u.senha}</td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!--Import jQuery before materialize.js-->
        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script type="text/javascript" src="materialize/js/materialize.min.js"></script>        
    </body>
</html>
