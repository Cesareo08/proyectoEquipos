package conversorunidades;

public class Longitudes {

    private String unidad1;
    private String unidad2;
    private double cantidad1; /*Cantidad que recibimos*/
    private double cantidad2; /*Cantidad convertida*/

    public Longitudes(String unidad1, String unidad2, double cantidad1) {
        this.unidad1 = unidad1;
        this.unidad2 = unidad2;
        this.cantidad1 = cantidad1;
    }

    //MÉTODOS PARA LA CONVERSIÓN DE X A METROS
    public void kmam() {
        this.cantidad1 = this.cantidad1 * 1000;
    }

    public void hmam() {
        this.cantidad1 = this.cantidad1 * 100;
    }

    public void damam() {
        this.cantidad1 = this.cantidad1 * 10;
    }

    public void dmam() {
        this.cantidad1 = this.cantidad1 / 10;
    }

    public void cmam() {
        this.cantidad1 = this.cantidad1 / 100;

    }

    public void mmam() {
        this.cantidad2 = this.cantidad1 / 1000;
    }

    //MÉTODOS PARA LA CONVERSIÓN DE METROS A X
    public void makm() {
        this.cantidad2 = this.cantidad1 / 1000;
    }

    public void mahm() {
        this.cantidad2 = this.cantidad1 / 100;
    }

    public void madam() {
        this.cantidad2 = this.cantidad1 / 10;
    }

    public void madm() {
        this.cantidad2 = this.cantidad1 * 10;
    }

    public void macm() {
        this.cantidad2 = this.cantidad1 * 100;

    }

    public void mamm() {
        this.cantidad2 = this.cantidad1 * 1000;
    }

    //SETTER AND GETTES
    public String getUnidad1() {
        return unidad1;
    }

    public String getUnidad2() {
        return unidad2;
    }

    public double getCantidad1() {
        return cantidad1;
    }

    public double getCantidad2() {
        return cantidad2;
    }


    
            
    
   
            
            
            
            
            
            
            
            
            
            
  }
    
    

