package com.jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tc1Test
{
	@Test
	public void m1()
	{
		Reporter.log("m1 passed",true);
		Reporter.log("m10 passed",true);
		Reporter.log("m100 passed",true);
	}

}
