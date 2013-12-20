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
	@Test
	public void calculatesAngle_shouldReturnMissingAngle(){
		double givenAngle = 30;
		if(triangle.calculateAngle(givenAngle) != 60){fail();}
	}
	@Test(expected = IllegalArgumentException.class)
	public void calculatesAngleWithNegativeValues_shouldThrowException(){
		double givenAngle = 30;
		triangle.calculateAngle(givenAngle);
	}
	@Test(expected = IllegalArgumentException.class)
	public void calculatesAngleWithAZeroAngle_shouldThrowException(){
		double givenAngle = 0;
		triangle.calculateAngle(givenAngle);
	}
	
	@Test
	public void calculatesSurface_shouldReturnSurface(){
		double a = 3;
		double b = 4;
		
		if(triangle.calculateSurface(a, b) != 6){ fail();}
	}
	@Test(expected = IllegalArgumentException.class)
	public void calculatesSurfaceWithNegativeValues_shouldThrowException(){
		double a = -3;
		double b = -4;
		
		triangle.calculateSurface(a, b);
		
	}
	@Test(expected = IllegalArgumentException.class)
	public void calculatesSurfaceWithAZeroValue_shouldThrowException(){
		double a = 0;
		double b = -4;
		
		triangle.calculateSurface(a, b);
	}

}
