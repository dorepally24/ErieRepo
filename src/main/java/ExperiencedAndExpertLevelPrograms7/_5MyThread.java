package ExperiencedAndExpertLevelPrograms7;

public class _5MyThread extends Thread {

	public void run()
	{
		//The code which is written under run we call it has a job
		
		for(int i = 0; i<=10; i++)
		{
			try {
				Thread.sleep(1000);
				System.out.println("Child thread of MyThread is running and printing Maraks"+i);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
