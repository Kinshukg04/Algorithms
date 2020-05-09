package Lab9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	void test() {
		JUnitTesting j = new JUnitTesting();
		int result = j.addNumbers(3, 5);
		assertEquals(8,result);
		//assertEquals(10,result);
	}

}
