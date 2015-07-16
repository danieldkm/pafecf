<%-- 
    Document   : entrevista
    Created on : 15/07/2015, 09:52:55
    Author     : npi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:useBean id="usuarioB" scope="page" class="br.com.paf.bean.Usuario" />
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="_css/styleEntrevista.css">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="coment"  method="post" action="testes">
            <div><a id="sair" href="/login">Sair</a></div>
            <!--<div><a id="avancar" href="teste">Avançar &raquo;</a></div>-->
            <input type="submit" value="avançar &raquo" name="Ava" id="avancar"  tabindex="35"/>
            <table >
                <thead>
                    <tr>
                        <th></th>
                        <th ><label>Homologação PAF-ECF - Responsável:</label><input type="text" class="caixa bradius responsavelPaf" id="centralizarTexto" name="responsavelPaf" value="<%=request.getAttribute("nomepaf")%>" /></th>
                    </tr>
                    <tr class="top">
                        <th><label>Responsável pelos testes:</label><input type="text" class="txt bradius" autofocus="" id="centralizarTexto" name="responsavel" tabindex="1"/></th>
                        <th><label>Nome da Empresa:</label><input type="text" class="txt bradius" id="centralizarTexto" name="nomeEmpresa" tabindex="2" /></th>
                        <th><label>Versão do software:</label><input type="text" class="txt bradius" id="centralizarTexto" name="versao" tabindex="3" /></th>
                    </tr>
                </thead >
            </table>

            <table class="acom" border="0" cellspacing="3">
                <thead>
                    <tr>
                        <th align="center" colspan="10">Informações Adicionais:</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>(Teste86-pag54) - Nº do Laudo:</td>
                        <td><input type="text" class="txt2 bradius" id="centralizarTexto" name="numeroLaudo" value="IFL" tabindex="4"/></td>
                        <td>Restaurante com utilização de ECF-COMUM e  SEM balança</td>
                        <td><input type="text" class="txt2 bradius" id="centralizarTexto" name="ecfComumSemBalanca" tabindex="17" /></td>
                    </tr>
                    <tr>
                        <td>DAV – sem possibilidade de impressão</td>
                        <td><input type="text" class="txt2 bradius" id="centralizarTexto" name="davSemImpressao" tabindex="5"/></td>
                        <td>Farmácia de Manipulação</td>
                        <td><input type="text" class="txt2 bradius" id="centralizarTexto" name="famarcia" tabindex="18"/></td>
                    </tr>
                    <tr>
                        <td>DAV – impresso em não fiscal</td>
                        <td><input type="text" class="txt2 bradius" id="centralizarTexto" name="davImpressoNaoFiscal" tabindex="6" /></td>
                        <td>Sitema de Retaguarda COM utilização de REQUISITOS do paf</td>
                        <td><input type="text" class="txt2 bradius" id="centralizarTexto" name="retaguardaComRequiPaf" tabindex="19" /></td>
                    </tr>
                    <tr>
                        <td>DAV – impresso em ECF</td>
                        <td><input type="text" class="txt2 bradius" id="centralizarTexto" name="davImpressoECF" tabindex="7" /></td>
                        <td>Sitema de Retaguarda SEM utilização de REQUISITOS do paf</td>
                        <td><input type="text" class="txt2 bradius" id="centralizarTexto" name="retaguardaSemRequiPaf" tabindex="20"/></td>
                    </tr>
                    <tr>
                        <td>Pré-Venda:</td>
                        <td><input type="text" class="txt2 bradius" id="centralizarTexto" name="preVenda" tabindex="8" /></td>
                        <td>Sistema SEM  Retaguarda Funcionando com o PAF</td>
                        <td><input type="text" class="txt2 bradius" id="centralizarTexto" name="semRetaguarda" tabindex="21"/></td>
                    </tr>
                    <tr>
                        <td>Na falta de energia o cupom é: </td>
                        <td><input type="text" class="txt2 bradius" id="centralizarTexto" name="faltaEnergia" tabindex="9" title="CANCELADO OU RECUPERADO"/></td>
                        <td>Transporte de Passageiros</td>
                        <td><input type="text" class="txt2 bradius" id="centralizarTexto" name="transporte" tabindex="22"/></td>
                    </tr>
                    <tr>
                        <td>Posto COM Interligação Bombas: </td>
                        <td><input type="text" class="txt2 bradius" id="centralizarTexto" name="postoComBombas" tabindex="10" /></td>
                        <td>Posto de Pedágio</td>
                        <td><input type="text" class="txt2 bradius" id="centralizarTexto" name="postoDePedagio" tabindex="23"/></td>
                    </tr>
                    <tr>
                        <td>Oficina de Conserto COM DAV-OS</td>
                        <td><input type="text" class="txt2 bradius" id="centralizarTexto" name="davOS" tabindex="11" /></td>
                        <td>Moteis e Similares (ver requisito IX item 1)</td>
                        <td><input type="text" class="txt2 bradius" id="centralizarTexto" name="moteis" tabindex="24"/></td>
                    </tr>
                    <tr>
                        <td>Oficina  de Conserto COM CONTA  CLIENTE</td>
                        <td><input type="text" class="txt2 bradius" id="centralizarTexto" name="oficinaComContaCliente" tabindex="12" /></td>
                        <td>Cinemas Espetáculos e Similares (usar conta cliente)</td>
                        <td><input type="text" class="txt2 bradius" id="centralizarTexto" name="cinemas" tabindex="25" /></td>
                    </tr>
                    <tr>
                        <td>Restaurante COM CONTA CLIENTE</td>
                        <td><input type="text" class="txt2 bradius" id="centralizarTexto" name="resComContaCliente" tabindex="13" /></td>
                        <td>solicitar a declaração de conformidade do requisito I</td>
                        <td><input type="text" class="txt2 bradius" id="centralizarTexto" name="solicitarDeclaracao" tabindex="26" /></td>
                    </tr>
                    <tr>
                        <td>Restaurante com utilização de ECF-RESTAURANTE e COM balança</td>
                        <td><input type="text" class="txt2 bradius" id="centralizarTexto" name="ecfResComBalanca" tabindex="14" /></td>
                        <td>solicitar a cópia do contrato social e última alteração</td>
                        <td><input type="text" class="txt2 bradius" id="centralizarTexto" name="solicitarCopia" tabindex="27"/></td>
                    </tr>
                    <tr>
                        <td>Restaurante COM utilização de ECF-RESTAURANTE e SEM balança </td>
                        <td><input type="text" class="txt2 bradius" id="centralizarTexto" name="ecfResSemBalanca" tabindex="15" /></td>
                        <td>Simples Nacional</td>
                        <td><input type="text" class="txt2 bradius" id="centralizarTexto" name="simplesNacional" tabindex="28" /></td>
                    </tr>
                    <tr>
                        <td>Restaurante com utilização de ECF-COMUM e  COM balança</td>
                        <td><input type="text" class="txt2 bradius" id="centralizarTexto" name="ecfComumComBalanca" tabindex="16" /></td>
                        <td>Especificação de requisitos do paf-ecf</td>
                        <td><input type="text" class="txt2 bradius" id="centralizarTexto" name="erPafEcf" tabindex="30"></td>
                    </tr>
                </tbody>
            </table>
            <hr class="separaPerfil">
            <h2 align="center"  >Perfil</h2>
            <div align="center" >
                <table border="0" cellspacing="5" >
                    <thead>
                        <tr>
                            <th>Perfil que irá atender o PAF</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr class="per">
                            <td title="AM,GO,DF,MA,PE,RJ,RR,TO">PERFIL W</td>
                            <td><input type="checkbox" class="txt2 bradius" id="centralizarTexto" name="perfilW" tabindex="31" title="AM,GO,DF,MA,PE,RJ,RR,TO"/></td>
                        </tr>
                        <tr class="per">
                            <td title="MS,SC" >PERFIL V</td>
                            <td><input type="checkbox" class="txt2 bradius" id="centralizarTexto" name="perfilV" tabindex="32" title="MS,SC" /></td>
                        </tr>
                        <tr class="per">
                            <td title="ES,PB" >PERFIL Y</td>
                            <td><input type="checkbox" class="txt2 bradius" id="centralizarTexto" name="perfilY" tabindex="33" title="ES,PB" /></td>
                        </tr>
                        <tr class="per">
                            <td title="BA" >PERFIL Z</td>
                            <td><input type="checkbox" class="txt2 bradius" id="centralizarTexto" name="perfilZ" tabindex="34" title="BA"/></td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </form>
    </body>
</html>