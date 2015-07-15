<%-- 
    Document   : entrevista
    Created on : 15/07/2015, 09:52:55
    Author     : npi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <div class="main">
            <div class="top">
                <div class="ReponsavelPaf">
                    Homologação PAF-ECF - Responsável:<input type="text" name="responsavelPaf" value="${usuarioB.nome}" />
                </div>
                <div class="Empresa">
                    Pessoa responsável:<input type="text" name="responsavelEmpresa" value="" />
                    Nome da empresa:<input type="text" name="Empresa" value="" />
                    Versão:<input type="text" name="Empresa" value="" />
                </div>
            </div>
        </div>
    </body>
</html>
