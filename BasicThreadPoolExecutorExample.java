import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
class Purpose implements Runnable 
{
    private String name;
 
    public Purpose(String name) 
    {
        this.name = name;
    }
     
    public String getName() {
        return name;
    }
 
    @Override
    public void run() 
    {
        try
        {
            Long duration = (long) (Math.random() * 10);
            System.out.println("Doing a task during : " + name);
            TimeUnit.SECONDS.sleep(duration);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
}
 
public class BasicThreadPoolExecutorExample 
{
    public static void main(String[] args) 
    {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        for (int i = 0; i <= 5; i++) 
        {
            Purpose purpose = new Purpose("Task " + i);
            System.out.println("A new task has been added : " + purpose.getName());
            executor.execute(purpose);
        }
        executor.shutdown();
    }
}
