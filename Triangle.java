package QSVU_UEbung3_1127230_Shatkin_Daniel;

public class Triangle {
	
	public Triangle(){}
	
	public double calculateHypotenuse(double a, double b){
		
		if(checkValueIsZeroOrBeyond(a) || checkValueIsZeroOrBeyond(b)){
			throw new IllegalArgumentException();
		}
		
		//² = a² + b²
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
		return c;
	}
	
	public double calculateAngle(double angleGiven){
		
		if(checkValueIsZeroOrBeyond(angleGiven)){
			throw new IllegalArgumentException();
		}
		
		return 90 - angleGiven;
		
	}
	
	public double calculateSurface(double a, double b){
		
		if(checkValueIsZeroOrBeyond(a) || checkValueIsZeroOrBeyond(b)){
			throw new IllegalArgumentException();
		}
		return (a * b)/2;
		
	}
	
	private boolean checkValueIsZeroOrBeyond(double x){
		
		if(x > 0){ 
			return false;}
		return true;
		
	}
	
}
