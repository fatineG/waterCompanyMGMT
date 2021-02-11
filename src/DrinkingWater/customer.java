

package DrinkingWater;

/**
 *
 * @author Fatine
 */

import java.io.Serializable;


public class customer implements Serializable{
  private  String cust_ID;
  private  String customer_name;
  private  String customer_surname;
  private  String customer_address;
  private  String customer_phone;
  
  
    public customer(String cust_ID, String customer_name, String customer_surname, String customer_address , String customer_phone) {
        this.cust_ID = cust_ID;
        this.customer_name = customer_name;
        this.customer_surname = customer_surname;
        this.customer_address = customer_address;
        this.customer_phone = customer_phone;
        
    }

    public String getcust_ID() {
        return cust_ID;
    }

    public void setcust_ID(String cust_ID) {
        this.cust_ID = cust_ID;
    }

    public String getcustomer_name() {
        return customer_name;
    }

    public void setcustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getcustomer_surname() {
        return customer_surname;
    }

    public void setcustomer_surname(String customer_surname) {
        this.customer_surname = customer_surname;
    }

    public String getcustomer_address() {
        return customer_address;
    }

    public void setcustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public String getcustomer_phone() {
        return customer_phone;
    }

    public void setcustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }

     
}
