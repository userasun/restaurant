package pkg1213lab2a;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author abrea
 */
public class BurgerOrder {
    
    private int numHamburgers = 0;
    private int numCheeseburgers = 0;
    private int numVeggieburgers = 0;
    private int numSodas = 0;
    private boolean orderToGo = false;
    private int orderNum = 4;
    
    
    
    public BurgerOrder(int numHamburgers, int numCheeseburgers, int numVeggieburgers, int numSodas, boolean orderToGo, int orderNum) {
    this.numHamburgers = numHamburgers;
    this.numCheeseburgers = numCheeseburgers;
    this.numVeggieburgers = numVeggieburgers;
    this.numSodas = numSodas;
    this.orderToGo = orderToGo;
    this.orderNum = orderNum;
    }

    
    
    public int getNumHamburgers(){
        return numHamburgers;
    }
    
    public void setNumHamburgers(int numHamburgers){
       this.numHamburgers = numHamburgers; 
       
       if (numHamburgers < 0){
           System.out.println("Error: invalid number. Please enter a positive number.");
       }
       else if (numHamburgers > 0){
        this.numHamburgers = numHamburgers;
        }
    }
    
    
    public int getNumCheesemburgers(){
        return numCheeseburgers;
    }
    
    public void setNumCheeseburgers(int numCheeseburgers){
       this.numCheeseburgers = numCheeseburgers; 
    
}
    
    
    public int getNumVeggieburgers(){
        return numVeggieburgers;
    }
    
    public void setNumVeggieburgers(int numVeggieburgers){
       this.numVeggieburgers = numVeggieburgers; 
    }
    
    
    public int getNumSodas(){
        return numSodas;
    }
    
    public void setNumSodas(int numSodas){
       this.numSodas = numSodas; 
    }
    
    

    public boolean isOrderToGo(){
        return orderToGo;
    }
    
    public void setOrderToGo(boolean orderToGo){
        this.orderToGo = orderToGo;
    }


 
    
    public int getOrderNum(){
        return orderNum;
    }
    
    public void setOrderNum(int orderNum){
       this.orderNum = orderNum; 
    }
    
    @Override
    public String toString() {
    return "BurgerOrder {" + "numHamburgers = " + numHamburgers + ", numCheeseburgers = " + numCheeseburgers + ", numVeggieburgers = " + numVeggieburgers + ", numSodas = " + numSodas + ", orderToGo = " + orderToGo + ", orderNum = " + orderNum + '}';
}

    
}
