package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CalculatorPage;

public class CalculatorTest {
	
	CalculatorPage calPage;
	
	
	@BeforeTest
	public void setUp() {
		
		calPage = new CalculatorPage();
		
	}
	
	
	
	@Test(priority=1)
	public void sumTest() {
		String res = calPage.doSum("10", "20");
		Assert.assertEquals(res, "30");
	}
	
	
	@Test(priority=2)
	public void subTest() {
		String res = calPage.doSub("100", "80");
		Assert.assertEquals(res, "20");
	}
	
	
	@Test(priority=3)
	public void DivTest() {
		String res = calPage.doDiv("20", "2");
		Assert.assertEquals(res, "10");
	}

}
