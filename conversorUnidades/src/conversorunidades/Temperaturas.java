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
public class Temperaturas {
    private double t1;
    private double t2;
    
    public Temperaturas(double t){
        this.t1=t;
    }
    
    
    public void celsiusaFahrenheit(){
        this.t2=this.t1*33.8;
        
    }
    public void fahrenheitaCelsius(){
        this.t2=this.t1/33.8;
    }
    public void celsiusaKelvin(){
        this.t2=this.t1*274.15;
    }
    public void kelvinaCelsius(){
        this.t2=this.t1/274.15;
    }
    
    public double getT2(){
        return this.t2;
    }
    public double getT1(){
        return this.t1;
    }
    public void setT1(double t){
        this.t1=t;
    }
}
