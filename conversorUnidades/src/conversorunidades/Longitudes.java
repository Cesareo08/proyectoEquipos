package conversorunidades;

public class Longitudes {
    
    private double cantidad1;//cantidad que recibimos
    private double cantidad2;//cantidad convertida

    public Longitudes() {
    }
    public Longitudes(double cantidad) {
            this.cantidad1 = cantidad;
    }

    //MÉTODOS PARA LA CONVERSIÓN DE X A METROS
    public void kmam() {
        this.cantidad2 = this.cantidad1 * 1000;
    }

    public void hmam() {
        this.cantidad2 = this.cantidad1 * 100;
    }

    public void damam() {
        this.cantidad2 = this.cantidad1 * 10;
    }

    public void dmam() {
        this.cantidad2 = this.cantidad1 / 10;
    }

    public void cmam() {
        this.cantidad2 = this.cantidad1 / 100;

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

    //OPERACIONES QUE PIDE EL PROFESOR
    public void kmaMillas() {
        this.cantidad2 = this.cantidad1 * 0.621371;

    }

    public void millasaKm() {
        this.cantidad2 = this.cantidad1 / 0.621371;
    }

    public void millasaPulgadas() {
        this.cantidad2 = this.cantidad1*63360;
    }

    public void pulgadasaMillas() {
        this.cantidad2 = this.cantidad1/63360;
    }

    //GETS()
    public double getCantidad1() {
        return cantidad1;
    }

    public double getCantidad2() {
        return cantidad2;
    }
    
    //SETS()
    public void setCantidad1(double cantidad1) {
        this.cantidad1 = cantidad1;
    }
    

}
