
package pe.edu.unmsm.model;

public class Pais {
    private int idpais;
    private String nombre;
    private String codigoCOI;

    public Pais() {
    }

    public Pais(int idpais, String nombre, String codigoCOI) {
        this.idpais = idpais;
        this.nombre = nombre;
        this.codigoCOI = codigoCOI;
    }

    public int getIdpais() {
        return idpais;
    }

    public void setIdpais(int idpais) {
        this.idpais = idpais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoCOI() {
        return codigoCOI;
    }

    public void setCodigoCOI(String codigoCOI) {
        this.codigoCOI = codigoCOI;
    }

    @Override
    public String toString() {
        return "Pais{" + "idpais=" + idpais + ", nombre=" + nombre + ", codigoCOI=" + codigoCOI + '}';
    }
    
    
    
}
