/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsale;

/**
 *
 * @author chris
 */
public class VariableRateDiscount implements DiscountStrategy{
        private double discount = .1;
    private int minQty = 2;
    private double discountAmt;
    private int qty;

 
    public VariableRateDiscount(double discount, int qty){
        this.discount = discount;
        this.qty = qty;
    }
    
    
   
    @Override
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    @Override
    public double getDiscount(){
        return discount;
    }
    
    public int getMinQty() {
        return minQty;
    }

    public void setMinQty(int minQty) {
        this.minQty = minQty;
    }
    
    
    
    
    
    

    @Override
   public double getDiscountAmount(int qty, double unitCost){
       if(qty > minQty){
           
       discountAmt =  unitCost * qty * discount;
       
       }
       return discountAmt;
   }
   
   
    
   
    
}
