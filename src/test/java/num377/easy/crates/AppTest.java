
package num377.easy.crates;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Test Driven Development: attempt 1
 */
public class AppTest extends TestCase {
    
	private String[] testArgs = {"25", "18", "6", "5"};
	private int bigX = App.setWidth(Integer.parseInt(testArgs[0]), Integer.parseInt(testArgs[1]));
	private int bigY = App.setLength(Integer.parseInt(testArgs[0]), Integer.parseInt(testArgs[1]));
	private int smX = App.setWidth(Integer.parseInt(testArgs[2]), Integer.parseInt(testArgs[3]));
	private int smY = App.setLength(Integer.parseInt(testArgs[2]), Integer.parseInt(testArgs[3]));
	
	// There can only be 4 arguments
	public void testOnlyFourArguments() {
		
		Assert.assertTrue(App.argNumber(testArgs));
	}
	
	// widths must be shorter than lengths
	public void testDimensionsSetCorrectly() {
		
		Assert.assertEquals(18, bigX);
		Assert.assertEquals(25, bigY);
		Assert.assertEquals(5, smX);
		Assert.assertEquals(6, smY);
	}
		
	// Large crate must be bigger than small crate
	public void testLgCrateBiggerThanSmCrate() {
		
		Assert.assertTrue(App.lgCrateDimensionsBigger(bigX, smX, bigY, smY));
	}
	
	//Length and width of large crate must be evenly divided by small crate dimensions
	public void testEvenDivisionOfDimensions() {
		
		int widthDivision = App.dividDimensions(bigX, smX);
		int lengthDivision = App.dividDimensions(bigY, smY);
		Assert.assertEquals(3, widthDivision);
		Assert.assertEquals(4, lengthDivision);
	}
	
	// determine if remainder can fit crate.
	public void testModuloDivisionForAdditionalCrates() {
		
	}
}
