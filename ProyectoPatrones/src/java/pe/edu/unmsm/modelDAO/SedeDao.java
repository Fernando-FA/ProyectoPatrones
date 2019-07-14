
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
import pe.edu.unmsm.model.Sede;

public class SedeDao implements ICrudDao<Sede>{
    
    //variables
    Connection cn = null;
    Statement stm = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = null;
    Sede sede = null;
    //------------------

    @Override
    public void create(Sede t) throws Exception {
        try {
            cn = ConexionBD.getConexion();
            sql = "insert into sede(idsede,nombre,distrito,capacidad,idcluster,idcentro) values(?,?,?,?,?,?)";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, t.getIdsede());
            ps.setString(2, t.getNombre());
            ps.setString(3, t.getDistrito());
            ps.setString(4, t.getCapacidad());
            ps.setInt(5, t.getIdcluster());
            ps.setInt(6, t.getIdcentro());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public void update(Sede t) throws Exception {
        try {
            cn = ConexionBD.getConexion();
            sql = "update sede set nombre=?,distrito=?,capacidad=?,idcluster=?,idcentro=? where idsede=?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, t.getNombre());
            ps.setString(2, t.getDistrito());
            ps.setString(3, t.getCapacidad());
            ps.setInt(4, t.getIdcluster());
            ps.setInt(5, t.getIdcentro());
            ps.setInt(6, t.getIdsede());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public void delete(Sede t) throws Exception {
        try {
            cn = ConexionBD.getConexion();
            sql = "delete from sede where idsede=?";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, t.getIdsede());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public Sede findForId(int t) throws Exception {
        sede = null;
        try {
            cn = ConexionBD.getConexion();
            ps = cn.prepareStatement("select * from sedes where idsede=?");
            //preparar valor del parametro
            ps.setInt(1, t);
            //ejecutar consulta
            rs = ps.executeQuery();
            if (rs.next()) {
                //crear objeto pro y asignar valores
                sede = new Sede(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6));
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            throw e;
        }
        return sede;
    }

    @Override
    public List<Sede> readAll() throws Exception {
        List<Sede> lista = new ArrayList<Sede>();
        try {
            cn = ConexionBD.getConexion();
            stm = cn.createStatement();
            rs = stm.executeQuery("select * from sedes order by 1");
            sede = null;
            while (rs.next()) {
                //crear objeto pro y asignar valores
                sede = new Sede(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6));
                lista.add(sede);
            }
            rs.close();
            stm.close();
        } catch (SQLException e) {
            System.out.println("Error crear la sentencia "
                    + e.getMessage());
            return null;
        }
        return lista;
    }
    
}
