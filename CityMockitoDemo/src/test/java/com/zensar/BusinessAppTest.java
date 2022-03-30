package com.zensar;

import static org.junit.Assert.*;

import org.junit.Test;

public class BusinessAppTest {

	@Test
	public void testBusinessApp() {
		CityService cityService = new CityServiceStub(); //new CityServiceImpl();
		BusinessApp businessApp = new BusinessApp(cityService);
		assertEquals(businessApp.retrieveCityListByCountry("INDIA").size(), 3);
	}

}
