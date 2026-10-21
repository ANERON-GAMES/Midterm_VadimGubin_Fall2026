package com.vg.midterm.library;

/*
 * Author: Vadim Gubin
 * Student ID: 301538942
 * Date: October 21, 2026
 * Description: A library member. Single inheritance from Person.
 */

public class Member extends Person {

	private final String memberNumber;
	private final int age;
	private final String membershipType;
	private double outstandingFees;
	private static int memberCount;

	public Member(String personId, String name, String phoneNumber, String memberNumber, int age, String membershipType) {
		super(personId, name, phoneNumber);
		this.memberNumber = memberNumber;
		this.age = age;
		this.membershipType = membershipType;
		this.outstandingFees = 0;
		memberCount++;
	}

	public static int getMemberCount() {
		return memberCount;
	}

	public static Member registerMember(String personId, String name, String phoneNumber, String memberNumber, int age) {
		return registerMember(personId, name, phoneNumber, memberNumber, age, "Standard");
	}

	public static Member registerMember(String personId, String name, String phoneNumber, String memberNumber, int age, String membershipType) {
		if (name == null || name.trim().equals("")) {
			System.out.println("Registration failed. Name is empty.");
			return null;
		}
		if (phoneNumber == null || phoneNumber.trim().equals("")) {
			System.out.println("Registration failed. Phone is empty.");
			return null;
		}
		if (memberNumber == null || memberNumber.trim().equals("")) {
			System.out.println("Registration failed. Member number is empty.");
			return null;
		}
		if (age < 12 || age > 110) {
			System.out.println("Registration failed. Age is not valid.");
			return null;
		}
		if (membershipType == null || membershipType.trim().equals("")) {
			System.out.println("Registration failed. Membership type is missing.");
			return null;
		}

		Member member = new Member(personId, name, phoneNumber, memberNumber, age, membershipType);
		System.out.println("Member registered. Number " + memberNumber);
		return member;
	}

	public String getMemberNumber() {
		return memberNumber;
	}

	public int getAge() {
		return age;
	}

	public String getMembershipType() {
		return membershipType;
	}

	public double getOutstandingFees() {
		return outstandingFees;
	}

	public String getRoleDescription() {
		return "Member";
	}

	public void displayMemberDetails() {
		System.out.println("Member  " + getName() + "  " + memberNumber + "  age " + age + "  " + membershipType);
	}
}
