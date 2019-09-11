/**
 * 
 */
package com.project.droolsdemo.propertyinsurance.model;

/**
 * @author sivasaiv
 *
 */
public class PropertyDescription {

	private String builtIn;
	
	private int floors;
	
	private int elevators;
	
	private String propertyType;
	
	private String isRoofUpdated;
	
	private String isElectricUpdated;
	
	private int nearestFireStation;
	
	private int nearestCoast;
	
	private String isClaimMade;
	
	private String propertyValue;

	public String getBuiltIn() {
		return builtIn;
	}

	public void setBuiltIn(String builtIn) {
		this.builtIn = builtIn;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public int getElevators() {
		return elevators;
	}

	public void setElevators(int elevators) {
		this.elevators = elevators;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public String getIsRoofUpdated() {
		return isRoofUpdated;
	}

	public void setIsRoofUpdated(String isRoofUpdated) {
		this.isRoofUpdated = isRoofUpdated;
	}

	public String getIsElectricUpdated() {
		return isElectricUpdated;
	}

	public void setIsElectricUpdated(String isElectricUpdated) {
		this.isElectricUpdated = isElectricUpdated;
	}

	public int getNearestFireStation() {
		return nearestFireStation;
	}

	public void setNearestFireStation(int nearestFireStation) {
		this.nearestFireStation = nearestFireStation;
	}

	public int getNearestCoast() {
		return nearestCoast;
	}

	public void setNearestCoast(int nearestCoast) {
		this.nearestCoast = nearestCoast;
	}

	public String getIsClaimMade() {
		return isClaimMade;
	}

	public void setIsClaimMade(String isClaimMade) {
		this.isClaimMade = isClaimMade;
	}

	public String getPropertyValue() {
		return propertyValue;
	}

	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}
}
