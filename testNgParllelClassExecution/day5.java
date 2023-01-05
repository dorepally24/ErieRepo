package testNgParllelClassExecution;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import org.testng.annotations.Test;

public class day5 {
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	LocalDateTime now = LocalDateTime.now();
	
	@Test
	public void HomeLoanWebLigin() throws InterruptedException
	{
		Instant timestamp = Instant.now();
		//long startTime = System.nanoTime();
		LocalDateTime ldt = LocalDateTime.ofInstant(timestamp, ZoneId.systemDefault());
		System.out.printf("%s %d %d at %d:%d%n", ldt.getMonth(), ldt.getDayOfMonth(),
		                  ldt.getYear(), ldt.getHour(), ldt.getMinute());
		
		System.out.println("day 5 class level execution started");
		Thread.sleep(61000);
		
		System.out.println();
		System.out.println();
		System.out.println("*********************");
	}
	
}
