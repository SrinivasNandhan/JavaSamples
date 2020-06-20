package com.utils;

public class FinalClassExa {

	final String name ;
	final String address ;
	
	public FinalClassExa(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public FinalClassExa() {
		this.address = "";
		this.name = "";
		// TODO Auto-generated constructor stub
	}

	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
}
