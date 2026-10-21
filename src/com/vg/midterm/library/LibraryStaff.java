package com.vg.midterm.library;

/*
 * Author: Vadim Gubin
 * Student ID: 301538942
 * Date: October 21, 2026
 * Description: Abstract staff parent. Salary and the staff counter live here.
 */

public abstract class LibraryStaff extends Person {

	private final String staffId;
	private final String department;
	private final double monthlySalary;
	private static int staffCount;

	public LibraryStaff(String personId, String name, String phoneNumber, String staffId, String department, double monthlySalary) {
		super(personId, name, phoneNumber);
		this.staffId = staffId;
		this.department = department;
		this.monthlySalary = monthlySalary;
		staffCount++;
	}

	public static int getStaffCount() {
		return staffCount;
	}

	public String getStaffId() {
		return staffId;
	}

	public String getDepartment() {
		return department;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void displayStaffDetails() {
		displayBasicDetails();
		System.out.println("Staff id: " + staffId);
		System.out.println("Department: " + department);
		System.out.println("Monthly salary: " + monthlySalary);
	}

	public abstract double calculateMonthlyCompensation();
}
