package com.bitmore.junit.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.bitmore.junit.IPersonService;
import com.bitmore.junit.Person;

public class PersonMickitoTest {

	IPersonService personService;
	Person person;

	@Before
	public void AfterExec() {
		System.out.println("AfterExec");
		personService = mock(IPersonService.class);
		when(personService.findPersonInArea("07054")).thenReturn(100);
		
		person = mock(Person.class);
		when(person.getName()).thenReturn("Mock Man");		
	}
	
	@After
	public void BeforeExec(){
		System.out.println("BeforeExec");
		
	}

	@Test
	public void testAddPerson() {
		assertEquals(100, personService.findPersonInArea("07054"));
	}
	
	@Test(expected=Exception.class)
	public void testInvalidZip1(){
		personService.findPersonInArea("NJ");
		when(personService.findPersonInArea("NJ")).thenThrow(new Exception("Invalid ZipCode Exeception"));
	}
	
	@Test(expected=Exception.class)
	public void testInvalidZip2(){
		doThrow(new Exception("Invalid ZipCode Exeception")).when(personService.findPersonInArea("NY"));	
	}
	
	@Test
	public void testPerson() {
		assertNotNull(person);
		assertEquals("Mock Man", person.getName());		
		
		
	}
	
	
}
