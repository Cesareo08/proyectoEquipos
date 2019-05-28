/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorunidades;

/**
 *
 * @author dam130
 */
public class Potencias {
    private double cantidad1;
    private double cantidad2;
    
    
    public Potencias(double c){
        this.cantidad1=c;
    }
    public void VatioaVatios(){
        this.cantidad2=this.cantidad1;
    }
    public void KWaVatios(){
         this.cantidad2=this.cantidad1*1000;
    }
    public void CVaVatios(){
        this.cantidad2=this.cantidad1*737.562149;
    }
    public void CFaVatios(){
        this.cantidad2=this.cantidad1*745.7;
    }
    public void MWaVatios(){
        this.cantidad2=this.cantidad1*1000000;
    }
    public void PeLibraaVatios(){
        this.cantidad2=this.cantidad1*1.36;
    }
    
      public void VatiosaVatios(){
        this.cantidad2=this.cantidad1;
    }
    public void VatiosaKW(){
         this.cantidad2=this.cantidad1/1000;
    }
    public void VatiosaCV(){
        this.cantidad2=this.cantidad1/737.562149;
    }
    public void VatiosaCF(){
        this.cantidad2=this.cantidad1/745.7;
    }
    public void VatiosaMW(){
        this.cantidad2=this.cantidad1/1000000;
    }
    public void VatiosaPeLibra(){
        this.cantidad2=this.cantidad1/1.36;
    }
    
    
    public double getCantidad2(){
        return this.cantidad2;
    }
    public void setCantidad1(double c){
        this.cantidad1=c;
    }
    public double getCantidad1(){
        return this.cantidad1;
    }
           


}
