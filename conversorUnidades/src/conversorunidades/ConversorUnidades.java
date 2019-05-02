package conversorunidades;

import java.util.Scanner;

public class ConversorUnidades {
    static Scanner read=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Conversor de Unidades");
        System.out.println("Introduzca la opción que quiera utilazar: ");
        System.out.println("    1. Conversor Unidades Longitudinales");
        System.out.println("    2. Salir");
        int opcion=1;
        do{
            opcion=read.nextInt();
            if (opcion<1 || opcion>2) {
                System.out.println("La opción introducida es incorrecta. Por "
                        + "favor vuelva a introducir una opción.");
            }
        } while(opcion<1 || opcion>2);
    }
    
}
