package com.EmployeeManagementapplication;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;

import org.junit.Test;

class EmployeeTest {
	Employee emp = new Employee(123,"Harish",112000,"har12","harish123","KA","Mangolore",123423);
	
	
	@Test
	void testGetId() {
		int expected = 123;
		
		int actual = emp.getId();
		assertEquals(expected,actual);
	}

	@Test
	void testGetName() {
		String expected = "Harish";
		String actual = emp.getName();
		assertEquals(expected,actual);
	}

	@Test
	void testGetSalary() {
		int expected = 123123;
		int actual = emp.getSalary();
		assertEquals(expected,actual);
	}

	@Test
	void testGetUsername() {
		String expected = "Har123";
		String actual = emp.getUsername();
		assertEquals(expected,actual);
	}

	@Test
	void testGetPassword() {
		String expected = "Harish123";
		String actual = emp.getPassword();
		assertEquals(expected,actual);
	}

	@Test
	void testGetState() {
		String expected = "KA";
		String actual = emp.getState();
		assertEquals(expected,actual);
	}

	@Test
	void testGetCity() {
		String expected = "mangalore";
		String actual = emp.getCity();
		assertEquals(expected,actual);
	}

	@Test
	void testGetPincode() {
		double expected = 123123;
		double actual = emp.getPincode();
		assertTrue(expected,actual,0.0001);
	}

	private void assertTrue(double expected, double actual, double d) {
		// TODO Auto-generated method stub
		
	}

}
