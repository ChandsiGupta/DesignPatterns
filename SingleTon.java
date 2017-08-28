 
public class SingleTon {
     
    private static SingleTon Obj;
   
    private SingleTon(){
         
    }
   
    public static SingleTon getInstance(){
        if(Obj == null){
            Obj = new SingleTon();
        }
        return Obj;
    }
     
    public void Print(){
        // do something here
        System.out.println("Someting Happens....");
    }
     
    public static void main(String a[]){
        SingleTon st = SingleTon.getInstance();
        st.Print();
    }
}
