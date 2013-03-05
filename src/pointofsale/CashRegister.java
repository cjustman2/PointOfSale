/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsale;

/**
 *
 * @author chris
 */
public class CashRegister {
    private Receipt receipt;
    private int qty;
    private String custId;
    private String prodId;
    
    
    public CashRegister(int qty, String custId, String prodId){
        this.qty = qty;
        this.custId = custId;
        this.prodId = prodId;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }
    
    
}
