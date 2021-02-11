

package DrinkingWater;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import static DrinkingWater.DrinkingWaterDeliveryServices.customers;
import static DrinkingWater.DrinkingWaterDeliveryServices.deliveries;
import static DrinkingWater.DrinkingWaterDeliveryServices.orders;
import static DrinkingWater.DrinkingWaterDeliveryServices.deliveryPersonnels;
import static DrinkingWater.DrinkingWaterDeliveryServices.stocks;


    
public class DrinkingWaterDeliveryServices {
  public static List customers, stocks, deliveries, orders,deliveryPersonnels;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        customers = new ArrayList();
        stocks = new ArrayList();
        deliveries = new ArrayList();
        orders = new ArrayList();
        deliveryPersonnels = new ArrayList();

        test_customer();
        test_stock();
        test_order();
        test_deliveryPersonnel();
        test_delivery();
       new Menu().setVisible(true);
        
        System.out.printf("\n");
    }

   

//add customer
    public static void add_customer(String cust_ID,String customer_name, String customer_surname, String customer_address,String customer_phone){
     customer c = new customer(cust_ID,customer_name,customer_surname,customer_address,customer_phone);
      customers.add(c);
    } 
    


    //edit customer
     public static void edit_customer(String cust_ID,String customer_name, String customer_surname, String customer_address,String customer_phone) {
      customer c =null;
      Boolean found=false;
      Iterator <customer> itr = customers.iterator();
      while (itr.hasNext()) {
          c = itr.next(); 
          if(cust_ID.equals(c.getcust_ID())) {
              found=true;
              break;
          }
      }
      if (found) {
          
          c.setcust_ID(cust_ID);
          c.setcustomer_surname(customer_surname);
          c.setcustomer_name(customer_name);
          c.setcustomer_address(customer_address);
          c.setcustomer_phone(customer_phone);
      }
      }
    

 //delete customer
     public static void delete_customer(String cust_ID) {
      customer c =null;
      Boolean found=false;
      Iterator <customer> itr = customers.iterator();
      while (itr.hasNext()) {
          c = itr.next(); 
          if(cust_ID == c.getcust_ID()) {
              found=true;
              break;
          }
      }
      if (found) customers.remove(c);
      }

     
     //draw line
    public static void draw_line(int num) {
        String ln="";
        for (int i=0; i<num; i++) ln+="=";
        System.out.printf("\n"+ln);
    }
    
     

//retrieve customer
        public static void retrieve_customer() throws IOException, ClassNotFoundException
    {
     File infile  = new File("customer.dat");
     FileInputStream infilestream = new FileInputStream(infile);
     ObjectInputStream inObjectStream = new ObjectInputStream(infilestream);
     customers = (ArrayList)inObjectStream.readObject();
     
     inObjectStream.close();
     
    }


  //backup customer
       public static void backup_customer() throws IOException
    {
     File outfile  = new File("customer.dat");
     FileOutputStream outfilestream = new FileOutputStream(outfile);
     ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream);
     
     outObjectStream.writeObject(customers);
     outObjectStream.close();
    }
       
 //list customer
    public static void list_customer() {
      customer c =null ;
     
      Iterator <customer> itr = customers.iterator();
      System.out.printf("\n%15s %13s %20s %20s %20s ",
              "Cust ID", 
              "Cust_name","Cust_surname","Cust_address","Cust_phone"); 
        draw_line(110);
    
      while (itr.hasNext()) {
          c = itr.next(); 
          System.out.printf("\n%15s %13s %20s %20s %20s ",
              c.getcust_ID(), c.getcustomer_name(), c.getcustomer_surname(),c.getcustomer_address(),c.getcustomer_phone());
      }
      draw_line(110);
        
    }


    //test customer
public static void test_customer() {
        try {
        System.out.printf("\n Tests for Class Customer \n\n");
        System.out.printf("\n Add_customer()\n\n");
        add_customer("116229", "Ali Huseyin", "Faisal", "Famagusta", "5331057412");
        add_customer("186731", "Ayse", "Kemaller", "Lefkosa", "5332001474");
        add_customer("168337", "Muhammad", "Fahrad","Lefkosa", "5336987415");
        add_customer("189222", "Fatima", "Reshad","Girne", "5391053618");
        System.out.printf("\n List_customer() \n\n");
        list_customer();
        System.out.printf("\n Edit_customer() \n\n");
        edit_customer("186731", "Ayse", "Kemaller", "Famagusta", "5336941022");
        System.out.printf("\n List_customer()\n\n");
        list_customer();
        backup_customer();
        
        System.out.printf("\n Delete_customer()\n\n");
        delete_customer("189222");
        
        System.out.printf("\n List_customer()\n\n");
        list_customer();
        
        retrieve_customer();
        System.out.printf("\n List_customer()\n\n");
        list_customer();
        }
        catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error");
} 
}



