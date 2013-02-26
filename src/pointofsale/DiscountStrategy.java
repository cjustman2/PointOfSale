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

    double getDiscount();

    double getDiscountAmount(int qty, double unitCost);

    void setDiscount(double discount);
    
}
