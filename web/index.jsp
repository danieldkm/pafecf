
<%-- 
    Document   : index
    Created on : 14/07/2015, 09:55:44
    Author     : npi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="_css/styleLogin.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>     
        <jsp:useBean id="userBean" scope="page" class="br.com.paf.bean.Usuario" />
        <div id="main">
            <div id="formularioLogin" class="container">
                <form action="Service" method="POST">
                    <input id="login" type="text" name="login" placeholder="Login" value="${userBean.login}" class="txt bradius" autofocus  />
                    <br/>
                    <input id="senha" type="password" name="senha" placeholder="Senha" value="${userBean.senha}" class=" txt bradius" />
                    <input type="submit" class="botao bradius" value="Entrar" />
                </form>
            </div>
                    
        </div>            
    </body>
</html>
