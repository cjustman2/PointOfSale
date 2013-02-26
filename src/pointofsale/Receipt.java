/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsale;

/**
 *
 * @author chris
 */
public class Receipt {
    private Customer customer;
    private LineItem[] lineItems = new LineItem[0];
    
    

    public Receipt(String custId) {
       FakeDataBase db = new FakeDataBase();
       customer = db.findCustomer(custId);
    }
    
    
    
    public void addItemToSale(String prodId, int qty) {
        LineItem item = new LineItem(prodId, qty);
         addToArray(item);
    }

    
    
      private void addToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
      
      

    public double getTotalBeforeDiscount() {
        double grandTotal = 0.0;
        for(LineItem item : lineItems) {
            grandTotal += item.getOrigPriceSubtotal();
        }
        return grandTotal;
    }


    
    
    
    
    public static void main(String[] args) {
        Receipt receipt = new Receipt("100");
       
        System.out.println(receipt);
    }
    
    
    
    
}