//add order
 public static void add_order(String order_ID, String order_debit, String order_date, String paid,String left,String cust_ID,String stock_ID){
     order or = new order(order_ID,order_debit,order_date,paid,left,cust_ID,stock_ID);
      orders.add(or);
    } 


//edit order
     public static void edit_order(String order_ID, String order_debit, String order_date, String paid, String left,String cust_ID,String stock_ID){
     order or=null;
      Boolean found=false;
      Iterator <order> itr = orders.iterator();
      while (itr.hasNext()) {
          or = itr.next(); 
          if(order_ID.equals(or.getOrder_ID())) {
              found=true;
              break;
          }
      }
      if (found) {
          
          or.setOrder_ID(order_ID);
          or.setOrder_debit(order_debit);
          or.setOrder_date(order_date);
          or.setOrder_left(left);
          or.setOrder_paid(paid);
          or.setcust_ID(cust_ID);
          or.setstock_ID(stock_ID);
      }
     }
      
     
     
     //delete order
     public static void delete_order(String order_ID) {
      order or=null;
      Boolean found=false;
      Iterator <order> itr = orders.iterator();
      while (itr.hasNext()) {
          or = itr.next(); 
          if(order_ID.equals(or.getOrder_ID())) {
              found=true;
              break;
          }
      }
      if (found) orders.remove(or);
      
     }

//retrieve order
        public static void retrieve_order() throws IOException, ClassNotFoundException
    {
     File infile  = new File("order.dat");
     FileInputStream infilestream = new FileInputStream(infile);
     ObjectInputStream inObjectStream = new ObjectInputStream(infilestream);
     orders = (ArrayList)inObjectStream.readObject();
     
     inObjectStream.close();
     
    }


  //backup order
       public static void backup_order() throws IOException
    {
     File outfile  = new File("order.dat");
     FileOutputStream outfilestream = new FileOutputStream(outfile);
     ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream);
     
     outObjectStream.writeObject(orders);
     outObjectStream.close();
    }
       

       
       //list order 
    public static void list_order() {
      order or;
     
      Iterator <order> itr = orders.iterator();
      System.out.printf("\n%10s %10s %15s %10s %12s %15s %19s %15s %12s %16s",
              "Order.ID", 
              "Debit","Order_date","Paid","Left","Cust.ID","Customer_name","Cust_phone","Stock.ID","Item_name"); 
        draw_line(150);
    
      while (itr.hasNext()) {
          or = itr.next(); 
          
          
          
          customer c;
           Iterator <customer> itrs = customers.iterator();    
     while (itrs.hasNext()) {
          c = itrs.next(); 
          if(or.getcust_ID().equals(c.getcust_ID()))
          {
              
              
          stock s;
           Iterator <stock> itrss = stocks.iterator();    
     while (itrss.hasNext()) {
          s = itrss.next(); 
          if(or.getstock_ID().equals(s.getstock_ID())){
              
          
          System.out.printf("\n%10s %10s %15s %10s %12s %15s %19s %15s %10s %17s",
                  or.getOrder_ID() ,or.getOrder_debit() ,or.getOrder_date() ,or.getOrder_paid() ,
                  or.getOrder_left(),c.getcust_ID(),c.getcustomer_name(),c.getcustomer_phone(),or.getstock_ID(),s.getitem_name());}
          }
      }
     }
      draw_line(150);
     } }
      
    
 //test order
public static void test_order() {
        try {
        System.out.printf("\n Tests for Class Order \n\n");
        System.out.printf("\n Add_order()\n\n");
        add_order("1152", "30", "12/01/2020", "20", "10","116229","114");
        add_order("1153", "20", "15/01/2020", "15", "5","186731","115");
        add_order("1154", "25", "16/01/2020", "15", "10","168337","116");
        add_order("1155", "35", "17/01/2020", "20", "15","189222","117");
        System.out.printf("\n List_order() \n\n");
        list_order();
        System.out.printf("\n Edit_order() \n\n");
        edit_order("1154", "40", "17/01/2020", "15", "25","168337","116");
        System.out.printf("\n List_order()\n\n");
        list_order();
        backup_order();
        
        System.out.printf("\n Delete_order()\n\n");
        delete_order("1155");
        
        System.out.printf("\n List_order()\n\n");
        list_order();
        
        retrieve_order();
        System.out.printf("\n List_order()\n\n");
        list_order();
        }
        catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error");
} 
}


