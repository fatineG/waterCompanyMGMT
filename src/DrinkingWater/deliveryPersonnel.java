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

     public class deliveryPersonnel implements Serializable{
  private  String pers_ID;
  private  String pers_name;
  private  String pers_surname;
  private  String pers_phone;
  private  String pers_gender;
 
  
  
    public deliveryPersonnel(String pers_ID, String pers_name , String pers_surname, String pers_phone, String pers_gender) {
        this.pers_ID = pers_ID;
        this.pers_name = pers_name;
        this.pers_surname = pers_surname;
        this.pers_phone = pers_phone;
        this.pers_gender = pers_gender;
        
    }

    public String getPers_ID() {
        return pers_ID;
    }

    public void setPers_ID(String pers_ID) {
        this.pers_ID = pers_ID;
    }

    public String getPers_name() {
        return pers_name;
    }

    public void setPers_name(String pers_name) {
        this.pers_name = pers_name;
    }

    public String getPers_surname() {
        return pers_surname;
    }

    public void setPers_surname(String pers_surname) {
        this.pers_surname = pers_surname ;
    }

    public String getPers_phone() {
        return pers_phone;
    }

    public void setPers_phone(String pers_phone) {
        this.pers_phone = pers_phone;
    }

    public String getPers_gender() {
        return pers_gender;
    }

    public void setPers_gender(String pers_gender) {
        this.pers_gender = pers_gender;
    }

   
     
}

    


