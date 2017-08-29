			
 import java.util.*;
 interface Item {
	public String name();
	public float price();
	}
 class house
{
   private List<Item> items = new ArrayList<Item>();	

   public void addItem(Item item){
      items.add(item);
   }

public float getcost()
{
float cost =0.0f;
for(Item item :items)
{
cost+=item.price();
}
return cost;
}
public void showitems()
{for (Item item : items) {
         System.out.print("Item : " + item.name());
         System.out.println(", Price : " + item.price());
      }		
   }	
}
 class ownhouse implements Item {

   @Override
   public float price() {
      return 500000.0f;
   }

   @Override
   public String name() {
      return "ownhouse";
   }
}



 class renthouse implements Item {

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

   public house prepareownhouse (){
      house hb = new house();
      
      hb.addItem(new ownhouse ());
      return hb;
   }   

   public house preparerenthouse (){
      house hb = new house();
      hb.addItem(new renthouse());
      return hb;
   }
}


public class TestBuilderPattern
{
public static void main(String[] s)
{
Builder hob=new Builder();
  house rent = hob.preparerenthouse();
System.out.println("Rent House");
 rent.showitems();
     
  house own = hob.prepareownhouse();
      System.out.println("\n\nOwn house");
      own.showitems();
      
   }
}

