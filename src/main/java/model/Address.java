package model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String address;
	private Integer number;
	private String city;

	public Address(){
		
	}
	public Address(String address, Integer number, String city) {
		this.address = address;
		this.number = number;
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
