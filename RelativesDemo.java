 import java.util.*;
class Children
{
private List<Relative> relatives =new ArrayList<Relative>();
private int activity;
public int getActivity()
{
return activity;
}
public void setActivity(int activity)
{
this.activity=activity;
notifyAllObservers();
}
public void attach(Relative relative)
{
relatives.add(relative);
}
public void notifyAllObservers(){
      for (Relative relative : relatives) {
         relative.update();
      }
   } 	
}

abstract class Relative
{
protected Children children;
public abstract void update();
}
 class Parents extends Relative
{
public Parents (Children children)
{
this.children=children;
this.children.attach(this);
}
public void update()
{
 System.out.println( "Parents Observe your number of activities" +children.getActivity()); 
   }
}
 class GrandParents extends Relative
{
public GrandParents (Children children)
{
this.children=children;
this.children.attach(this);
}
public void update()
{
 System.out.println( "GrandParents also Observe your number of activities" + children.getActivity() ); 
   }
}

public class RelativesDemo
{
public static void main(String[] s)
{
Children children=new Children();
new Parents(children);
new GrandParents(children);
 System.out.println("Number of Activities:15");	
      children.setActivity(15);
 System.out.println("Second state change: 10");	
      children.setActivity(10);
   }
}
