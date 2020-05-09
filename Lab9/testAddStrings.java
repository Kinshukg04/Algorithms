package Lab9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		JUnitTesting j = new JUnitTesting();
		String result = j.addStrings("capstone","project");
		assertEquals("capstoneproject",result);
//		String result2 = JUnitTesting.addStrings("capstone","project");
//		assertEquals("capst",result2);
	}

}
