package com.vg.midterm.library;

/*
 * Author: Vadim Gubin
 * Student ID: 301538942
 * Date: October 21, 2026
 * Description: Library assistant. Pay is salary plus the shift allowance.
 */

public class LibraryAssistant extends LibraryStaff {

	private final String shiftType;
	private final double shiftAllowance;

	public LibraryAssistant(String personId, String name, String phoneNumber, String staffId, String department, double monthlySalary, String shiftType, double shiftAllowance) {
		super(personId, name, phoneNumber, staffId, department, monthlySalary);
		this.shiftType = shiftType;
		this.shiftAllowance = shiftAllowance;
	}

	public String getShiftType() {
		return shiftType;
	}

	public double getShiftAllowance() {
		return shiftAllowance;
	}

	public double calculateMonthlyCompensation() {
		return getMonthlySalary() + shiftAllowance;
	}

	public void displayStaffDetails() {
		System.out.println("Assistant  " + getName() + "  shift " + shiftType + "  allowance " + shiftAllowance);
	}

	public String getRoleDescription() {
		return "Library assistant";
	}
}
