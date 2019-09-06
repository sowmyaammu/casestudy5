package cucumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class calc {
	ca c;

	@BeforeEach
	void setUp() throws Exception {
		c=new ca();
}

	@AfterEach
	void tearDown() throws Exception {
		return;
	}

	@Test()
	void test() {
		assertEquals(20,c.add(18,2));
        
	}
	@Test
	void test1() {
		assertEquals(10,c.mul(2,3));
	}

}
