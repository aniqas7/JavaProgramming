package ConstructorPractice;

public class item {
   public String name;
   public int unitPrice, quantity;

   public item(String name, int unitPrice, int quantity) {
      this.name = name;
      this.unitPrice = unitPrice;
      this.quantity = quantity;
   }

   public int calcCost(){
      System.out.println("total price of item: "+ (unitPrice*quantity));
      return calcCost();
   }

   public String toString() {
      return "item{" +
              "name='" + name + '\'' +
              ", unitPrice=" + unitPrice +
              ", quantity=" + quantity +
              ", total cost=$"+ calcCost()+
              '}';
   }
}
