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
public class LoginServlet extends HttpServlet {

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
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        UsuarioDAO banco = DAOFactory.createUsuarioDAO();
        /*Autenticamos o login e a senha recebido com a do banco*/
        if (banco.validar(login, senha)) {
            /*depois de verificarmos o login, vamos agora verificar o nivel do caboloco*/
            if (banco.getTipo(login, senha) == 0)/*Se o tipo/nivel for zero entao Eh homologador*/ {
                //Entao verificamos se ele ja tem homologacao para terminar
                // Se o ele n tiver laudo pendente entao 'cria-se uma nova entrevista' redirecionando-o.
                if (banco.getLaudo(login, senha) == null) {
                    Usuario user = new Usuario(); //instancia um usuario
                    //pega o nome do usuário no banco de dados e joga na bean Usuario.java  
                    user.setNome(banco.getNome(login, senha));
                    request.setAttribute("nomepaf", user.getNome());
                    request.getRequestDispatcher("entrevista.jsp").forward(request, response);

                } else/*Caso tenha algum laudo em ocorrencia*/ {
                    // Entao primeiramente temos que preencher o bean de teste e depois chama-la.
                    request.getRequestDispatcher("teste.jsp").forward(request, response);
                }
            } else /*Se o nivel for zero entao Eh manda para pagina de laudos e relatorios*/ {
                request.getRequestDispatcher("tecnicoResponsavel.jsp").forward(request, response);
            }
        }
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
