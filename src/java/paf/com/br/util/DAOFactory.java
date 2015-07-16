package paf.com.br.util;

import paf.com.br.dao.EntrevistaDAO;
import paf.com.br.dao.JDBCEntrevistaDAO;
import paf.com.br.dao.JDBCUsuarioDAO;
import paf.com.br.dao.UsuarioDAO;

public class DAOFactory {

    public static UsuarioDAO createUsuarioDAO() {
        return new JDBCUsuarioDAO();
    }
    public static EntrevistaDAO createEmpresaDAO() {
        return new JDBCEntrevistaDAO();
    }
}
