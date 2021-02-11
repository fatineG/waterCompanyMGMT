/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrinkingWater;

/**
 *
 * @author Fatine
 */

import java.io.Serializable;



    public class order implements Serializable{
  private  String order_ID;
  private  String order_debit;
  private  String order_date;
  private  String paid;
  private  String left;
    private  String cust_ID;
    private String stock_ID;
  
    public order(String order_ID, String order_debit, String order_date, String paid, String left,String cust_ID,String stock_ID) {
        this.order_ID = order_ID;
        this.order_debit = order_debit;
        this.order_date = order_date;
        this.paid = paid;
        this.left = left;
        this.cust_ID= cust_ID;
        this.stock_ID= stock_ID;
    }

    public String getOrder_ID() {
        return order_ID;
    }

    public void setOrder_ID(String order_ID) {
        this.order_ID = order_ID;
    }

    public String getOrder_debit() {
        return order_debit;
    }

    public void setOrder_debit(String order_debit) {
        this.order_debit = order_debit;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date ;
    }

    public String getOrder_paid() {
        return paid;
    }

    public void setOrder_paid(String paid) {
        this.paid = paid;
    }

    public String getOrder_left() {
        return left;
    }

    public void setOrder_left(String left) {
        this.left = left;
    }

   
    public String getcust_ID(){
    return cust_ID;
    } 
    
    public void setcust_ID(String cust_ID){
    this.cust_ID = cust_ID;
    }
    
    public String getstock_ID(){
    return stock_ID ;
    }
    
    public void setstock_ID(String stock_ID){
    this.stock_ID = stock_ID;
    }
    
    
}

    

