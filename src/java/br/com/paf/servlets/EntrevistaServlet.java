/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.paf.servlets;

import br.com.paf.bean.Entrevista;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import paf.com.br.dao.EntrevistaDAO;
import paf.com.br.util.DAOFactory;

/**
 *
 * @author npi
 */
public class EntrevistaServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        /*--PEGANDO DADOS DA PÁGINA homologar.jsp*/
        Entrevista empresa = new Entrevista();
        empresa.setNomeEmpresa(request.getParameter("nomeEmpresa").toUpperCase());
        empresa.setResponsavel(request.getParameter("responsavel").toUpperCase());
        empresa.setVersao(request.getParameter("versao"));
        Date data = new Date(System.currentTimeMillis());
        SimpleDateFormat formatarDate = new SimpleDateFormat("yyyy-MM-dd");
        empresa.setData(formatarDate.format(data));
        empresa.setLaudo(request.getParameter("numeroLaudo").toUpperCase());
        empresa.setDavSemImpressao(request.getParameter("davSemImpressao").toUpperCase());
        empresa.setDavEmNaoFiscal(request.getParameter("davImpressoNaoFiscal").toUpperCase());
        empresa.setDavImpressoEmECF(request.getParameter("davImpressoECF").toUpperCase());
        empresa.setPreVenda(request.getParameter("preVenda").toUpperCase());
        empresa.setFaltaEnergia(request.getParameter("faltaEnergia").toUpperCase());
        empresa.setPostoComBombas(request.getParameter("postoComBombas").toUpperCase());
        empresa.setDavOS(request.getParameter("davOS").toUpperCase());

        System.out.println("DAVOS-> " + request.getParameter("davOS"));//qwe

        empresa.setOficinaComContaCliente(request.getParameter("oficinaComContaCliente").toUpperCase());
        empresa.setResComContaCliente(request.getParameter("resComContaCliente").toUpperCase());
        empresa.setEcfComumComBalanca(request.getParameter("ecfResComBalanca").toUpperCase());
        empresa.setEcfResSemBalanca(request.getParameter("ecfResSemBalanca").toUpperCase());
        empresa.setEcfComumComBalanca(request.getParameter("ecfComumComBalanca").toUpperCase());
        empresa.setEcfComumSemBalanca(request.getParameter("ecfComumSemBalanca").toUpperCase());
        empresa.setFarmacia(request.getParameter("famarcia").toUpperCase());
        empresa.setRetaguardaComPaf(request.getParameter("retaguardaComRequiPaf").toUpperCase());
        empresa.setRetaguardaSemPaf(request.getParameter("retaguardaSemRequiPaf").toUpperCase());
        empresa.setSemRetaguarda(request.getParameter("semRetaguarda").toUpperCase());
        empresa.setTransporte(request.getParameter("transporte").toUpperCase());
        empresa.setPostoDePedagio(request.getParameter("postoDePedagio").toUpperCase());
        empresa.setMoteis(request.getParameter("moteis").toUpperCase());
        empresa.setCinemas(request.getParameter("cinemas").toUpperCase());
        empresa.setPerfilV(request.getParameter("perfilV"));
        empresa.setPerfilY(request.getParameter("perfilY"));
        empresa.setPerfilZ(request.getParameter("perfilZ"));
        empresa.setSimplesNacional(request.getParameter("simplesNacional").toUpperCase());
        empresa.setDeclaracaoDeConformidade(request.getParameter("solicitarDeclaracao").toUpperCase());
        empresa.setCopiaDoContrato(request.getParameter("solicitarCopia").toUpperCase());

        empresa.setErPafEcf(request.getParameter("erPafEcf").toUpperCase());
        empresa.setNomePaf(request.getParameter("responsavelPaf").toUpperCase());

        EntrevistaDAO entrevistaDao = DAOFactory.createEntrevistaDAO();
        entrevistaDao.salvar(empresa);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
