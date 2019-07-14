
package pe.edu.unmsm.model;

public class Cluster {
    private int idcluster;
    private String nombre;
    private String zona;

    public Cluster() {
    }

    public Cluster(int idcluster, String nombre, String zona) {
        this.idcluster = idcluster;
        this.nombre = nombre;
        this.zona = zona;
    }

    public int getIdcluster() {
        return idcluster;
    }

    public void setIdcluster(int idcluster) {
        this.idcluster = idcluster;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Cluster{" + "idcluster=" + idcluster + ", nombre=" + nombre + ", zona=" + zona + '}';
    }
    
    
    
}
