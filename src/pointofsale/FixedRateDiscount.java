
package pointofsale;

public class FixedRateDiscount implements DiscountStrategy {
    private double discount = .1;
    private double discountAmt;

 
    public FixedRateDiscount(double discount){
        this.discount = discount;
    }


    @Override
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    @Override
    public double getDiscount(){
        return discount;
    }
    

    @Override
   public double getDiscountAmount(int qty, double unitCost){
      
           
       discountAmt =  unitCost * qty * discount;
       
       
       return discountAmt;
   }
   
   

    
}