//add delivery
 public static void add_delivery(String del_ID, String del_date , String del_time, String paid, String items,String pers_ID,String order_ID){
     delivery d = new delivery(del_ID,del_date,del_time,paid,items,pers_ID,order_ID);
      deliveries.add(d);
    } 


//edit 
     public static void edit_delivery(String del_ID, String del_date , String del_time, String paid, String items,String pers_ID,String order_ID){
     delivery d =null;
      Boolean found=false;
      Iterator <delivery> itr =  deliveries.iterator();
      while (itr.hasNext()) {
          d = itr.next(); 
          if(del_ID.equals(d.getDel_ID())) {
              found=true;
              break;
          }
      }
      if (found) {
          
          d.setDel_ID(del_ID);
          d.setDel_date(del_date);
          d.setDel_time(del_time);
          d.setDel_paid(paid);
          d.setDel_items(items);
          d.setpers_ID(pers_ID);
          d.setorder_ID(order_ID);
      }
}

      //delete del
     public static void delete_delivery(String del_ID) {
      delivery d=null ;
      Boolean found=false;
      Iterator <delivery> itr = deliveries.iterator();
      while (itr.hasNext()) {
          d = itr.next(); 
           if(del_ID.equals(d.getDel_ID())) {
              found=true;
              break;
          }
      }
      if (found) deliveries.remove(d);
      }

//retrieve delivery
        public static void retrieve_delivery() throws IOException, ClassNotFoundException
    {
     File infile  = new File("delivery.dat");
     FileInputStream infilestream = new FileInputStream(infile);
     ObjectInputStream inObjectStream = new ObjectInputStream(infilestream);
     deliveries = (ArrayList)inObjectStream.readObject();
     
     inObjectStream.close();
     
    }


  //backup delivery
       public static void backup_delivery() throws IOException
    {
     File outfile  = new File("delivery.dat");
     FileOutputStream outfilestream = new FileOutputStream(outfile);
     ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream);
     
     outObjectStream.writeObject(deliveries);
     outObjectStream.close();
    }
       
//list del
    public static void list_delivery() {
      delivery d;
     
      Iterator <delivery> itr = deliveries.iterator();
      System.out.printf("\n%15s %13s %22s %14s %16s %17s %16s %15s %13s",
              "Del.ID", 
              "Del_date","Del_time","Paid","Items","Pers.ID","Pers_name","Pers_Suname","Order.ID"); 
        draw_line(154);
    
      while (itr.hasNext()) {
          d = itr.next(); 

          deliveryPersonnel p;
           Iterator <deliveryPersonnel> itrs = deliveryPersonnels.iterator();    
     while (itrs.hasNext()) {
          p = itrs.next(); 
          if(d.getpers_ID().equals(p.getPers_ID())){
          
          
          order or;
           Iterator <order> itrss = orders.iterator();    
     while (itrss.hasNext()) {
          or = itrss.next(); 
          if(d.getorder_ID().equals(or.getOrder_ID())){
          
          
          System.out.printf("\n%15s %15s %20s %14s %18s %15s %15s %15s %12s ",
              d.getDel_ID(), d.getDel_date(), d.getDel_time(),d.getDel_paid(),d.getDel_items(),
              p.getPers_ID(),p.getPers_name(),p.getPers_surname(),or.getOrder_ID());
          }
      }
     } 
        } 
      draw_line(154);
     }
      
    }
          
    
//test del
     public static void test_delivery() {
        try {
        System.out.printf("\n Tests for Class delivery\n\n");
        System.out.printf("\n Add_delivery()\n\n");
        add_delivery("122","12/01/2020", "12:30", "10","bottleA","1140","1152");
        add_delivery("123","15/01/2020", "13:30", "5","bottleB","1141","1153");
        add_delivery("124", "16/01/2020", "15:00", "10","bottleC","1142","1154");
        add_delivery("125", "17/01/2020", "17:00", "15","bottleD","1143","1155");
        System.out.printf("\n List_delivery() \n\n");
        list_delivery();
        System.out.printf("\n Edit_delivery() \n\n");
        edit_delivery("124", "16/01/2020", "10:00", "25","bottleD","1142","1154");
        System.out.printf("\n List_delivery()\n\n");
        list_delivery();
        backup_delivery();
        
        System.out.printf("\n Delete_delivery()\n\n");
        delete_delivery("123");
        
        System.out.printf("\n List_delivery()\n\n");
        list_delivery();
        retrieve_delivery();
        System.out.printf("\nList_delivery()\n\n");
        list_delivery();
        }
        catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error");
} 
}

     
     
 //add Personnel 
