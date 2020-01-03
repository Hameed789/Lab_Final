package calculator;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.AfterClass;

public class TestCalculator {
	private static Calculator calculator;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Start");
		calculator = new Calculator();
	}
	@Test  
	public void testFindMax(){  
		assertEquals(13,calculator.findMax(11,10,13));  
	} 
	@Test  
	public void testSquare1(){  
		assertEquals(16,calculator.square(4));  
	}
	@Test (expected = IllegalArgumentException.class) 
	public void testSquare2(){  
		calculator.square(-1);  
	}
	@Test  
	public void testCube(){  
		assertEquals(27,calculator.cube(3));  
	}
	@AfterClass  
    public static void tearDownAfterClass() throws Exception {  
        System.out.println("Exit");  
    }  
}
