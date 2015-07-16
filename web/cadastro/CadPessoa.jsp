<%-- 
    Document   : CadPessoa
    Created on : 14/07/2015, 13:23:11
    Author     : npi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../_css/styleCadPessoa.css">
        <title>JSP Page</title>
    </head>
    <body>  
        <div class="formCadastro"> 
            <form action="cadastro" method="POST">
                Nome:  <input  type="text" name="c_nome" required="required" autofocus/>
                Login: <input  type="text" name="c_login" required="required" />
                Senha: <input   type="text" name="c_senha" required="required"/>
                Tipo:    
                <select name="c_tipo" required="required">
                    <option></option>
                    <option>Homologador(tester)</option>
                    <option>Tecnico Reposavel(Laudo)</option>
                </select>
                <input type="submit" value="Cadastrar" name="botao_cadastrar" />
            </form>
        </div>
    </body>
</html>
