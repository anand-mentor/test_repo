package com.zensar;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BusinessAppMockTest {

	@Test
	public void testMockVsSpy() {
		List<String> mockList = mock(List.class);
		mockList.add("ABC"); mockList.add("XYZ");
		System.out.println("Mock: " + mockList.get(1));
		
		List<String> list = new ArrayList<>();
		List<String> spyList = spy(list);
		spyList.add("ABC"); spyList.add("XYZ");
		System.out.println("Spy: " + spyList.get(1));
	}
	
	
	@Test
	public void testBusinessApp() {
		CityService cityService = mock(CityService.class);
		BusinessApp businessApp = new BusinessApp(cityService);
		
		when(cityService.findCitiesByCountries("INDIA")).
		thenReturn(Arrays.asList("Pune", "Mumbai","Delhi"));
		when(cityService.findCitiesByCountries("USA")).
		thenReturn(Arrays.asList("New York", "Washington"));
		
		when(cityService.findCitiesByCountries(anyString()))
				.thenReturn(Arrays.asList("city1", "city2","city3"));

		//when(cityService.findCitiesByCountries("SWEDEN"))
		//	.thenThrow(NullPointerException.class);
		//businessApp.retrieveCityListByCountry("SWEDEN");
		
		//assertEquals(businessApp.retrieveCityListByCountry("USA").size(), 3);
		assertEquals(businessApp.retrieveCityListByCountry("SWEDEN").size(), 3);
	}
	
}
