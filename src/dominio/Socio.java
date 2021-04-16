package dominio;

public class Socio {

    private String nombre;
    private int numero;
    private static int ProximoNumero = 0;

    public Socio(String nombre) {
        this.setNombre(nombre);
        Socio.setProximoNumero(Socio.getProximoNumero()+1);
        this.setNumero(Socio.getProximoNumero());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    private void setNumero(int numero) {
        this.numero = numero;
    }

    public static int getProximoNumero() {
        return ProximoNumero;
    }

    private static void setProximoNumero(int ProximoNumero) {
        Socio.ProximoNumero = ProximoNumero;
    }

    @Override
    public String toString() {
        return "Socio{" + "nombre=" + nombre + ", numero=" + numero + '}';
    }
    
    
    
}
