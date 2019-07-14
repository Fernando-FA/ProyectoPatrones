package pe.edu.unmsm.modelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import pe.edu.unmsm.conexionBD.ConexionBD;
import pe.edu.unmsm.intefaces.ICrudDao;
import pe.edu.unmsm.model.Deporte;

public class DeporteDao implements ICrudDao<Deporte> {

    //variables
    Connection cn = null;
    Statement stm = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = null;
    Deporte dep = null;
    //------------------

    @Override
    public void create(Deporte t) throws Exception {
        try {
            cn = ConexionBD.getConexion();
            sql = "insert into deporte(ideporte,nombre,descripcion,idsede) values(?,?,?,?)";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, t.getIddeporte());
            ps.setString(2, t.getNombre());
            ps.setString(3, t.getDescripcion());
            ps.setInt(4, t.getIdsede());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public void update(Deporte t) throws Exception {
        try {
            cn = ConexionBD.getConexion();
            sql = "update deporte set nombre=?,descripcion=?,idsede=? where iddeporte=?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, t.getNombre());
            ps.setString(2, t.getDescripcion());
            ps.setInt(3, t.getIdsede());
            ps.setInt(4, t.getIddeporte());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public void delete(Deporte t) throws Exception {
        try {
            cn = ConexionBD.getConexion();
            sql = "delete from deporte where iddeporte=?";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, t.getIddeporte());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public Deporte findForId(int t) throws Exception {
        dep = null;
        try {
            cn = ConexionBD.getConexion();
            ps = cn.prepareStatement("select * from deporte where iddeporte=?");
            //preparar valor del parametro
            ps.setInt(1, t);
            //ejecutar consulta
            rs = ps.executeQuery();
            if (rs.next()) {
                //crear objeto pro y asignar valores
                dep = new Deporte(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            throw e;
        }
        return dep;
    }

    @Override
    public List<Deporte> readAll() throws Exception {
        List<Deporte> lista = new ArrayList<Deporte>();
        //List<Deporte> lista = new ArrayList<>();
        try {
            cn = ConexionBD.getConexion();
            stm = cn.createStatement();
            rs = stm.executeQuery("select * from deporte order by 1");
            dep = null;
            while (rs.next()) {
                //crear objeto pro y asignar valores
                dep = new Deporte(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
                lista.add(dep);
            }
            rs.close();
            stm.close();
        } catch (SQLException e) {
            throw e;
        }
        return lista;
    }

    public List<Deporte> findForIdSede(int t) throws Exception {
        List<Deporte> lista = new LinkedList<>();
        try {
            cn = ConexionBD.getConexion();
            sql = "select * from deporte where idsede = ? order by 1";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, t);
            rs = ps.executeQuery();
            dep = null;
            while (rs.next()) {
                dep = new Deporte(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getInt(4));
                lista.add(dep);
                System.out.println(dep.getNombre());
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            throw e;
        }
        
        return lista;
    }

}
