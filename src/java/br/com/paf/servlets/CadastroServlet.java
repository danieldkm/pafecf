/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.paf.servlets;

import br.com.paf.bean.Usuario;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.paf.dao.UsuarioDAO;
import br.com.paf.util.DAOFactory;

/**
 *
 * @author npi
 */
public class CadastroServlet extends HttpServlet {

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
        String nomeCad = request.getParameter("c_nome");
        String loginCad = request.getParameter("c_login");
        String senhaCad = request.getParameter("c_senha");
        String tipoCad = request.getParameter("c_tipo");
        Usuario user = new Usuario();
        user.setNome(nomeCad);
        user.setLogin(loginCad);
        user.setSenha(senhaCad);
        switch (tipoCad) {
            case "Homologador(tester)":
                user.setTipo(0);
                break;
            case "Tecnico Reposavel(Laudo)":
                user.setTipo(1);
                break;
        }
        user.setLaudoAtual(null);
        UsuarioDAO userDao = DAOFactory.createUsuarioDAO();
        userDao.inserir(user);
        request.setAttribute("cadastro", "Cadastro realizado com sucesso!!");
        request.getRequestDispatcher("/login").forward(request, response);

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
