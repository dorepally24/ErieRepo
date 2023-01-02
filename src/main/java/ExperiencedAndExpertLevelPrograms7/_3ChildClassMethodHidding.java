package ExperiencedAndExpertLevelPrograms7;

public class _3ChildClassMethodHidding extends _3ParentClassMethodHidding {
	
	public static void staticOverrindMeansMethodHidding()
	{
		System.out.println("child mehod is called: staticOverrindMeansMethodHidding");
		System.out.println("Architect Change 1");
		System.out.println("Architect Change 2");
		System.out.println("Architect Change 2");
	}
	
	public static void main(String[] args) {
		//in below we used constrocter of child and refered parent, as 
		//method hidding is refference based so parent method will be called unlike override concept.
		
		_3ParentClassMethodHidding parentObject = new _3ChildClassMethodHidding();
		parentObject.staticOverrindMeansMethodHidding();
		
		
		
	}

}
