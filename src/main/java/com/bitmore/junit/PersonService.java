package com.bitmore.junit;

public class PersonService {
	IPersonService service;
	public int findPersonInArea(String zipcode){
		return service.findPersonInArea(zipcode);
	}
}
