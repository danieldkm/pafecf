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
        <link rel="stylesheet" href="_css/styleEntrevista.css">
        <title>JSP Page</title>
    </head>
    <body>

        <div class="main">
            <div class="top">
                <div class="reponsavelPaf">
                    <label class="labelsReponsavel">Homologação PAF-ECF - Responsável:</label><input type="text" name="responsavelPaf" value="${usuarioB.nome}" class="txtTop bradiusColor" />
                </div>
                <div class="empresa">
                    <label class="labelsEmpresa">Pessoa responsável:</label><input type="text" name="responsavelEmpresa" value="" class="txtTop bradiusColor" />
                    <label class="labelsEmpresa">Nome da empresa:</label><input type="text" name="nomeDaEmpresa" value="" class="txtTop bradiusColor" />
                    <label class="labelsEmpresa"> Versão:</label><input type="text" name="versao" value="" class="txtTop bradiusColor "/>
                </div>
            </div>
            <div class="middle">
                <div class="titulo">
                    <h4>INFORMAÇÕES ADICIONAIS</h4>
                </div>
                <div class="esquerda"> 
                    <label class="labelsE">DAV – sem possibilidade de impressão</label><input type="text" name="davSemImpressao" value="" class="txt entr_Esquerda bradiusColor" /><br>
                    <label class="labelsE">DAV – impresso em não fiscal</label><input type="text" name="davNaoFiscal" value="" class="txt entr_Esquerda bradiusColor" /><br>
                    <label class="labelsE">DAV – impresso em ECF</label><input type="text" name="davEcf" value="" class="txt entr_Esquerda bradiusColor"/><br>
                    <label class="labelsE">Pré-Venda:</label><input type="text" name="preVenda" value="" class="txt entr_Esquerda bradiusColor"/><br>
                    <label class="labelsE">Na falta de energia o cupom é:</label><input type="text" name="faltaEnergia" value="" class="txt entr_Esquerda bradiusColor"/><br>
                    <label class="labelsE">Posto COM Interligação Bombas</label><input type="text" name="posto" value="" class="txt entr_Esquerda bradiusColor"/><br>
                    <label class="labelsE">Oficina de Conserto COM DAV-OS</label><input type="text" name="davOs" value="" class="txt entr_Esquerda bradiusColor"/><br>
                    <label class="labelsE">Oficina  de Conserto COM CONTA  CLIENTE</label><input type="text" name="contaCliente" value="" class="txt entr_Esquerda bradiusColor"/><br>
                    <label class="labelsE">Restaurante COM CONTA CLIENTE</label><input type="text" name="res_ContaCliente" value="" class="txt entr_Esquerda bradiusColor"/><br>
                    <label class="labelsE">Restaurante com utilização de ECF-RESTAURANTE e COM balança</label><input type="text" name="res_ecfResComBalanca" value="" class="txt entr_Esquerda bradiusColor"/><br>
                    <label class="labelsE">Restaurante COM utilização de ECF-RESTAURANTE e SEM balança</label><input type="text" name="res_ecfResSemBalanca" value="" class="txt entr_Esquerda bradiusColor" /><br>
                    <label class="labelsE">Restaurante com utilização de ECF-COMUM e  COM balança</label><input type="text" name="res_ecfComumComBalanca" value="" class="txt entr_Esquerda bradiusColor"/><br>
                    <label class="labelsE">Restaurante com utilização de ECF-COMUM e  SEM balança</label><input type="text" name="res_ecfComumSemBalanca" value="" class="txt entr_Esquerda bradiusColor"/><br>
                </div>
                <div class="direita">
                    <label class="labelsD">Farmácia de Manipulação</label><input type="text" name="farmarcia" value="" class="txt entr_Direita bradiusColor"/><br>
                    <label class="labelsD">Sitema de Retaguarda COM utilização de REQUISITOS do paf</label><input type="text" name="retaguardaComPaf" value="" class="txt entr_Direita bradiusColor"/><br>
                    <label class="labelsD">Sitema de Retaguarda SEM utilização de REQUISITOS do paf</label><input type="text" name="retaguardaSemPaf" value="" class="txt entr_Direita bradiusColor"/><br>
                    <label class="labelsD">Sistema SEM  Retaguarda Funcionando com o PAF</label><input type="text" name="semRetaguardaComPaf" value="" class="txt entr_Direita bradiusColor" /><br>
                    <label class="labelsd">Transporte de Passageiros</label><input type="text" name="transporte" value="" class="txt entr_Direita bradiusColor" /><br>
                    <label class="labelsD">Posto de Pedágio</label><input type="text" name="pedagio" value="" class="txt entr_Direita bradiusColor" /><br>
                    <label class="labelsD">Moteis e Similares (ver requisito IX item 1)</label><input type="text" name="moteis" value=""  class="txt entr_Direita bradiusColor"/><br>
                    <label class="labelsD">Cinemas Espetáculos e Similares (usar conta cliente)</label><input type="text" name="cinema" value="" class="txt entr_Direita bradiusColor"/><br>
                </div>
            </div>
            <div class="bottom">
                <label class="labelPW">Perfil W  </label><input type="checkbox" name="w" value="" class="boxPerfilw" /><br>
                <label class="labelP">Perfil V</label><input type="checkbox" name="v" value="" class="boxPerfil" /><br>
                <label class="labelP">Perfil Y</label><input type="checkbox" name="y" value="" class="boxPerfil" /><br>
                <label class="labelP">Perfil Z</label><input type="checkbox" name="z" value="" class="boxPerfil" />
            </div>
        </div>
    </body>
</html>