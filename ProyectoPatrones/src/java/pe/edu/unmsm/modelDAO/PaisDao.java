package pe.edu.unmsm.modelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pe.edu.unmsm.conexionBD.ConexionBD;
import pe.edu.unmsm.intefaces.ICrudDao;
import pe.edu.unmsm.model.Pais;

public class PaisDao implements ICrudDao<Pais> {

    //variables
    Connection cn = null;
    Statement stm = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = null;
    Pais pais = null;
    //------------------

    @Override
    public void create(Pais t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Pais t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Pais t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pais findForId(int t) throws Exception {
        pais = null;
        try {
            cn = ConexionBD.getConexion();
            ps = cn.prepareStatement("select * from pais where idpais=?");
            //preparar valor del parametro
            ps.setInt(1,t);
            //ejecutar consulta
            rs = ps.executeQuery();
            if (rs.next()) {
                //crear objeto pro y asignar valores
                pais = new Pais(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
        return pais;
    }

    @Override
    public List<Pais> readAll() throws Exception {
        List<Pais> lista = new ArrayList<Pais>();
        try {
            cn = ConexionBD.getConexion();
            stm = cn.createStatement();
            rs = stm.executeQuery("select * from sede order by 1");
            pais = null;
            while (rs.next()) {
                //crear objeto pro y asignar valores
                pais = new Pais(rs.getInt(1), rs.getString(2), rs.getString(3));
                lista.add(pais);
            }
            rs.close();
            stm.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
        return lista;
    }

}
