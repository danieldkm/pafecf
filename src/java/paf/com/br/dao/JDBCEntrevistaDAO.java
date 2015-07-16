package paf.com.br.dao;

import br.com.paf.bean.Entrevista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import paf.com.br.util.ConnectionFactory;

public class JDBCEntrevistaDAO implements EntrevistaDAO {

    Connection connection;

    public JDBCEntrevistaDAO() {
        connection = ConnectionFactory.getConnection();
    }

    @Override
    public void remover(String laudo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Entrevista> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Entrevista buscarEmpresa(String empresa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Entrevista buscarLaudo(String laudo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Entrevista entrevista) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void salvar(Entrevista empresa) {
        try {

            String SQL = "INSERT INTO entrevista (nomeEmpresa, responsavel, versao, laudo, davSemImpressao, davEmNaoFiscal,davImpressoEmECF,preVenda,faltaEnergia,postoComBombas,davOS,OficinaComContaCliente,resComContaCliente,ecfResComBalanca,ecfResSemBalanca,ecfComumComBalanca,ecfComumSemBalanca,farmacia,retaguardaComPaf,retaguardaSemPaf,semRetaguarda,transporte,postoDePedagio,moteis,cinemas,perfilW,perfilV,perfilY,PerfilZ,SimplesNacional,DeclaracaoDeConformidade,copiaDoContrato) Values"
                    + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(SQL);
            ps.setString(1, empresa.getNomeEmpresa());
            ps.setString(2, empresa.getResponsavel());
            ps.setString(3, empresa.getVersao());
            ps.setString(4, empresa.getLaudo());
            ps.setString(5, empresa.getDavSemImpressao());
            ps.setString(6, empresa.getDavEmNaoFiscal());
            ps.setString(7, empresa.getDavImpressoEmECF());
            ps.setString(8, empresa.getPreVenda());
            ps.setString(9, empresa.getFaltaEnergia());
            ps.setString(10, empresa.getPostoComBombas());
            ps.setString(11, empresa.getDavOS());
            ps.setString(12, empresa.getOficinaComContaCliente());
            ps.setString(13, empresa.getResComContaCliente());
            ps.setString(14, empresa.getEcfResComBalanca());
            ps.setString(15, empresa.getEcfResSemBalanca());
            ps.setString(16, empresa.getEcfComumComBalanca());
            ps.setString(17, empresa.getEcfComumSemBalanca());
            ps.setString(18, empresa.getFarmacia());
            ps.setString(19, empresa.getRetaguardaComPaf());
            ps.setString(20, empresa.getRetaguardaSemPaf());
            ps.setString(21, empresa.getSemRetaguarda());
            ps.setString(22, empresa.getTransporte());
            ps.setString(23, empresa.getPostoDePedagio());
            ps.setString(24, empresa.getMoteis());
            ps.setString(25, empresa.getCinemas());
            ps.setString(26, empresa.getPerfilW());
            ps.setString(27, empresa.getPerfilV());
            ps.setString(28, empresa.getPerfilY());
            ps.setString(29, empresa.getPerfilZ());
            ps.setString(30, empresa.getSimplesNacional());
            ps.setString(31, empresa.getDeclaracaoDeConformidade());
            ps.setString(32, empresa.getCopiaDoContrato());
            ps.setString(33,empresa.getNomePaf());
            ps.executeUpdate();

            ps.close();

            //connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCUsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("ERRO SQLException ao salvar uma entrevista no banco de dados em JDBCEmpresaDAO", ex);
        }

    }

}
