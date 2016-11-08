<%-- 
    Document   : login
    Created on : 08/11/2016, 18:37:02
    Author     : fabio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
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
        <nav></nav>
        <div class="container row">
            <div class="col s4"></div>
            <div class="col s4">
                <form action="Controller" method="Post">
                    <input type="hidden" name="command" value="Usuario.login"/>
                    <label for="user">Usuário:</label>
                    <input type="text" id="user" name="username" required="required"/>
                    <label for="pass">Senha:</label>
                    <input type="password" id="pass" name="password" required="required"/>
                    <input type="submit" class="btn-large waves-effect" name="Entrar" value="Entrar"/>                
                </form>  
            </div>
            <div class="col s4"></div>
        </div>

        <!--Import jQuery before materialize.js-->
        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script type="text/javascript" src="materialize/js/materialize.min.js"></script>
    </body>
</html>
