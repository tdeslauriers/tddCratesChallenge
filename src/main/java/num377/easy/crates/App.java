package num377.easy.crates;

/**
 *
 */

public class App {
	
    public static void main( String[] args ) {
    	
    	if(!argNumber(args)) {
    		
    		System.out.println("Incorrect number of arguments.");
    	}
    	
    	int lgWidth = setWidth(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
    	int lgLength = setLength(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
    	int smWidth = setWidth(Integer.parseInt(args[2]), Integer.parseInt(args[3]));
    	int smLength = setLength(Integer.parseInt(args[2]), Integer.parseInt(args[3]));
    	
    	if(!lgCrateDimensionsBigger(lgWidth, smWidth, lgLength, smLength)) {
    		
    		System.out.println("Second crate connot fit in first crate.");
    	}
    	
    	Integer smCrateCount = countCrates(dividDimensions(lgWidth, smWidth), 
    										dividDimensions(lgLength, smLength));
    	
    	System.out.println(smCrateCount + " small crates will fit in the larger crate.");
    }
    
    public static boolean argNumber(String[] args) {
    	
    	if (args.length == 4) {
    		
    		return true;
    	} 
    	
    	return false;
    }
    
    public static  Integer setWidth(int a, int b) {
    	
    	if(a <= b) {
    		
    		return a;
    	}
    	
    	return b;
    }
    
    public static Integer setLength(int a, int b) {
    	
    	if(a >= b) {
    		
    		return a;
    	}
    	
    	return b;
    }

	public static boolean lgCrateDimensionsBigger(int lgX, int lilX, int lgY, int lilY) {
		
		if(lgX >= lilX && lgY >= lilY) {
			
			return true;
		}
		
		return false;
	}

	public static Integer dividDimensions(int bg, int sm) {
		
		return bg / sm;
	}
	
	public static Integer countCrates(int wDivision, int lenDivision) {
		
		return wDivision * lenDivision;
	}
	
	public static Integer calculateRemainder(int bg, int sm) {
		
		return bg % sm;
	}

}
