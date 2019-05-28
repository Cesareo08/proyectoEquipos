package conversorunidades;

import java.util.Scanner;

public class ConversorUnidades {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        /*Interfaz Principal*/
        System.out.println("Conversor de Unidades");
        System.out.println("Introduzca la opción que quiera utilazar: ");
        System.out.println("    1. Conversor Unidades Longitudinales");
        System.out.println("    2. Conversor Unidades de Potencia");
        System.out.println("    3. Conversor Unidades de Temperatura");
        System.out.println("    4. Salir");
        int opcion1;
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

            /*Recorremos el bucle 2 veces para obtener la unidad que tenemos, 
            a la unidad que queremos*/
            int opcion2 = 1;
            do {
                System.out.println("Introduzca las unidades que quiera "
                        + "utilizar: ");

                /*Declarar variables*/
                String unidad1 = "m";
                String unidad2 = "m";

                /*Mostrar primeras opciones*/
                System.out.println("    Unidades: ");
                System.out.println("        - 1 Kilómetros a Millas");
                System.out.println("        - 2 Millas a Kilómetros");
                System.out.println("        - 3 Millas a Pulgadas");
                System.out.println("        - 4 Pulgadas a Millas");
                System.out.println("        - 5 Otros");
                System.out.println("        - 6 Salir");

                /*Leer primeras opciones*/
                opcion2 = read.nextInt();
                while (opcion2 < 1 || opcion2 > 6) {
                    System.out.println("La opción introducida es "
                            + "incorrecta. Por favor, vuelva a introducir "
                            + "una opción.");
                }

                Longitudes longitud = new Longitudes(1);;
                if (opcion2 >= 1 && opcion2 <= 4) {
                    /*Leer cantidad1*/
                    System.out.println("Introduzca la cantidad que quiere "
                            + "transformar: ");
                    double cantidad1 = read.nextDouble();

                    longitud.setCantidad1(cantidad1);
                }

                /*Ejecutar primeras opciones*/
                switch (opcion2) {
                    case 1:
                        unidad1 = "km";
                        unidad2 = "M";
                        longitud.kmaMillas();
                        break;
                    case 2:
                        unidad1 = "M";
                        unidad2 = "km";
                        longitud.millasaKm();
                        break;
                    case 3:
                        unidad1 = "M";
                        unidad2 = "P";
                        longitud.millasaPulgadas();
                        break;
                    case 4:
                        unidad1 = "P";
                        unidad2 = "M";
                        longitud.pulgadasaMillas();
                        break;
                    case 5:
                        otrosLongitudes(longitud);
                        break;
                    case 6:
                        break;
                }

//                /*Mostrar la solución*/
//                System.out.println("El cambio de la unidad 1, " + unidad1 + ", a "
//                        + "la unidad2, " + unidad2 + ", de " + longitud.getCantidad1()
//                        + " es de " + longitud.getCantidad2());
//                System.out.println(longitud.getCantidad1() + " " + unidad1 + " = "
//                        + longitud.getCantidad2() + " " + unidad2);

            resultado(unidad1,unidad2, longitud.getCantidad1(),longitud.getCantidad2());
            } while (opcion2 != 6);
            //menu potencias
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
                System.out.println("        - 1 Vatio");
                System.out.println("        - 2 KW");
                System.out.println("        - 3 CV");
                System.out.println("        - 4 CF");
                System.out.println("        - 5 MV");
                System.out.println("        - 6 Pé/Libra");
                System.out.println("        - 7 salir");
                opcion2 = read.nextInt();

                while (opcion2 < 1 || opcion2 > 7) {
                    System.out.println("\"La opción introducida es incorrecta. Por \"\n"
                            + "                        + \"favor, vuelva a introducir una opción.\"");
                    opcion2 = read.nextInt();
                }
                
                 if (opcion2 >= 1 && opcion2 <= 6) {
                    /*Leemos un valor double que se los asignaremos a nuestra cantidad1*/
                    System.out.println("Introduzca la cantidad que quiere "
                            + "transformar: ");
                    double cantidad1 = read.nextDouble();
                    
                    potencias.setCantidad1(cantidad1);
                }
                 double cantidadEnVatios=0;
                 switch(opcion2){
                     case 1: potencias.VatioaVatios();
                         break;
                     case 2: potencias.KWaVatios();
                         break;
                    
                     case 3:    potencias.CVaVatios();
                         break;
                     case 4:    potencias.CFaVatios();
                         break;
                     case 5:    potencias.MWaVatios();
                         break;
                     case 6:    potencias.PeLibraaVatios();
                         break;
                     case 7:
                         break;
                   
                 }
                 
                 System.out.println("    Convertir a: ");
                System.out.println("        - 1 Vatio");
                System.out.println("        - 2 KW");
                System.out.println("        - 3 CV");
                System.out.println("        - 4 CF");
                System.out.println("        - 5 MV");
                System.out.println("        - 6 Pé/Libra");
                System.out.println("        - 7 salir");
                int opcionAconvertir=0;
                opcionAconvertir = read.nextInt();
                 while(opcionAconvertir<1 || opcionAconvertir>7){
                     System.out.println("La opción introducida es "
                            + "incorrecta. Por favor, vuelva a introducir "
                            + "una opción.");

                 }
                 switch(opcionAconvertir){
                     
                     case 1:
                         //conversion a vatios
                         break;
                     case 2: 
                        //conversion a kw
                         break;
                     case 3: 
                         //conversion a CV
                         break;
                     case 4:
                         //conversion a CF
                         break;
                    case 5:
                         //conversion a MW
                         break;
                    case 6:
                         //conversion a Pe/Libra
                         break;
                     case 7: break;    
                         
                         
                        
                     }
                     //LLamamos al método que visualiza los resultados
                     resultado(unidad1,unidad2,potencias.getCantidad1(),potencias.getCantidad2());
          
            } while (opcion2 != 7);

        }else if (opcion1==3) {
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
                     case 5: break;    
                         
                         
                        
                     }
                     //LLamamos al método que visualiza los resultados
                     resultado(unidad1,unidad2,temperaturas.getT1(),temperaturas.getT2());
        }while(opcion2!=5);
        }
    }
    
    public static void otrosLongitudes(Longitudes longitud) {
        String opcionString;
        String unidad1="m";
        String unidad2="m";
        boolean opcion;
        /*Repetimos el prceso de escoger la unidad 2 veces puesto que tenemos 
        2 unidades que escoger*/
        for (int i = 0; i < 2; i++) {
            /*Texto inicial*/
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
        longitud.setCantidad1(cantidad1);

        /*Ya tenemos las variables unidad1, unidad2 y cantidad1
        Ahora averiguamos la variable cantidad2 llamando a la clase 
        Longitudes*/
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
