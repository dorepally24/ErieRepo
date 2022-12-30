package ExperiencedAndExpertLevelPrograms7;

public class StaticVariableAnalysisChild extends StaticVariableAnalysisParnet{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Default value of parnet class static variable: "+ StaticVariableAnalysisParnet.staticVariable);
		
		
		StaticVariableAnalysisParnet obj1 = new StaticVariableAnalysisChild();		
		System.out.println("Assigned new value 200 to static variable of parent class with object1");
		obj1.staticVariable = 200;
		System.out.println("Printing static varible after updting with object1");
		obj1.printStaticVarible();
		
		
		StaticVariableAnalysisParnet obj2 = new StaticVariableAnalysisChild();
		System.out.println("calling and printing static varible with obj2, as it is static we should get "
				+ "same copy that obj1 got , the dfault value of static is updated by obj1 with 200 so it is fixed to 200 now"
				+ " ,so for all next objects the value should be 200, until it is updated to other value using other objects");
		obj2.printStaticVarible();
		
		System.out.println();
		System.out.println();
		System.out.println("####################### Doing same process on instatnce variable of parent class #################");
		System.out.println();
		
		
		System.out.println("Default value of instance variable of parent class, calling instance varible using object 1: ");
		
		obj1.printInstanceVariable();
		
		System.out.println("updating new value of instance varible using obj1");
		obj1.instanceVariable=3000;
		
		System.out.println("lets print instance varible after updating to 3000, as we are calling using "
				+ "obj1 so we should get obj1 copy i.e. 3000");
		obj1.printInstanceVariable();
		
		
		System.out.println("lets call instance varible using object2, as objet2 is different memory , "
				+ "we should get default value of intance variable i.e. 10 not 3000 of obj1's momory value");
		obj2.printInstanceVariable();
		
		
		
		System.out.println("as obj2 is different copy / differnet memory so now lets have different value for instance varible fo obj2"
				+ "update instance variable copy with 5000");
		obj2.instanceVariable = 5000;
		
	    System.out.println("now lets print object 2 copy / memory value we should get 5000");
	    obj2.printInstanceVariable();
	    
	    System.out.println("let's print obj1 copy i.e. we should get 3000");
		obj1.printInstanceVariable();		
	}

}
