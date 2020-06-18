package testNg;

import org.testng.annotations.Test;

public class ThreadCountExamples {

	@Test
	public void test1() {
		System.out.println("method 1 is" + Thread.currentThread().getId());

	}

	@Test
	public void test2() {

		System.out.println("method 2 is" + Thread.currentThread().getId());
	}

	@Test
	public void test3() {
		System.out.println("method 3 is" + Thread.currentThread().getId());

	}

	@Test
	public void test4() {
		System.out.println("method 4 is" + Thread.currentThread().getId());
	}

	@Test
	public void test5() {
		System.out.println("method 5 is" + Thread.currentThread().getId());
	}
	
	@Test
	public void test6() {
		System.out.println("method 6 is" + Thread.currentThread().getId());
	}

}
