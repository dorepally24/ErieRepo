package testNgParllelTestORModuleExecution;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import org.testng.annotations.Test;

public class day4Test1Module {
	
	@Test
	public void HomeLoanWebLigin1() throws InterruptedException
	{
		Instant timestamp = Instant.now();
		//long startTime = System.nanoTime();
		LocalDateTime ldt = LocalDateTime.ofInstant(timestamp, ZoneId.systemDefault());
		System.out.printf("%s %d %d at %d:%d%n", ldt.getMonth(), ldt.getDayOfMonth(),
		                  ldt.getYear(), ldt.getHour(), ldt.getMinute());
		
		System.out.println("This related to <test>: TestOrModuleLevelTest1 --> day4Test1Module");
		Thread.sleep(61000);
		
		
		System.out.println();
		System.out.println("*********************");
		
		
	}
	
	@Test
	public void HomeLoanWebLigin2() throws InterruptedException
	{
		Instant timestamp = Instant.now();
		//long startTime = System.nanoTime();
		LocalDateTime ldt = LocalDateTime.ofInstant(timestamp, ZoneId.systemDefault());
		System.out.printf("%s %d %d at %d:%d%n", ldt.getMonth(), ldt.getDayOfMonth(),
		                  ldt.getYear(), ldt.getHour(), ldt.getMinute());
		
		System.out.println("\"This related to <test>: TestOrModuleLevelTest1 --> day4Test1Module");
		Thread.sleep(61000);
		
		
		System.out.println();
		System.out.println("*********************");
		
		
	}
	
	@Test
	public void HomeLoanWebLigin3() throws InterruptedException
	{
		Instant timestamp = Instant.now();
		//long startTime = System.nanoTime();
		LocalDateTime ldt = LocalDateTime.ofInstant(timestamp, ZoneId.systemDefault());
		System.out.printf("%s %d %d at %d:%d%n", ldt.getMonth(), ldt.getDayOfMonth(),
		                  ldt.getYear(), ldt.getHour(), ldt.getMinute());
		
		System.out.println("This related to <test>: TestOrModuleLevelTest1 -->day4Test1Module");
		Thread.sleep(61000);
		
		
		System.out.println();
		System.out.println("*********************");
		
		
	}
	
	@Test
	public void HomeLoanWebLigin4() throws InterruptedException
	{
		Instant timestamp = Instant.now();
		//long startTime = System.nanoTime();
		LocalDateTime ldt = LocalDateTime.ofInstant(timestamp, ZoneId.systemDefault());
		System.out.printf("%s %d %d at %d:%d%n", ldt.getMonth(), ldt.getDayOfMonth(),
		                  ldt.getYear(), ldt.getHour(), ldt.getMinute());
		
		System.out.println("This related to <test>: TestOrModuleLevelTest1 -->day4Test1Module");
		Thread.sleep(61000);
		
		
		System.out.println();
		System.out.println("*********************");
		
		
	}
	
}
