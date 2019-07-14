
package pe.edu.unmsm.model;

public class Deporte {
    
    private int iddeporte;
    private String nombre;
    private String descripcion;
    private int idsede;

    public Deporte() {
    }

    public Deporte(int iddeporte, String nombre, String descripcion, int idsede) {
        this.iddeporte = iddeporte;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idsede = idsede;
    }

    public int getIddeporte() {
        return iddeporte;
    }


    public void setIddeporte(int iddeporte) {
        this.iddeporte = iddeporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdsede() {
        return idsede;
    }

    public void setIdsede(int idsede) {
        this.idsede = idsede;
    }

    @Override
    public String toString() {
        return "Deporte{" + "iddeporte=" + iddeporte + ", nombre=" + nombre + ", descripcion=" + descripcion + ", idsede=" + idsede + '}';
    }
    
    
}
