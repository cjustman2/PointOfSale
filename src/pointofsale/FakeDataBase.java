/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsale;

/**
 *
 * @author chris
 */
public class FakeDataBase {
  
   
    
    
       Product[] products = {
	        new Product("A101", "Baseball Hat", 19.95, new FixedRateDiscount(0.15)),
	        new Product("B205", "Men's Dress Shirt", 35.50, new VariableRateDiscount(.10,5)),
	        new Product("C222", "Women's Socks", 9.50, new NoDiscount())
	    };
    
       
       
    
      public final Product findProduct(final String prodId) {
	        // validation is needed
	        Product product = null;
	        for(Product p : products) {
	            if(prodId.equals(p.getProdId())) {
	                product = p;
	                break;
	            }
	        }

	        return product;
	    }
    
}
