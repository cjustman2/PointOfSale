/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsale;

/**
 *
 * @author chris
 */
public interface DiscountStrategy {

    public abstract double getDiscount();

    public abstract double getDiscountAmount(int qty, double unitCost);

    public abstract void setDiscount(double discount);
    
}
