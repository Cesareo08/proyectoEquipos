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
    public void KWaCV(){
        this.cantidad2=this.cantidad1*1.34102;
    }
    public void CVaKW(){
         this.cantidad2=this.cantidad1/1.34102;
    }
    public void KWaFtLb(){
        this.cantidad2=this.cantidad1*737.562149;
    }
    public void FtLbaKW(){
        this.cantidad2=this.cantidad1/737.562149;
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
