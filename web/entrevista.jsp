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
                    Nome da empresa:<input type="text" name="nomeDaEmpresa" value="" />
                    Versão:<input type="text" name="versao" value="" />
                </div>
            </div>
                <div class="middle">
                    <div class="Titulo">
                        INFORMAÇÕES ADICIONAIS
                    </div>
                    <div class="Entrevista"> 
                        DAV – sem possibilidade de impressão<input type="text" name="davSemImpressao" value=""  /><br>
                        DAV – impresso em não fiscal<input type="text" name="davNaoFiscal" value="" /><br>
                        DAV – impresso em ECF<input type="text" name="davEcf" value="" /><br>
                        Pré-Venda:<input type="text" name="preVenda" value="" /><br>
                        Na falta de energia o cupom é:<input type="text" name="faltaEnergia" value="" /><br>
                        Posto COM Interligação Bombas<input type="text" name="posto" value="" /><br>
                        Oficina de Conserto COM DAV-OS<input type="text" name="davOs" value="" /><br>
                        Oficina  de Conserto COM CONTA  CLIENTE<input type="text" name="contaCliente" value="" /><br>
                        Restaurante COM CONTA CLIENTE<input type="text" name="res_ContaCliente" value="" /><br>
                        Restaurante com utilização de ECF-RESTAURANTE e COM balança<input type="text" name="res_ecfResComBalanca" value="" /><br>
                        Restaurante COM utilização de ECF-RESTAURANTE e SEM balança<input type="text" name="res_ecfResSemBalanca" value="" /><br>
                        Restaurante com utilização de ECF-COMUM e  COM balança<input type="text" name="res_ecfComumComBalanca" value="" /><br>
                        Restaurante com utilização de ECF-COMUM e  SEM balança<input type="text" name="res_ecfComumSemBalanca" value="" /><br>
                        Farmácia de Manipulação<input type="text" name="farmarcia" value="" /><br>
                        Sitema de Retaguarda COM utilização de REQUISITOS do paf<input type="text" name="retaguardaComPaf" value="" /><br>
                        Sitema de Retaguarda SEM utilização de REQUISITOS do paf<input type="text" name="retaguardaSemPaf" value="" /><br>
                        Sistema SEM  Retaguarda Funcionando com o PAF<input type="text" name="semRetaguardaComPaf" value="" /><br>
                        Transporte de Passageiros<input type="text" name="transporte" value="" /><br>
                        Posto de Pedágio<input type="text" name="pedagio" value="" /><br>
                        Moteis e Similares (ver requisito IX item 1)<input type="text" name="moteis" value="" /><br>
                        Cinemas Espetáculos e Similares (usar conta cliente)<input type="text" name="cinemas" value="" /><br>
                    </div>
                    <div class="perfils">
                        Perfil W<input type="text" name="w" value="" /><br>
                        Perfil V<input type="text" name="v" value="" /><br>
                        Perfil Y<input type="text" name="y" value="" /><br>
                        Perfil Z<input type="text" name="z" value="" />
 
                    </div>
                </div>
        </div>
    </body>
</html>