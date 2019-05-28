package conversorunidades;

/*
    @author Brian Fernández Blanco
    @author Izan Vázquez
    @author Cesáreo González Rodríguez
*/

import java.util.Scanner;

public class ConversorUnidades {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        /*Interfaz Principal*/
        int opcion1;
        do{
            System.out.println("Conversor de Unidades");
            System.out.println("Introduzca la opción que quiera utilazar: ");
            System.out.println("    1. Conversor Unidades Longitudinales");
            System.out.println("    2. Conversor Unidades de Potencia");
            System.out.println("    3. Conversor Unidades de Temperatura");
            System.out.println("    4. Salir");
            do {
                opcion1 = read.nextInt();
                if (opcion1 < 1 || opcion1 > 4) {
                    System.out.println("La opción introducida es incorrecta. Por "
                            + "favor, vuelva a introducir una opción.");
                }
            } while (opcion1 < 1 || opcion1 > 4);

            /*Interfaz Lonxitude*/
            if (opcion1 == 1) {
                System.out.println("Opción 1. Conversor Unidades Longitudinales");

                refactorizacionLongitudes();

            //Interfaz Potencias
            } else if (opcion1 == 2) {
                int opcion2 = 0;
                do {

                    //llamamos a la clase de tipo Potencias y creamos un objeto apartir 
                    //del cual haremos las funcioens de conversion
                    Potencias potencias = new Potencias(1);
                    //VARIABLES UNIDADES
                    String unidad1 = "";
                    String unidad2 = "";
                    /*Mostrar opciones*/
                    System.out.println("    Unidades: ");
                    System.out.println("        - 1 KW a CV");
                    System.out.println("        - 2 CV a KW");
                    System.out.println("        - 3 KW a FtLb");
                    System.out.println("        - 4 FtLb a KW");
                    System.out.println("        - 5 Salir");

                    opcion2 = read.nextInt();

                    while (opcion2 < 1 || opcion2 > 5) {
                        System.out.println("\"La opción introducida es incorrecta. Por \"\n"
                                + "                        + \"favor, vuelva a introducir una opción.\"");
                        opcion2 = read.nextInt();
                    }

                    if (opcion2 >= 1 && opcion2 <= 4) {
                        /*Leemos un valor double que se los asignaremos a nuestra cantidad1*/
                        System.out.println("Introduzca la cantidad que quiere "
                                + "transformar: ");
                        double cantidad1 = read.nextDouble();

                        potencias.setCantidad1(cantidad1);
                    }

                    switch(opcion2){
                    case 1:
                        unidad1="KW";
                        unidad2="CV";
                        potencias.KWaCV();
                        break;
                    case 2: 
                        unidad1="CV";
                        unidad2="KW";
                        potencias.CVaKW();
                        break;
                    case 3: 
                        unidad1="KW";
                        unidad2="FtLb";
                        potencias.KWaFtLb();
                        break;
                    case 4:
                        unidad1="FtLb";
                        unidad2="KW";
                        potencias.FtLbaKW();
                        break;
                    case 5: break;    
                    }
                    //LLamamos al método que visualiza los resultados
                    resultado(unidad1,unidad2,potencias.getCantidad1(),
                            potencias.getCantidad2());
                } while(opcion2!=5);
                
            } else if (opcion1==3) {
                int opcion2 = 0;
                do {

                    //llamamos a la clase de tipo Potencias y creamos un objeto apartir 
                    //del cual haremos las funcioens de conversion
                    Temperaturas temperaturas = new Temperaturas(1);
                    //VARIABLES UNIDADES
                    String unidad1 = "";
                    String unidad2 = "";
                    /*Mostrar opciones*/
                    System.out.println("    Unidades: ");
                    System.out.println("        - 1 Celsius(Cº) a Fahrenheit(Fº)");
                    System.out.println("        - 2 Fahrenheit a Celsius");
                    System.out.println("        - 3 Celsius a Kelvin (K)");
                    System.out.println("        - 4 Kelvin a Celsius");
                    System.out.println("        - 5 Volver al Menú Principal");

                    opcion2 = read.nextInt();

                    while (opcion2 < 1 || opcion2 > 5) {
                        System.out.println("\"La opción introducida es incorrecta. Por \"\n"
                                + "                        + \"favor, vuelva a introducir una opción.\"");
                        opcion2 = read.nextInt();
                    }

                    if (opcion2 >= 1 && opcion2 <= 4) {
                       /*Leemos un valor double que se los asignaremos a nuestra cantidad1*/
                       System.out.println("Introduzca la cantidad que quiere "
                               + "transformar: ");
                       double cantidad1 = read.nextDouble();

                       temperaturas.setT1(cantidad1);
                    }

                    switch(opcion2){

                        case 1:
                            unidad1="Cº";
                            unidad2="Fº";
                            temperaturas.celsiusaFahrenheit();
                            break;
                        case 2: 
                            unidad1="Fº";
                            unidad2="Cº";
                            temperaturas.fahrenheitaCelsius();
                            break;
                        case 3: 
                            unidad1="Cº";
                            unidad2="K";
                            temperaturas.celsiusaKelvin();
                            break;
                        case 4:
                            unidad1="K";
                            unidad2="Cº";
                            temperaturas.kelvinaCelsius();
                            break;
                        case 5:
                            break;    



                        }
                        //LLamamos al método que visualiza los resultados
                        resultado(unidad1,unidad2,temperaturas.getT1(),
                                temperaturas.getT2());
                }while(opcion2!=5);
            }
        } while(opcion1!=4);
    }
    
    public static String refactorizacionLongitudes() {
        String opcionString;
        String unidad1="m";
        String unidad2="m";
        boolean opcion;
        Longitudes longitud=new Longitudes();
        /*Texto inicial*/
        System.out.println("Introduzca las unidades que quiera "
                + "utilizar: ");
        /*Lectura falsa*/
        read.nextLine();
        /*Repetimos el prceso de escoger la unidad 2 veces puesto que tenemos 
        2 unidades que escoger*/
        for (int i = 0; i < 2; i++) {
            if (i==0) {
                System.out.println("Unidad 1:");
            }
            if (i==1) {
                System.out.println("Unidad 2:");
            }

            /*Escogemos las unidades*/
            do{
                System.out.println("    Unidades: ");
                System.out.println("        - 1 (kilómetros)");
                System.out.println("        - hm (hectómetros)");
                System.out.println("        - dam (decámetros)");
                System.out.println("        - 2 (metros)");
                System.out.println("        - dm (decímetros)");
                System.out.println("        - 3 (centímetros)");
                System.out.println("        - mm (milímetros)");
                System.out.println("        - 4 (pulgadas)");
                System.out.println("        - 5 (yardas)");
                System.out.println("        - 6 (piés)");
                System.out.println("        - 7 (millas)");
                System.out.println("        - 8 (Millas Náuticas)");
                System.out.println("        - 9 Volver al menú principal");

                /*Leemos la unidad 1*/
                opcionString=read.nextLine();
                /*Pasamos la opcion a minúsculas*/
                opcionString=opcionString.toLowerCase();
                /*Eliminamos los espacios en blanco de la opción*/
                opcionString=opcionString.replace(" ","");

                /*Si la opcion no es correcta repetimos*/
                if (!(opcionString.equals("1") || 
                        opcionString.equals("hm") || 
                        opcionString.equals("dam") || 
                        opcionString.equals("2") || 
                        opcionString.equals("dm") || 
                        opcionString.equals("3") ||
                        opcionString.equals("mm") ||
                        opcionString.equals("4") ||
                        opcionString.equals("5") ||
                        opcionString.equals("6") ||
                        opcionString.equals("7") ||
                        opcionString.equals("8") ||
                        opcionString.equals("9"))) {
                    opcion=false;
                    if (!opcionString.equals("9")) {
                        System.out.println("La unidad introducida es "
                                + "incorrecta. Por favor, vuelva a introducir "
                                + "una opción.");
                    }
                } else{
                    /*En la primera vuelta del bucle obtenemos la unidad 1*/
                    if (i==0) {
                        unidad1=opcionString;
                    }
                    /*En la segunda vuelta del bucle obtenemos la unidad 2*/
                    if (i==1) {
                        unidad2=opcionString;
                    }
                    opcion=true;
                }
            } while(opcion==false);
        }

        /*Leemos la cantidad1*/
        System.out.println("Introduzca la cantidad que quiera cambiar: ");
        double cantidad1=read.nextDouble();
        longitud.setCantidad1(cantidad1);

        /*Ya tenemos las variables unidad1, unidad2 y cantidad1
        Ahora averiguamos la variable cantidad2 llamando a la clase 
        Longitudes*/
        switch (unidad1) {
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

        return unidad1+" "+unidad2;
    }

    //metodo que visualice los resultados
    public static void resultado(String u1, String u2, double c1, double c2){

        System.out.println("El cambio de la unidad 1, " + u1 + ", a "
                        + "la unidad2, " + u2 + ", de " + c1
                        + " es de " + c2);
                System.out.println(c1 + " " + u1 + " = "
                        + c2 + " " + u2);
    }
    
    
}
