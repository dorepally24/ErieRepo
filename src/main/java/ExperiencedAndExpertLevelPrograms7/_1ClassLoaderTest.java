package ExperiencedAndExpertLevelPrograms7;

import java.lang.System.Logger;
import java.util.ArrayList;

import javax.management.loading.PrivateClassLoader;

public class _1ClassLoaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_1ClassLoaderTest obj = new _1ClassLoaderTest();
		//obj.printClassLoaders();
		
		System.out.println("This is First Person change");
		System.out.println("This is First Person change");
		System.out.println("This is First Person change");
		System.out.println("This is First Person change");
		System.out.println("This is First Person change");
		System.out.println("This is First Person change");

	}
	
	public void checkGitPushFunctionality()
	{
		System.out.println("This function is added by user One and it's need to pushed to repository");
	}
	
	public void classLoaderHierarchy() {
		System.out.println("When JVM requires any .class file while executing the program"
				+ "Jvm will serach .class in method area, if it is not there then , jvm requests /communicates with classLoaderSusystem and classLoaderLoader follows deligations "
				+ "algoritham");
		
		System.out.println("Class loader follows the below delages algarithem");
		
		System.out.println("step 1:class loder will request application class loader for .class file");
		
		System.out.println("Step 2: Applicatoin class loader will delagtes request to extension class loader"
				+ "");
		System.out.println("Step 3: Extension class loader will delegates request to boot strap class loader");
		
		if ("file exists in .classExsitsInBootStrap Class loader path: jdk jre lib *.jar then it will load the .class file and jvm use that".equals("exists"))
		{
		}
		else if("Boot Strap class loader delegates request back to Extension class loader and Extension class loader checks class"
				+ "in jdk jre lib ext *.jar if file exists jvm uses the class".equals("") != null)
		{
			
		} else if("Extension class loader delegates request to Application class loader and Applicaton class"
				+ "loader checks checks class in Environment variables java class path if files exists JVM will use else"
				+ "java will thorogh class not found exception".equals("") != null)
		{
			
		}
	}

}
