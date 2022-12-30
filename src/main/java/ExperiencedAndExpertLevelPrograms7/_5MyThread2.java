package ExperiencedAndExpertLevelPrograms7;

public class _5MyThread2 extends Thread{
	
public void run() 
{
	for(int i =0; i<=10; i++)
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("This is no argument run method, start method will only "
				+ "executes not argument run method");
	}
}

public void run(String message)
{
	System.out.println("This overloaded run method and it has string argument"
			+ "so it will not be executed by thread.start() method, to"
			+ "execute this method we have to call it expplicity with this class object"
			+ "or reference");
}
}
