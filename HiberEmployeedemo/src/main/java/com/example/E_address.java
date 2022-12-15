/********************Employee Address*******************/
package com.example;


import javax.persistence.Embeddable;       //import Embeddable for @Embeddable 

@Embeddable

public class E_address
{
	private int pincode;
	private String Hname,Area,city;     //create getters and setter for E_address
	public int getPincode() 
	{
		return pincode;
	}
	public void setPincode(int pincode) 
	{
		this.pincode = pincode;
	}
	public String getHname()
	{
		return Hname;
	}
	public void setHname(String hname)
	{
		Hname = hname;
	}
	public String getArea() 
	{
		return Area;
	}
	public void setArea(String area)
	{
		Area = area;
	}
	public String getCity()
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}

}
