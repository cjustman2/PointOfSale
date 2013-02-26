/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsale;

/**
 *
 * @author chris
 */
public class NoDiscount implements DiscountStrategy{
    private double discountAmt;
    private double discount = 0.0;
    

    @Override
    public double getDiscount() {
        return discount;
    }

    @Override
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
  

    @Override
    public double getDiscountAmount(int qty, double unitCost) {
        return discountAmt;
    }
}
