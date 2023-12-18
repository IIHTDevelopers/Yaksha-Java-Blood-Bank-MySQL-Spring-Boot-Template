package com.bloodbank.dto;

public class BloodDonorDTO {

	private Long id;

	private String name;

	private String sex;

	private String phoneNumber;

	private String address;

	private String bloodGroup;

	public BloodDonorDTO() {
		super();
	}

	public BloodDonorDTO(Long id, String name, String sex, String phoneNumber, String address, String bloodGroup) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.bloodGroup = bloodGroup;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	@Override
	public String toString() {
		return "BloodDonorDTO [id=" + id + ", name=" + name + ", sex=" + sex + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + ", bloodGroup=" + bloodGroup + "]";
	}
}
