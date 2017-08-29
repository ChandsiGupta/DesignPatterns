class singleton
{ private static singleton instance;
private singleton()
{
}
public static singleton getInstance()
{
if(instance==null)
{
instance=new singleton();
}

return instance;
}
public void useitonce()
{
System.out.println("U cn use me only once");
}
public static void main(String[] s)
{
singleton st =new singleton();
st.useitonce();
}
}
