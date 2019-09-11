/**
 * 
 */
package com.project.droolsdemo.propertyinsurance.util;

import java.util.Arrays;
import java.util.List;

/**
 * @author sivasaiv
 *
 */
public class PropertyInsuranceUtils {

	
	public List<String> getTerrorismCountries(){
		
		return Arrays.asList("pakistan","afganistan","syria","cuba","sudan","iraq");
	}
	
	
	public boolean checkCountry(String country) {
		List<String> terrorisedCountries = getTerrorismCountries();
		return terrorisedCountries.contains(country);
	}
}
