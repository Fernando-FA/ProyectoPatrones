
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
import pe.edu.unmsm.model.CentroDeportivo;
import pe.edu.unmsm.model.Cluster;

public class CentroDeportivoDao implements ICrudDao<CentroDeportivo>{
    
    //variables
    Connection cn = null;
    Statement stm = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = null;
    CentroDeportivo cdep = null;
    //------------------

    @Override
    public void create(CentroDeportivo t) throws Exception {
        try {
            cn = ConexionBD.getConexion();
            sql = "insert into centrodeportivo(idcentro,nombre,idcluster) values(?,?,?)";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, t.getIdcentro());
            ps.setString(2, t.getNombre());
            ps.setInt(3, t.getIdcluster());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
    }

    @Override
    public void update(CentroDeportivo t) throws Exception {
        try {
            cn = ConexionBD.getConexion();
            sql = "update centrodeportivo set nombre=?,idcluster=? where idcentro=?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, t.getNombre());
            ps.setInt(2, t.getIdcluster());
            ps.setInt(3, t.getIdcentro());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
            ConexionBD.disconnect();
        }
    }

    @Override
    public void delete(CentroDeportivo t) throws Exception {
        try {
            cn = ConexionBD.getConexion();
            sql = "delete from centrodeportivo where idcentro=?";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, t.getIdcentro());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
            ConexionBD.disconnect();
        }
    }

    @Override
    public CentroDeportivo findForId(int t) throws Exception {
        cdep = null;
        try {
            cn = ConexionBD.getConexion();
            ps = cn.prepareStatement("select * from centrodeportivo where idcentro=?");
            //preparar valor del parametro
            ps.setInt(1,t);
            //ejecutar consulta
            rs = ps.executeQuery();
            if (rs.next()) {
                //crear objeto pro y asignar valores
                cdep = new CentroDeportivo(rs.getInt(1), rs.getString(2), rs.getInt(3));
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
            ConexionBD.disconnect();
        }
        return cdep;
    }

    @Override
    public List<CentroDeportivo> readAll() throws Exception {
        List<CentroDeportivo> lista = new ArrayList<CentroDeportivo>();
        try {
            cn = ConexionBD.getConexion();
            stm = cn.createStatement();
            rs = stm.executeQuery("select * from cluster order by 1");
            cdep = null;
            while (rs.next()) {
                //crear objeto pro y asignar valores
                cdep = new CentroDeportivo(rs.getInt(1), rs.getString(2), rs.getInt(3));
                lista.add(cdep);
            }
            rs.close();
            stm.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
            ConexionBD.disconnect();
        }
        return lista;
    }
    
}
