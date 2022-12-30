package ExperiencedAndExpertLevelPrograms7;

public class _5ThreadDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		_5MyThread obj = new _5MyThread();
		obj.start();	
		
		_5MyThread2 obj_5MyThread2 = new _5MyThread2();
		obj_5MyThread2.start();
		
		
		for(int i =0; i<=10; i++)
		{
			Thread.sleep(1000);
			System.out.println("Main method is running now and Pinting Grade as"+i);
		}
		
		
		//creating a threadh using runnable interface.
		_5CreateThreadByImplementingRunnableInterface objThread = new _5CreateThreadByImplementingRunnableInterface();
		
		Thread t1 = new Thread(objThread);
		
		t1.start();
		
	}

}
