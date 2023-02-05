package com.restaurent.app.restaurents;

public class Restaurents {

	private int id;
	private String restaurentName;
	private String address;
	private String number;
	private String speiality;
	private int totalStaff;
	private int minPrice;
	public Restaurents(int id,String restaurentName, String address, String number, String speiality, int totalStaff,
			int minPrice) {
		super();
		this.id = id;
		this.restaurentName = restaurentName;
		this.address = address;
		this.number = number;
		this.speiality = speiality;
		this.totalStaff = totalStaff;
		this.minPrice = minPrice;
	}
	public Restaurents() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRestaurentName() {
		return restaurentName;
	}
	public void setRestaurentName(String restaurentName) {
		this.restaurentName = restaurentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getSpeiality() {
		return speiality;
	}
	public void setSpeiality(String speiality) {
		this.speiality = speiality;
	}
	public int getTotalStaff() {
		return totalStaff;
	}
	public void setTotalStaff(int totalStaff) {
		this.totalStaff = totalStaff;
	}
	public int getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(int minPrice) {
		this.minPrice = minPrice;
	}
	@Override
	public String toString() {
		return "Restaurents [id=" + id + ", restaurentName=" + restaurentName + ", address=" + address + ", number="
				+ number + ", speiality=" + speiality + ", totalStaff=" + totalStaff + ", minPrice=" + minPrice + "]";
	}
	
	
}
