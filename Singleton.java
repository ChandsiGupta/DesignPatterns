class Singleton
{ private static Singleton instance;
private Singleton()
{
}
public static Singleton getInstance()
{
if(instance==null)
{
instance=new Singleton();
}

return instance;
}
public void useItOnce()
{
System.out.println("U can use me only once");
}
public static void main(String[] s)
{
Singleton st =new Singleton();
st.useItOnce();
}
}
