package ExperiencedAndExpertLevelPrograms7;

public class _3PrivateMethodOverridingChildNotPossible extends _3PrivateMethodOverridingParentNotPossible{
	
	private void privateMethodOfParnet()
	{
		System.out.println("Parent Mehod call: privateMethodOfParnet");
	}
	
	public static void main(String[] args) {
		
		_3PrivateMethodOverridingParentNotPossible reference = new _3PrivateMethodOverridingChildNotPossible();
		//reference.privateMethodOfParnet();
	}

}
