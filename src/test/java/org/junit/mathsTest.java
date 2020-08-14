package org.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class mathsTest {
 maths math;
 int count=0;
 @BeforeAll
  void beforeall()
 {
	 System.out.println("this is be executed before all");
 }
	@Test
	@BeforeEach
	void init()
	{
		math=new maths();
		//count++;
	}
	@Test
	void test() {
		System.out.println("nice");
		count++;
	}
	@Test
	@DisplayName("this is use for addition")
	void add()
	{
		int sum1=math.sum(2, 2);
		assertEquals(4,sum1);
		count++;
	}
	@Test
	@Disabled
	@DisplayName("this is run after all method")
	void afterall()
	{
		fail("fail due to after all");
	}

}
