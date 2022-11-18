package JUnitTest;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;


class TestAddStrings {

	@Test
	public void test() {
		JUnitTesting junit = new JUnitTesting();
		String result = junit.Addstrings("Hello", " World");
		assertEquals("Hello World",result);
	}

}