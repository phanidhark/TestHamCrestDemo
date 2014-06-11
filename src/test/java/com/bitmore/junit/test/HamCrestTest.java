package com.bitmore.junit.test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import com.bitmore.junit.Person;

import junit.framework.TestCase;

public class HamCrestTest extends TestCase{
	
	public void testM1(){
		/*Person one = new Person(20,"ramu","Ind");
		Person two = new Person(20,"ramu","Ind");
		*/Person one = new Person("Phani");
		Person two = new Person("Phani");
		assertThat(one, equalTo(two));		

	}
	
	public void testM2(){
		Person one = new Person("ramu");
		assertThat("person age", one.getAge(), equalTo(30));

	}
}
