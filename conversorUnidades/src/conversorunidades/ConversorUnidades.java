package conversorunidades;

import java.util.Scanner;

public class ConversorUnidades {
    static Scanner read=new Scanner(System.in);

    public static void main(String[] args) {
        
        
        /*Interfaz Principal*/
        
        
        System.out.println("Conversor de Unidades");
        System.out.println("Introduzca la opción que quiera utilazar: ");
        System.out.println("    1. Conversor Unidades Longitudinales");
        System.out.println("    2. Salir");
        int opcion1=1;
        do{
            opcion1=read.nextInt();
            if (opcion1<1 || opcion1>2) {
                System.out.println("La opción introducida es incorrecta. Por "
                        + "favor, vuelva a introducir una opción.");
            }
        } while(opcion1<1 || opcion1>2);
        
        
        /*Interfaz Lonxitude*/
        
        
        if (opcion1==1) {
            System.out.println("Opción 1. Conversor Unidades Longitudinales");
            
            /*Recorremos el bucle 2 veces para obtener la unidad que tenemos, 
            a la unidad que queremos*/
            for (int i = 0; i < 2; i++) {
                System.out.println("Introduzca las unidades que quiera "
                        + "utilizar: ");
                if (i==1) {
                    System.out.println("Unidad 1:");
                }
                if (i==2) {
                    System.out.println("Unidad 2:");
                }
                /*Declarar variables*/
                String opcionString;
                String unidad1="m";
                String unidad2="m";
                
                /*Mostrar primeras opciones*/
                System.out.println("    Unidades: ");
                System.out.println("        - 1 Kilómetros a Millas");
                System.out.println("        - 2 Millas a Kilómetros");
                System.out.println("        - 3 Millas a Pulgadas");
                System.out.println("        - 4 Pulgadas a Millas");
                System.out.println("        - 5 Otros");
                System.out.println("        - 6 Salir");
                
                /*Leer primeras opciones*/
                int opcion2=read.nextInt();
                while(opcion2<1 || opcion2>6) {
                    System.out.println("La opción introducida es "
                            + "incorrecta. Por favor, vuelva a introducir "
                            + "una opción.");
                }
                Longitudes longitud=new Longitudes(cantidad1);
                
                /*Ejecutar primeras opciones*/
                switch (unidad1) {
                case "1":
                    unidad1="km";
                    unidad2="M";
                    longitud.kmaMillas();
                    break;
                case "2":
                    unidad1="M";
                    unidad2="km";
                    longitud.millasaKm();
                    break;
                case "3":
                    unidad1="M";
                    unidad2="P";
                    longitud.millasaPulgadas();
                    break;
                case "4":
                    unidad1="P";
                    unidad2="M";
                    longitud.pulgadasaMillas();
                    break;
                case "5":
                    otrosLongitudes();
                case "6":
                    break;
                
                /*Mostrar la solución*/
                System.out.println("El cambio de la unidad 1, "+unidad1+", a "
                        + "la unidad2, "+unidad2+", de "+cantidad1+" es de "
                        +longitud.getCantidad2());
                System.out.println(cantidad1+" "+unidad1+" es igual a "
                        +longitud.getCantidad2()+" "+unidad2);
            }
            
            
        }
    }
    
}
    
