/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1213lab2a;

import java.util.ArrayList;

/**
 *
 * @author abrea
 */
public class FastFoodKitchen {
    private ArrayList<BurgerOrder> orderList = new ArrayList<>();
    
   private static int nextOrderNum;
   
   
   
   public FastFoodKitchen() {
     BurgerOrder order1 = new BurgerOrder(3, 5, 4, 10, false, getNextOrderNum());
     incrementNextOrderNum();
     orderList.add(order1);
     
     BurgerOrder order2 = new BurgerOrder(0, 0, 3, 3, true, getNextOrderNum());
     
     incrementNextOrderNum();
     orderList.add(order2);
     
     BurgerOrder order3 = new BurgerOrder(1, 1, 0, 2, false, getNextOrderNum());
     
     incrementNextOrderNum();
     orderList.add(order3);
   }
   /** @return nextOrderNum */
   public int getNextOrderNum(){
       return nextOrderNum;
   }
       
   private static void incrementNextOrderNum() {
       nextOrderNum++;
   }
   
   /** @return nextOrderNum */
   /** @param ham */
   /** @param cheese */
   /** @param veggie */
   /** @param soda */
   /** @param toGo */
   public int addOrder(int ham, int cheese, int veggie, int soda, boolean toGo) {
       BurgerOrder newOrder = new BurgerOrder(ham, cheese, veggie, soda, toGo, getNextOrderNum());
       orderList.add(newOrder);
       incrementNextOrderNum();
       return nextOrderNum;
   }
   
   /** @return true if there is at least 1 order */
   public boolean cancelLastOrder(){
       if (!orderList.isEmpty()) {
           orderList.remove(orderList.size()-1);
           nextOrderNum--;
           return true;
       }
       /** @return false if there are no order numbers */
       if (orderList.size() <= 0){
           
       }
       return false;
   }
   /** @return orderList */
   public int getNumOrdersPending(){
       return orderList.size();
   }
    @Override
    public String toString() {
        return "FastFoodKitchen{" + "orderList=" + orderList + "}";
    }
    
    public boolean isOrderDone(int orderID) {
        for (BurgerOrder value : orderList) {
            
            if (value.equals(orderID)){
                return false;
            }
            else {
                
            }
        }
        return true;
    }
    
    public boolean cancelOrder(int orderID){
        for (BurgerOrder value : orderList) {
            
            if (value.equals(orderID)){
                orderList.remove(value);
                return true;
            }
            else {
                return false;
            
            
                    }
        }
        return false;
    }
    
    
}
