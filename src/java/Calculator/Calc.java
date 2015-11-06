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
    
    private String investment;
    private double rate;
    private double years;
    ArrayList<String> future = new ArrayList<>();
    ArrayList<Integer> displayYear = new ArrayList<>();
    
    /**
     * Initialize product with empty strings and 0 price.
     */
    public Calc() {
        investment = "0";
        rate = 0;
        years = 0;
    }
    public Calc(String investment, double rate, int years){
        this.investment = investment;
        this.rate = rate;
        this.years = years;
    }
    
    public void setInvestment(double investment) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        this.investment = currency.format(investment);
    }

    public String getInvestment() {
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
    
  
    public ArrayList<String> getFuture(){
        return future;
    }
    public void setFuture(double investment, double rate, double years){
        System.out.println(investment + " invest");
        System.out.println(rate + " rate");
        System.out.println(years + " years");
        int i;
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        for(i = 1; i <= years; i++){
           investment += investment * (rate/100);
           
           String newYear = currency.format(investment);
           future.add(newYear);
           displayYear.add(i);
        }
        
    }
        public ArrayList<Integer> getDisplayYear(){
        return displayYear;
    }
 
    
    public String getPriceCurrencyFormat() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(future);
    }
}
