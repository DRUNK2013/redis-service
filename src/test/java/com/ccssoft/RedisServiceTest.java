package com.ccssoft;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class RedisServiceTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public RedisServiceTest(String testName) {
		super(testName);
		System.out.println("OK");
		RedisService redisService = new RedisService();
		//redisService.set("zsf3", "fucking");

		System.out
				.println("\n\n\n********************测试输出信息***************************\n\n\n");
		System.out.println(redisService.get("zsf3"));
		System.out
				.println("\n\n\n************************END*******************************\n\n\n");
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(RedisServiceTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		assertTrue(true);
	}
}