public static void add_deliveryPersonnel(String pers_ID, String pers_name , String pers_surname, String pers_phone, String pers_gender){
     deliveryPersonnel p = new deliveryPersonnel(pers_ID,pers_name ,pers_surname,pers_phone,pers_gender);
      deliveryPersonnels.add(p);
    } 


//edit personnel
     public static void edit_deliveryPersonnel(String pers_ID, String pers_name , String pers_surname, String pers_phone, String pers_gender){
     deliveryPersonnel p= null;
      Boolean found=false;
      Iterator <deliveryPersonnel> itr =  deliveryPersonnels.iterator();
      while (itr.hasNext()) {
          p = itr.next(); 
          if(pers_ID.equals(p.getPers_ID())) {
              found=true;
              break;
          }
      }
      if (found) {
          
          p.setPers_ID(pers_ID);
          p.setPers_name(pers_name);
          p.setPers_surname(pers_surname);
          p.setPers_phone(pers_phone);
          p.setPers_gender(pers_gender);
      }
     }
     
     //delete personnel
     public static void delete_deliveryPersonnel(String pers_ID) {
      deliveryPersonnel p=null ;
      Boolean found=false;
      Iterator <deliveryPersonnel> itr = deliveryPersonnels.iterator();
      while (itr.hasNext()) {
          p = itr.next(); 
           if(pers_ID.equals(p.getPers_ID())) {
              found=true;
              break;
          }
      }
      if (found) deliveryPersonnels.remove(p);
      }
     
     
     //retrieve personnel
        public static void retrieve_deliveryPersonnel() throws IOException, ClassNotFoundException
    {
     File infile  = new File("deliveryPersonnel.dat");
     FileInputStream infilestream = new FileInputStream(infile);
     ObjectInputStream inObjectStream = new ObjectInputStream(infilestream);
     deliveryPersonnels = (ArrayList)inObjectStream.readObject();
     
     inObjectStream.close();
     
    }


  //backup personnel
       public static void backup_deliveryPersonnel() throws IOException
    {
     File outfile  = new File("deliveryPersonnel.dat");
     FileOutputStream outfilestream = new FileOutputStream(outfile);
     ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream);
     
     outObjectStream.writeObject(deliveryPersonnels);
     outObjectStream.close();
    }
       
       
       //list personnel
    public static void list_deliveryPersonnel() {
      deliveryPersonnel p;
     
      Iterator <deliveryPersonnel> itr = deliveryPersonnels.iterator();
      System.out.printf("\n%15s %13s %20s %20s %20s ",
              "Pers_ID", 
              "Pers_name","Pers_surname","Pers_phone","Pers_gender"); 
        draw_line(110);
    
      while (itr.hasNext()) {
          p = itr.next(); 
          System.out.printf("\n%15s %13s %20s %20s %20s ",p.getPers_ID(),p.getPers_name(),p.getPers_surname(),p.getPers_phone(),
                  p.getPers_gender());
      }
      draw_line(110);
    }
       //test personnel
     public static void test_deliveryPersonnel() {
        try {
        System.out.printf("\n Tests for Class deliveryPersonnel \n\n");
        System.out.printf("\n Add_deliveryPersonnel()\n\n");
        add_deliveryPersonnel("1140","Karim", "Moussa","5334861240","Male");
        add_deliveryPersonnel("1141","Ahmed", "Essa","5334965874" ,"Male");
        add_deliveryPersonnel("1142", "Sara", "Karam","5336982020","Female");
        add_deliveryPersonnel("1143", "Lara", "Skandar","5331471222","Female");
        System.out.printf("\n List_deliveryPersonnel() \n\n");
        list_deliveryPersonnel();
        System.out.printf("\n Edit_deliveryPersonnel() \n\n");
        edit_deliveryPersonnel("1142", "Sarah", "Issa","5336982020","Female");
        System.out.printf("\n List_deliveryPersonnel()\n\n");
        list_deliveryPersonnel();
        backup_deliveryPersonnel();
        
        System.out.printf("\n Delete_deliveryPersonnel()\n\n");
        delete_deliveryPersonnel("1141");
        
        System.out.printf("\n List_deliveryPersonnel()\n\n");
        list_deliveryPersonnel();
        retrieve_deliveryPersonnel();
        System.out.printf("\n List_deliveryPersonnel()\n\n");
        list_deliveryPersonnel();
        }
        catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error");
} 
}

     
 //add STOCK
