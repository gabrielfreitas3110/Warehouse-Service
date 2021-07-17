/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Gabriel Augusto
 */
public class ImportedProducts extends Product{
    private Double customsFee;

    public ImportedProducts(String name, Double price, Double cusomsFee) {
        super(name, price);
        this.customsFee = cusomsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    
    public double totalPrice() {
        return getPrice()+customsFee;
    }
    
    @Override
    public String priceTag() {
        return getName()+ " $ " 
                + String.format("%.2f",totalPrice()) 
                + "(Customs fee: $" 
                + String.format("%.2f",customsFee) + ")";
    }
    
}