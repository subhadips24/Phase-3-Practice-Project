import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AgeValidateTest {
	@Test
	public  void test1() {
		AgeValidation avd=new AgeValidation();
		
		
		assertEquals("You can Vote",avd.ageValidate(20));
	}
	
	@Test
	public void test2() {
		AgeValidation avd=new AgeValidation();
		assertEquals("You can't vote",avd.ageValidate(9));
	}


}
