
package pe.edu.unmsm.model;

public class CentroDeportivo {
    
    private int idcentro;
    private String nombre;
    private int idcluster;

    public CentroDeportivo() {
    }

    public CentroDeportivo(int idcentro, String nombre, int idcluster) {
        this.idcentro = idcentro;
        this.nombre = nombre;
        this.idcluster = idcluster;
    }

    public int getIdcentro() {
        return idcentro;
    }

    public void setIdcentro(int idcentro) {
        this.idcentro = idcentro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdcluster() {
        return idcluster;
    }

    public void setIdcluster(int idcluster) {
        this.idcluster = idcluster;
    }

    @Override
    public String toString() {
        return "CentroDeportivo{" + "idcentro=" + idcentro + ", nombre=" + nombre + ", idcluster=" + idcluster + '}';
    }
    
    
    
}
