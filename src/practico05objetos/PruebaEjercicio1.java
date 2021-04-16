package practico05objetos;

import dominio.Funcionario;
import java.util.Scanner;

public class PruebaEjercicio1 {

    public static void main(String[] args) {
        crearDosFuncionariosEIndicarCualGanaMas();
    }

    public static Funcionario crearFuncionario() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nombre = in.nextLine();
        System.out.println("Ingrese el sueldo");
        int sueldo = in.nextInt();
        Funcionario fun1 = new Funcionario(nombre, sueldo);
        System.out.println("fun1 = " + fun1);
        return fun1;
    }

    public static void crearDosFuncionariosEIndicarCualGanaMas() {
        Funcionario fun1 = crearFuncionario();
        Funcionario fun2 = crearFuncionario();
        if (fun1.getSueldo() > fun2.getSueldo()) {
            System.out.println("El funcionario " + fun1.getNombre() + " gana mas.");
        }
        if (fun1.getSueldo() < fun2.getSueldo()) {
            System.out.println("El funcionario " + fun2.getNombre() + " gana mas.");
        }
        if (fun1.getSueldo() == fun2.getSueldo()) {
            System.out.println("Los funcionarios ganan lo mismo");
        }
    }

}
