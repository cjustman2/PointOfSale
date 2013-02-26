/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsale;

/**
 *
 * @author chris
 */
public class Customer {
    private String custId;
    private String custName;
    private FakeDataBase customerInfo;
    
    
    
    public Customer(String custId, String custName){
        this.custId = custId;
        this.custName = custName;
    }
    
    
    

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }
    
    
    
    public String findCustomer(String custId){
        return customerInfo.findCustomer(custId);
    }
    
    
}
