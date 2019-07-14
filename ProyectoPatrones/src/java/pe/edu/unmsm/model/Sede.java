
package pe.edu.unmsm.model;

public class Sede {
    
    private int idsede;
    private String nombre;
    private String distrito;
    private String capacidad;
    private int idcluster;
    private int idcentro;

    public Sede() {
    }

    public Sede(int idsede, String nombre, String distrito, String capacidad, int idcluster, int idcentro) {
        this.idsede = idsede;
        this.nombre = nombre;
        this.distrito = distrito;
        this.capacidad = capacidad;
        this.idcluster = idcluster;
        this.idcentro = idcentro;
    }

    public int getIdsede() {
        return idsede;
    }

    public void setIdsede(int idsede) {
        this.idsede = idsede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public int getIdcluster() {
        return idcluster;
    }

    public void setIdcluster(int idcluster) {
        this.idcluster = idcluster;
    }

    public int getIdcentro() {
        return idcentro;
    }

    public void setIdcentro(int idcentro) {
        this.idcentro = idcentro;
    }

    @Override
    public String toString() {
        return "Sede{" + "idsede=" + idsede + ", nombre=" + nombre + ", distrito=" + distrito + ", capacidad=" + capacidad + ", idcluster=" + idcluster + ", idcentro=" + idcentro + '}';
    }
    
    
}
