package QSVU_UEbung3_1127230_Shatkin_Daniel;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;


public class TriangleTest {
	
	Triangle triangle;
	
	
	@Before
	public void set_up(){
		triangle = new Triangle();
	}

	@Test
	public void calculatesHypotenuse_shouldReturnHypotenuse(){
		double a = 3;
		double b = 4;
		if(triangle.calculateHypotenuse(a, b) != 5){ fail();}
	}
	@Test(expected = IllegalArgumentException.class)
	public void calculatesHypotenuseWithNegativeValues_shouldThrowException(){
		double a = -3;
		double b = -4;
		
		triangle.calculateHypotenuse(a, b);
	}
	@Test(expected = IllegalArgumentException.class)
	public void calculatesHypotenuseWithAZeroValue_shouldThrowException(){
		double a = 0;
		double b = -4;
		
		triangle.calculateHypotenuse(a, b);
	}

}