public static void add_stock(String stock_ID, String item_name, String item_price, String amount_in_stock, String min_amount_level,String item_stockDate){
     stock s = new stock(stock_ID,item_name,item_price,amount_in_stock,min_amount_level,item_stockDate);
      stocks.add(s);
    } 


//edit STOCK
     public static void edit_stock(String stock_ID, String item_name, String item_price, String amount_in_stock, String min_amount_level,String item_stockDate){
     stock s=null;
      Boolean found=false;
      Iterator <stock> itr =  stocks.iterator();
      while (itr.hasNext()) {
          s = itr.next(); 
          if(stock_ID.equals(s.getstock_ID())) {
              found=true;
              break;
          }
      }
      if (found) {
          
          s.setstock_ID(stock_ID);
          s.setitem_name(item_name);
          s.setitem_price(item_price);
          s.setamount_in_stock(amount_in_stock);
          s.setmin_amount_level(min_amount_level);
          s.setitem_stockDate(item_stockDate);
      }
     }
     
     
      //delete stock
     public static void delete_stock(String stock_ID) {
      stock s=null ;
      Boolean found=false;
      Iterator <stock> itr = stocks.iterator();
      while (itr.hasNext()) {
          s = itr.next(); 
           if(stock_ID.equals(s.getstock_ID())) {
              found=true;
              break;
          }
      }
      if (found) stocks.remove(s);
      }

//retrieve stock
        public static void retrieve_stock() throws IOException, ClassNotFoundException
    {
     File infile  = new File("stock.dat");
     FileInputStream infilestream = new FileInputStream(infile);
     ObjectInputStream inObjectStream = new ObjectInputStream(infilestream);
     stocks = (ArrayList)inObjectStream.readObject();
     
     inObjectStream.close();
     
    }
     
     
     //backup stock
       public static void backup_stock() throws IOException
    {
     File outfile  = new File("stock.dat");
     FileOutputStream outfilestream = new FileOutputStream(outfile);
     ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream);
     
     outObjectStream.writeObject(stocks);
     outObjectStream.close();
    }
       
    
    //list stock
       public static void list_stock() {
      stock s ;
     
      Iterator <stock> itr = stocks.iterator();
      System.out.printf("\n%15s %15s %20s %20s %20s %17s ",
              "Stock_ID", 
              "Item_name","Item_price","Amount_in_stock","Min_amount_level","Item_stockDate"); 
        draw_line(115);
    
      while (itr.hasNext()) {
          s = itr.next(); 
          System.out.printf("\n%15s %15s %18s %15s %18s %24s",s.getstock_ID(),s.getitem_name(),s.getitem_price(),s.getamount_in_stock(),s.getmin_amount_level(),s.getitem_stockDate());
      }
      draw_line(115);
    }
    
       //test stock
    public static void test_stock() {
        try {
        System.out.printf("\n Tests for Class Stock \n\n");
        System.out.printf("\n Add_stock()\n\n");
        add_stock("114","bottleA", "30","25","10","01/01/2020");
        add_stock("115","bottleB", "20","25","10","01/01/2020");
        add_stock("116","bottleC", "25","50","10","01/01/2020");
        add_stock("117","bottleD", "35","50","10","01/01/2020");
        System.out.printf("\n List_stock() \n\n");
        list_stock();
        System.out.printf("\n Edit_stock()\n\n");
        edit_stock("115","bottleB", "20","25","10","02/01/2020");
        System.out.printf("\n List_stock()\n\n");
        list_stock();
        backup_stock();
        
        System.out.printf("\n Delete_stock()\n\n");
        delete_stock("114");
        
        System.out.printf("\n List_stock()\n\n");
        list_stock();
        retrieve_stock();
        System.out.printf("\n List_stock)\n\n");
        list_stock();
        }
        catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error");
} 
}
    
     
}
     

