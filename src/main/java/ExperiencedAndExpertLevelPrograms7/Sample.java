package ExperiencedAndExpertLevelPrograms7;

public class Sample extends Demo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo DemoObject = new Demo();
		
		DemoObject.demoStaticMethod();
		DemoObject.demoInstanceMethod();
		
		Demo referanceDemo= new Sample();
		
		System.out.println();
		System.out.println();
				
		referanceDemo.demoStaticMethod();
		referanceDemo.demoInstanceMethod();
		

	}
	
	public static void demoStaticMethod()
	{
		System.out.println("demoStaticMethod overriden in sample");
	}
	
	public void demoInstanceMethod()
	{
		System.out.println("demoInstanceMethod overriden in sample");
	}

}
