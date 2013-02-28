/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsale;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author chris
 */
public class Receipt {
    private Customer customer;
    private LineItem[] lineItems = new LineItem[0];
    
    
    
     String format = "MM/dd/yyyy hh:mm a";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date date = new Date();
        //Calendar c = Calendar.getInstance();
         //c = Calendar.getInstance();
        //date = c.getTime();
        // Now format the date object as a String
        String formattedDate = sdf.format(date);
    

    public Receipt(String custId) {
       FakeDataBase db = new FakeDataBase();
       customer = db.findCustomer(custId);
    }
    
    public void outputReceipt(){
        System.out.println("Thanks for shopping with us. \n\n " + customer.getCustName() + 
                "\n\n" + date + "\n\n ");
        for(int i = 0; i < lineItems.length; i++){
            System.out.println(lineItems[i].getProductName());
        }
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
        Receipt receipt = new Receipt("200");
        receipt.outputReceipt();
        receipt.addItemToSale("A101", 2);
        receipt.addItemToSale("C222", 3);
       
       
    }
    
    
    
    
}
