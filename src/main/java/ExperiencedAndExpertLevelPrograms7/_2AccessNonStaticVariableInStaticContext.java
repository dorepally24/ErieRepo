package ExperiencedAndExpertLevelPrograms7;

public class _2AccessNonStaticVariableInStaticContext {
	
	int nonStaticVariable = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//nonStaticVariable =20;
		System.out.println("Cannot make a static reference to the non-static field nonStaticVariable"
				+ "Exception in thread \"main\" java.lang.Error: Unresolved compilation problem: \r\n"
				+ "	Cannot make a static reference to the non-static field nonStaticVariable");

	}

}
