import java.util.*;
 interface Item {
	public String name();
	public float price();
	}
 class House
{
   private List<Item> items = new ArrayList<Item>();	

   public void addItem(Item item){
      items.add(item);
   }

public float getCost()
{
float cost =0.0f;
for(Item item :items)
{
cost+=item.price();
}
return cost;
}
public void showItems()
{for (Item item : items) {
         System.out.print("Item : " + item.name());
         System.out.println(", Price : " + item.price());
      }		
   }	
}
 class OwnHouse implements Item {

   @Override
   public float price() {
      return 500000.0f;
   }

   @Override
   public String name() {
      return "ownhouse";
   }
}



 class RentHouse implements Item {

   @Override
   public float price() {
      return 5000.0f;
   }

   @Override
   public String name() {
      return "Rent house";
   }
}
 class Builder {

   public House prepareOwnHouse (){
      House hb = new House();
      
      hb.addItem(new OwnHouse ());
      return hb;
   }   

   public House prepareRentHouse (){
      House hb = new House();
      hb.addItem(new RentHouse());
      return hb;
   }
}


public class TestBuilderPattern
{
public static void main(String[] s)
{
Builder hob=new Builder();
  House rent = hob.prepareRentHouse();
System.out.println("Rent House");
 rent.showItems();
     
  House own = hob.prepareOwnHouse();
      System.out.println("\n\nOwn house");
      own.showItems();
      
   }
}

