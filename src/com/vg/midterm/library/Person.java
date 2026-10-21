package com.vg.midterm.library;

/*
 * Author: Vadim Gubin
 * Student ID: 301538942
 * Date: October 21, 2026
 * Description: Abstract parent for every person in the library.
 */

public abstract class Person {

	private final String personId;
	private final String name;
	private final String phoneNumber;
	private static int personCount;

	public Person(String personId, String name, String phoneNumber) {
		this.personId = personId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		personCount++;
	}

	public static int getPersonCount() {
		return personCount;
	}

	public String getPersonId() {
		return personId;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void displayBasicDetails() {
		System.out.println("Id: " + personId);
		System.out.println("Name: " + name);
		System.out.println("Phone: " + phoneNumber);
	}

	public abstract String getRoleDescription();

	public String toString() {
		return personId + "  " + name + "  " + phoneNumber;
	}
}
