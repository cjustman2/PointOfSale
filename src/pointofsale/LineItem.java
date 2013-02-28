/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsale;

/**
 *
 * @author chris
 */
public class LineItem {
    private Product product;
    private int qty;
   
    public LineItem(String prodId, int qty) {
        FakeDataBase db = new FakeDataBase();
       product = db.findProduct(prodId);
    }
    
    
    
    public double getOrigPriceSubtotal() {
        return product.getUnitCost() * qty;
    }
    
 
    public String getProductName(){
        return product.getProdName();
    }
    
}
