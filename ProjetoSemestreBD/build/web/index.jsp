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
        <c:if test="${user == null}">
            <c:redirect url="login.jsp"></c:redirect>
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
                            <p class="center-align"><a class="btn btn-large waves-effect" href="Controller?command=Usuario.logout">LOGOUT</a></p>
                        </div>
                    </div>
                </div>
                <div class="col s9">
                    <div class="row">

                        <!-- Usuario -->
                        <div class="col s12">
                            <h2 class="center-align" style="color: green;">Usuário: ${user.nome}</h2>
                            <hr>                            
                        </div>

                        <!-- Filmes -->
                        <div class="col s12">
                            <h2 class="center-align">Filmes</h2>
                            <table>
                                <thead>
                                    <tr>
                                        <th data-field="id">Nome</th>
                                        <th>Indicações</th>
                                        <th>Sinopse</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="atracao" items="${atracoes}">
                                        <c:if test="${atracao.idAtracao == atracao.filme.idFilme}">
                                            <tr>
                                                <td>${atracao.nome}</td>
                                                <td>${atracao.filme.indicacoesoscar}</td>
                                                <td>${atracao.sinopse}</td>
                                            </tr>
                                        </c:if>
                                    </c:forEach>
                                </tbody>
                            </table>
                            <hr>
                        </div>

                        <!-- Series -->
                        <div class="col s12">
                            <h2 class="center-align">Séries</h2>
                            <table>
                                <thead>
                                    <tr>
                                        <th data-field="id">Nome</th>
                                        <th>Temporadas</th>
                                        <th>Sinopse</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="atracao" items="${atracoes}">
                                        <c:if test="${atracao.idAtracao == atracao.serie.idSerie}">
                                            <tr>
                                                <td>${atracao.nome}</td>
                                                <td>${atracao.serie.numtemporadas}</td>
                                                <td>${atracao.sinopse}</td>
                                            </tr>
                                        </c:if>
                                    </c:forEach>
                                </tbody>
                            </table>
                            <hr>
                        </div>

                        <!-- Episodios -->
                        <div class="col s12">
                            <h2 class="center-align">Episódios</h2>
                            <table>
                                <thead>
                                    <tr>
                                        <th data-field="id">Nome</th>
                                        <th>Número</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="episodio" items="${episodios}">
                                        <tr>
                                            <td>${episodio.nome}</td>
                                            <td>${episodio.idEpisodio}</td>
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
