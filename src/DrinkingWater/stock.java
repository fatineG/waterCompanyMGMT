


package DrinkingWater;

/**
 *
 * @author Fatine
 */
import java.io.Serializable;

 public class stock implements Serializable{
  private  String stock_ID;
  private  String item_name;
  private  String item_price;
  private  String amount_in_stock;
  private  String min_amount_level;
  private  String item_stockDate;
    
  
    public stock(String stock_ID, String item_name, String item_price, String amount_in_stock, String min_amount_level,String item_stockDate) {
        this.stock_ID = stock_ID;
        this.item_name = item_name;
        this.item_price = item_price;
        this.amount_in_stock = amount_in_stock;
        this.min_amount_level = min_amount_level;
        this.item_stockDate =item_stockDate;
    }
    

   public String getstock_ID() {
        return stock_ID;
    }

    public void setstock_ID(String stock_ID) {
        this.stock_ID = stock_ID;
    }

    public String getitem_name() {
        return item_name;
    }

    public void setitem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getitem_price(){
         return item_price;
    }
    
    public void setitem_price(String item_price){
            this.item_price = item_price;
    }
    
    public String getamount_in_stock(){
    return amount_in_stock;
    }

    public void setamount_in_stock(String amount_in_stock) {
        this.amount_in_stock = amount_in_stock;
    }
    
    public String getmin_amount_level(){
  return min_amount_level;
    }
    
    public void setmin_amount_level(String min_amount_level){
    this.min_amount_level = min_amount_level;
    }
    
    public String getitem_stockDate(){
    return item_stockDate;
    }

    public void setitem_stockDate(String item_stockDate){
    this.item_stockDate= item_stockDate;
    }



 }