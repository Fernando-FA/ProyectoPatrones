
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
import pe.edu.unmsm.model.Cluster;

public class ClusterDao implements ICrudDao<Cluster> {
    
    //variables
    Connection cn = null;
    Statement stm = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = null;
    Cluster clus = null;
    //------------------

    @Override
    public void create(Cluster t) throws Exception {
        try {
            cn = ConexionBD.getConexion();
            sql = "insert into cluster(idcluster,nombre,zona) values(?,?,?)";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, t.getIdcluster());
            ps.setString(2, t.getNombre());
            ps.setString(3, t.getZona());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
    }

    @Override
    public void update(Cluster t) throws Exception {
        try {
            cn = ConexionBD.getConexion();
            sql = "update cluster set nombre=?,zona=? where idcluster=?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, t.getNombre());
            ps.setString(2, t.getZona());
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
    public void delete(Cluster t) throws Exception {
        try {
            cn = ConexionBD.getConexion();
            sql = "delete from cluster where idcluster=?";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, t.getIdcluster());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
    }

    @Override
    public Cluster findForId(int t) throws Exception {
        clus = null;
        try {
            cn = ConexionBD.getConexion();
            ps = cn.prepareStatement("select * from cluster where idcluster=?");
            //preparar valor del parametro
            ps.setInt(1, t);
            //ejecutar consulta
            rs = ps.executeQuery();
            if (rs.next()) {
                //crear objeto pro y asignar valores
                clus = new Cluster(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
        return clus;
    }

    @Override
    public List<Cluster> readAll() throws Exception {
        List<Cluster> lista = new ArrayList<Cluster>();
        try {
            cn = ConexionBD.getConexion();
            stm = cn.createStatement();
            rs = stm.executeQuery("select * from cluster order by 1");
            clus = null;
            while (rs.next()) {
                //crear objeto pro y asignar valores
                clus = new Cluster(rs.getInt(1), rs.getString(2), rs.getString(3));
                lista.add(clus);
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
