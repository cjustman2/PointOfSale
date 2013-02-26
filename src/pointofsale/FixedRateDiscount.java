
package pointofsale;

public class FixedRateDiscount implements DiscountStrategy {
    private double discount = .2;
    private double discountAmt;

 
    


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
   
   
    
    public static void main(String[] args) {
        FixedRateDiscount fra = new FixedRateDiscount();
        double discount = fra.getDiscountAmount(3,100.00);
        
        System.out.println(discount);
    }
    
}
