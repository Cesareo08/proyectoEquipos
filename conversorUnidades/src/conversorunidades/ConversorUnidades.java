package conversorunidades;

import java.util.Scanner;

public class ConversorUnidades {
    static Scanner read=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Conversor de Unidades");
        System.out.println("Introduzca la opción que quiera utilazar: ");
        System.out.println("    1. Conversor Unidades Longitudinales");
        System.out.println("    2. Salir");
        int opcion1=1;
        do{
            opcion1=read.nextInt();
            if (opcion1<1 || opcion1>2) {
                System.out.println("La opción introducida es incorrecta. Por "
                        + "favor vuelva a introducir una opción.");
            }
        } while(opcion1<1 || opcion1>2);
        
        if (opcion1==1) {
            System.out.println("Opción 1. Conversor Unidades Longitudinales");
            for (int i = 0; i < 2; i++) {
                System.out.println("Introduzca las unidades que quiera "
                        + "utilizar: ");
                do{
                    System.out.println("    Unidades: ");
                    System.out.println("        - km (kilómetros)");
                    System.out.println("        - hm (hectómetros)");
                    System.out.println("        - dam (decámetros)");
                    System.out.println("        - m (metros)");
                    System.out.println("        - dm (decímetros)");
                    System.out.println("        - cm (centímetros)");
                    System.out.println("        - mm (dmilímetros)");
                } while(opcion2==false);
            }
            
        }
    }
    
}
