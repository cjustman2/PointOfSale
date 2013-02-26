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
    private FakeDataBase productInfo;
   
    
    
    public String findProduct(String prodId){
    return productInfo.findProduct(prodId);
    }
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        
    }
    
}
