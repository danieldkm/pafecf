package br.com.paf.dao;

import br.com.paf.bean.Entrevista;
import java.util.List;

public interface EntrevistaDAO {
    
    public void remover(String laudo);
    public List<Entrevista> listar();
    public Entrevista buscarEmpresa(String empresa);
    public Entrevista buscarLaudo(String laudo);
    public void editar(Entrevista empresa);
    public void salvar(Entrevista empresa);

}
