package paf.com.br.dao;

import br.com.paf.bean.Usuario;
import java.util.List;

public interface UsuarioDAO {

    public void inserir(Usuario usuario);
    public void remover(int id);
    public List<Usuario> listar();
    public Usuario buscar(int id);
    public void editar(Usuario usuario);
    public boolean validar(String nome, String senha);
    public int getTipo(String nome, String senha);
    public String getNome(String nome, String senha);
}