    public void otrosLongitudes() {
        String opcionString;
        String unidad1;
        String unidad2;
        boolean opcion;
        /*Repetimos el prceso de escoger la unidad 2 veces puesto que tenemos 
        2 unidades que escoger*/
        for (int i = 0; i < 2; i++) {
            /*Taxto inicial*/
            System.out.println("Introduzca las unidades que quiera "
                        + "utilizar: ");
            if (i==1) {
                System.out.println("Unidad 1:");
            }
            if (i==2) {
                System.out.println("Unidad 2:");
            }
            
            /*Escogemos las unidades*/
            do{
                System.out.println("    Unidades: ");
                System.out.println("        - km (kilómetros)");
                System.out.println("        - hm (hectómetros)");
                System.out.println("        - dam (decámetros)");
                System.out.println("        - m (metros)");
                System.out.println("        - dm (decímetros)");
                System.out.println("        - cm (centímetros)");
                System.out.println("        - mm (dmilímetros)");

                /*Leemos la unidad 1*/
                opcionString=read.nextLine();
                /*Pasamos la opcion a minúsculas*/
                opcionString=opcionString.toLowerCase();
                /*Eliminamos los espacios en blanco de la opción*/
                opcionString=opcionString.replace(" ","");

                /*Si la opcion no es correcta repetimos*/
                if (!opcionString.equals("km") || 
                        opcionString.equals("hm") || 
                        opcionString.equals("dam") || 
                        opcionString.equals("m") || 
                        opcionString.equals("dm") || 
                        opcionString.equals("cm") || 
                        opcionString.equals("mm")) {
                    opcion=false;
                    System.out.println("La opción introducida es "
                            + "incorrecta. Por favor, vuelva a introducir "
                            + "una opción.");
                } else{
                    opcion=true;
                }

                /*En la primera vuelta del bucle obtenemos la unidad 1*/
                if (i==1) {
                    unidad1=opcionString;
                }
                /*En la segunda vuelta del bucle obtenemos la unidad 2*/
                if (i==2) {
                    unidad2=opcionString;
                }
            } while(opcion==false);
        }
        
                /*Leemos la cantidad1*/
                double cantidad1=read.nextDouble();
                
                /*Ya tenemos las variables unidad1, unidad2 y cantidad1
                Ahora averiguamos la variable cantidad2 llamando a la clase 
                Longitudes
                Longitudes longitud=new Longitudes(unidad1,unidad2,cantidad1);
                switch (unidad1) {
                case "1":
                    longitud.kmam();
                    break;
                case "km":
                    longitud.kmam();
                    switch (unidad2) {
                    case "km":
                        longitud.makm();
                        break;
                    case "hm":
                        longitud.mahm();
                        break;
                    case "dam":
                        longitud.madam();
                        break;
                    case "m":
                        break;
                    case "dm":
                        longitud.madm();
                        break;
                    case "cm":
                        longitud.macm();
                        break;
                    case "mm":
                        longitud.mamm();
                        break;
                    }
                    break;
                case "hm":
                    longitud.hmam();
                    switch (unidad2) {
                    case "km":
                        longitud.makm();
                        break;
                    case "hm":
                        longitud.mahm();
                        break;
                    case "dam":
                        longitud.madam();
                        break;
                    case "m":
                        break;
                    case "dm":
                        longitud.madm();
                        break;
                    case "cm":
                        longitud.macm();
                        break;
                    case "mm":
                        longitud.mamm();
                        break;
                    }
                    break;
                case "dam":
                    longitud.damam();
                    switch (unidad2) {
                    case "km":
                        longitud.makm();
                        break;
                    case "hm":
                        longitud.mahm();
                        break;
                    case "dam":
                        longitud.madam();
                        break;
                    case "m":
                        break;
                    case "dm":
                        longitud.madm();
                        break;
                    case "cm":
                        longitud.macm();
                        break;
                    case "mm":
                        longitud.mamm();
                        break;
                    }
                    break;
                case "m":
                    switch (unidad2) {
                    case "km":
                        longitud.makm();
                        break;
                    case "hm":
                        longitud.mahm();
                        break;
                    case "dam":
                        longitud.madam();
                        break;
                    case "m":
                        break;
                    case "dm":
                        longitud.madm();
                        break;
                    case "cm":
                        longitud.macm();
                        break;
                    case "mm":
                        longitud.mamm();
                        break;
                    }
                    break;
                case "dm":
                    longitud.dmam();
                    switch (unidad2) {
                    case "km":
                        longitud.makm();
                        break;
                    case "hm":
                        longitud.mahm();
                        break;
                    case "dam":
                        longitud.madam();
                        break;
                    case "m":
                        break;
                    case "dm":
                        longitud.madm();
                        break;
                    case "cm":
                        longitud.macm();
                        break;
                    case "mm":
                        longitud.mamm();
                        break;
                    }
                    break;
                case "cm":
                    longitud.cmam();
                    switch (unidad2) {
                    case "km":
                        longitud.makm();
                        break;
                    case "hm":
                        longitud.mahm();
                        break;
                    case "dam":
                        longitud.madam();
                        break;
                    case "m":
                        break;
                    case "dm":
                        longitud.madm();
                        break;
                    case "cm":
                        longitud.macm();
                        break;
                    case "mm":
                        longitud.mamm();
                        break;
                    }
                    break;
                case "mm":
                    longitud.mmam();
                    switch (unidad2) {
                    case "km":
                        longitud.makm();
                        break;
                    case "hm":
                        longitud.mahm();
                        break;
                    case "dam":
                        longitud.madam();
                        break;
                    case "m":
                        break;
                    case "dm":
                        longitud.madm();
                        break;
                    case "cm":
                        longitud.macm();
                        break;
                    case "mm":
                        longitud.mamm();
                        break;
                    }
                    break;
                }
                */
    }
