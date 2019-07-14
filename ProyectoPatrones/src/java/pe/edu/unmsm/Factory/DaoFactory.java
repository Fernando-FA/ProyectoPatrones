
package pe.edu.unmsm.Factory;

import pe.edu.unmsm.intefaces.ICrudDao;
import pe.edu.unmsm.modelDAO.CentroDeportivoDao;
import pe.edu.unmsm.modelDAO.ClusterDao;
import pe.edu.unmsm.modelDAO.DeporteDao;
import pe.edu.unmsm.modelDAO.PaisDao;
import pe.edu.unmsm.modelDAO.SedeDao;
import pe.edu.unmsm.modelDAO.UsuarioDao;

public class DaoFactory {
    
    public ICrudDao getDao (String daoType){
        
        if (daoType == null) {
            return null;
        }
        if (daoType.equalsIgnoreCase("CLUSTER")) {
            return new ClusterDao();
        } else if (daoType.equalsIgnoreCase("CENTRO")) {
            return new CentroDeportivoDao();
        }else if (daoType.equalsIgnoreCase("DEPORTE")) {
            return new DeporteDao();
        }else if (daoType.equalsIgnoreCase("PAIS")) {
            return new PaisDao();
        }else if (daoType.equalsIgnoreCase("SEDE")) {
            return new SedeDao();
        }else if (daoType.equalsIgnoreCase("USUARIO")) {
            return new UsuarioDao();
        }
        return null;
    }
    
}
