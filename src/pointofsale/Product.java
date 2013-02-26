
package pointofsale;

/**
 *
 * @author chris
 */
public class Product {
    private String prodId;
    private String prodName;
    private double unitCost;
    private DiscountStrategy discount;
   
    

    public Product(String prodId, String prodName, double unitCost, DiscountStrategy discount) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.unitCost = unitCost;
        this.discount = discount;
        
    }

    
    
    
    public DiscountStrategy getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }


    

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }
    
    
    
    
    
    
  
    
    
    
    
    public double getDiscount(int qty){
        return discount.getDiscountAmount(qty, unitCost);
    }
    
    
    
    
    
    
    
    public static void main(String[] args) {
       
             Product product = new Product("1234", "name", 10.00, new FixedRateDiscount(.2));
           DiscountStrategy disc = new FixedRateDiscount(.2);
             
            disc.setDiscount(.3);
             
             double amt = product.getDiscount(3);
             
             
        
        System.out.println(amt);
        System.out.println(disc.getDiscount());
          
    }
    
    
}
