/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import java.text.NumberFormat;
import java.io.Serializable;
import java.util.ArrayList;


/**
 *
 * @author Zane
 */
public class Calc implements Serializable{
    
    private double investment;
    private double rate;
    private double years;
    private ArrayList<Double> future;
    
    
    /**
     * Initialize product with empty strings and 0 price.
     */
    public Calc() {
        investment = 0;
        rate = 0;
        years = 0;
    }
    public Calc(double investment, double rate, int years){
        this.investment = investment;
        this.rate = rate;
        this.years = years;
    }
    
    public void setInvestment(double investment) {
        this.investment = investment;
    }

    public double getInvestment() {
        return investment;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setYears(double years) {
        this.years = years;
    }

    public double getYears() {
        return years;
    }
    
  
    public ArrayList<Double> getFuture(){
        return future;
    }
    public void setFuture(double investment, double rate, double years){
        int i;
        
        for(i = 0; i <= years; i++){
           investment += investment * (rate/100);
           double newYear = investment;
           future.add(newYear);
           System.out.println(newYear + "haha");
        }
        
    }
        
    
    
    public String getPriceCurrencyFormat() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(future);
    }
}
