package JUnitTest;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;


class TestAddNumbers {

	@Test
	public void test() {
		JUnitTesting junit = new JUnitTesting();
		int result = junit.AddNumbers(100, 200);
		assertEquals(300,result);
	}

}

