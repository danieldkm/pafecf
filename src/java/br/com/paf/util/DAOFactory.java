package br.com.paf.util;

import br.com.paf.dao.EntrevistaDAO;
import br.com.paf.dao.JDBCEntrevistaDAO;
import br.com.paf.dao.JDBCUsuarioDAO;
import br.com.paf.dao.UsuarioDAO;

public class DAOFactory {

    public static UsuarioDAO createUsuarioDAO() {
        return new JDBCUsuarioDAO();
    }
    public static EntrevistaDAO createEntrevistaDAO() {
        return new JDBCEntrevistaDAO();
    }
}
