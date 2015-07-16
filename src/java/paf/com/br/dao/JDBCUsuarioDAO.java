package paf.com.br.dao;

import br.com.paf.bean.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import paf.com.br.util.ConnectionFactory;

public class JDBCUsuarioDAO implements UsuarioDAO {

    Connection connection;

    public JDBCUsuarioDAO() {
        connection = ConnectionFactory.getConnection();
    }

    @Override
    public void inserir(Usuario usuario) {
        try {
            String SQL = "INSERT INTO usuario (nome, login, senha, tipo, laudoAtual) Values"
                    + "(?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(SQL);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getSenha());
            ps.setInt(4, usuario.getTipo());
            ps.setString(5, usuario.getLaudoAtual());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCUsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void remover(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> listar() {
        try {
            List<Usuario> usuarios = new ArrayList<>();
            String SQL = "SELECT * FROM usuario";
            PreparedStatement ps = connection.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Usuario user = new Usuario();
                user.setNome(rs.getString("nome"));
                user.setLogin(rs.getString("login"));
                user.setSenha(rs.getString("senha"));
                user.setTipo(rs.getInt("tipo"));
                usuarios.add(user);
            }
            return usuarios;
        } catch (SQLException ex) {
            Logger.getLogger(JDBCUsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Falha ao lista os Usuarios em JDBCUsuarioDAO", ex);
        }
    }

    @Override
    public Usuario buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validar(String nome, String senha) {
        try {

            String SQL = "SELECT * FROM usuario WHERE login='" + nome + "' AND senha='" + senha + "'";
            PreparedStatement ps = connection.prepareStatement(SQL);

            ResultSet rs = ps.executeQuery();
            return rs.next();

        } catch (SQLException ex) {
            Logger.getLogger(JDBCUsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Error SQLException ao tentar validar em JDBCUsuarioDAO", ex);
        }

    }

    @Override
    public int getTipo(String nome, String senha) {
        try {
            String SQL = "SELECT tipo FROM usuario WHERE login='" + nome + "' AND senha='" + senha + "'";
            PreparedStatement ps = connection.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt("tipo");
            }
        } catch (SQLException ex) {
            Logger.getLogger(JDBCUsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro SSQLException ao pegar o Tipo do usuario em JDBCUsuarioDAO", ex);
        }
        return 0;
    }

    @Override
    public String getNome(String login, String senha) {
        try {
            String SQL = "SELECT nome FROM usuario WHERE login='" + login + "' AND senha='" + senha + "'";
            PreparedStatement ps = connection.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getString("nome");
            }

        } catch (SQLException ex) {
            Logger.getLogger(JDBCUsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro SSQLException ao pegar o Tipo do usuario em JDBCUsuarioDAO", ex);
        }
        return null;
    }

}
