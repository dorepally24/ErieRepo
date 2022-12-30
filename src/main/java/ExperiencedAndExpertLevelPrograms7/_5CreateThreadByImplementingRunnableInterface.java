package ExperiencedAndExpertLevelPrograms7;

public class _5CreateThreadByImplementingRunnableInterface extends ParentClass implements Runnable{

	@Override
	public void run() {
		// It is abstract run method of runnable Interface
		
		for(int i =0; i<=10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The best way to create a thread is by implementing"
					+ "runnable Interface because, we hace scope to inherit parent"
					+ "class like above.");		
		}
		
	}

}
