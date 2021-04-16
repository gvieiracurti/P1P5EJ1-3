package dominio;

public class Funcionario {

    private String nombre;
    private int numero;
    private int sueldo;
    private static int ProximoNumero = 0;

//    public Funcionario() {
//        this.nombre = "";
//        Funcionario.setProximoNumero(Funcionario.getProximoNumero()+1);
//        this.numero = Funcionario.getProximoNumero();
//        this.sueldo = 0;
//    }

    public Funcionario(String nombre, int sueldo) {
        this.setNombre(nombre);
        Funcionario.setProximoNumero(Funcionario.getProximoNumero()+1);
        this.setNumero(Funcionario.getProximoNumero());
        this.setSueldo(sueldo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public static int getProximoNumero() {
        return ProximoNumero;
    }

    public static void setProximoNumero(int ProximoNumero) {
        Funcionario.ProximoNumero = ProximoNumero;
    }

    public int getNumero() {
        return numero;
    }

    private void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nombre=" + nombre + ", numero=" + numero + ", sueldo=" + sueldo + '}';
    }

 

}
