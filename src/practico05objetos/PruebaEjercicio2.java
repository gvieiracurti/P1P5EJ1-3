package practico05objetos;

import dominio.Cliente;
import java.util.Scanner;

public class PruebaEjercicio2 {

    public static void main(String[] args) {
        Cliente cli1 = crearCliente();
        System.out.println("cli1 = " + cli1);
    }

    public static Cliente crearCliente() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nombre = in.nextLine();
        System.out.println("Ingrese el telefono");
        String telefono = in.nextLine();
        String mail = "";
        boolean mailOk = false;
        while (!mailOk) {
            System.out.println("Ingrese el Mail");
            mail = in.nextLine();
            mailOk = mailEsValido(mail);
            if (!mailOk) {
                System.out.println("El mail no tiene el formato correcto. Nota: debe ser de gmail o yahoo.");
            }
        }
        Cliente unCliente = new Cliente(nombre, telefono, mail);
        return unCliente;
    }

    public static boolean mailEsValido(String unMail) {
        boolean respuesta = true;
        String[] partesDelMail = unMail.split("@");
        if (partesDelMail.length != 2) {
            respuesta = false;
        } else {
            if (partesDelMail[0].contains(" ")) {
                respuesta = false;
            }
            if (!partesDelMail[1].equalsIgnoreCase("gmail.com") && !partesDelMail[1].equalsIgnoreCase("yahoo.com")) {
                respuesta = false;
            }
        }
        return respuesta;
    }

}
