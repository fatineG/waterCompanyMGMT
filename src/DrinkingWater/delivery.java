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


    
    public class delivery implements Serializable{
  private  String del_ID;
  private  String del_date;
  private  String del_time;
  private  String paid;
  private String items;
  private String pers_ID;
  private String order_ID;
 
  
  
    public delivery(String del_ID, String del_date , String del_time, String paid, String items,String pers_ID,String order_ID) {
        this.del_ID = del_ID;
        this.del_date = del_date;
        this.del_time = del_time;
        this.paid = paid;
        this.items = items;
        this.pers_ID = pers_ID;
        this.order_ID = order_ID;
    }

    public String getDel_ID() {
        return del_ID;
    }

    public void setDel_ID(String del_ID) {
        this.del_ID = del_ID;
    }

    public String getDel_date() {
        return del_date;
    }

    public void setDel_date(String del_date) {
        this.del_date = del_date;
    }

    public String getDel_time() {
        return del_time;
    }

    public void setDel_time(String del_time ) {
        this.del_time= del_time ;
    }

    public String getDel_paid() {
        return paid;
    }

    public void setDel_paid(String del_paid) {
        this.paid = del_paid;
    }

    public String getDel_items() {
        return items;
    }

    public void setDel_items(String del_items) {
        this.items= items;
    }

    public String getpers_ID(){
        return pers_ID;
    }
    
    public void setpers_ID(String pers_ID){
        this.pers_ID = pers_ID;
    }

     public String getorder_ID(){      
        return order_ID;
     }
     
     public void setorder_ID(String order_ID){
         this.order_ID = order_ID;
     }
     
}



    
