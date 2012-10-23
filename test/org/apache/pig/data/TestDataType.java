package org.apache.pig.data;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDataType {
	
	// test o1 is null
	@Test
	public void testCompareNull(){
		byte dt1 = 1;
		byte dt2 = 1;
		Object o1 = null;
		Object o2 = new Object();
		assertTrue(DataType.compare(o1, o2, dt1, dt2) < 0);
	}
	
	// test o2 is null
	@Test
	public void testCompareNull1(){
		byte dt1 = 1;
		byte dt2 = 1;
		Object o1 = new Object();
		Object o2 = null;
		assertTrue(DataType.compare(o1, o2, dt1, dt2) > 0);
	}
	
	// test both o1 and o2 are null
	@Test
	public void testCompareNull2(){
		byte dt1 = 1;
		byte dt2 = 1;
		Object o1 = null;
		Object o2 = null;
		assertEquals(1, DataType.compare(o1, o2, dt1, dt2));
	}
}
