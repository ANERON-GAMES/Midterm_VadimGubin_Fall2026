package com.vg.midterm.library;

/*
 * Author: Vadim Gubin
 * Student ID: 301538942
 * Date: October 21, 2026
 * Description: Demo for members, staff pay, late fees, and the counters.
 */

public class Main {

	public static void main(String[] args) {
		System.out.println("Maple Leaf Public Library");
		System.out.println("A Java class can not extend two classes. Interfaces are used instead.");
		System.out.println();

		Member member1 = Member.registerMember("P1", "Sam Cole", "416-555-0101", "M100", 22);
		Member member2 = Member.registerMember("P2", "Alex Patel", "416-555-0190", "M101", 19, "Student");
		Member member3 = Member.registerMember("P3", "Kid Test", "416-555-0144", "M102", 8);
		Member.registerMember("P7", "Lee Tan", "416-555-0111", "M103", 20, "");

		System.out.println();
		System.out.println("--- Members ---");
		member1.displayMemberDetails();
		System.out.println();
		member2.displayMemberDetails();

		Librarian librarian = new Librarian("P4", "Priya Shah", "416-555-0170", "S10", "Circulation", 4200, 30, 40);
		SeniorLibrarian senior = new SeniorLibrarian("P5", "Noah Grant", "416-555-0188", "S11", "Reference", 5100, 40, 25, "Reference", 400);
		LibraryAssistant assistant = new LibraryAssistant("P6", "Mina Cho", "416-555-0162", "S12", "Desk", 3100, "Evening", 250);

		System.out.println();
		System.out.println("--- Staff ---");
		librarian.displayStaffDetails();
		System.out.println();
		senior.displayStaffDetails();
		System.out.println();
		assistant.displayStaffDetails();

		System.out.println();
		System.out.println("--- Late fees ---");
		printFee(librarian.calculateLateFee(4));
		printFee(librarian.calculateLateFee(3, 1.50));
		printFee(librarian.calculateLateFee(-2));
		printFee(librarian.calculateLateFee(2, 0));

		System.out.println();
		System.out.println("--- Pay, LibraryStaff reference ---");
		LibraryStaff[] staffList = new LibraryStaff[3];
		staffList[0] = librarian;
		staffList[1] = senior;
		staffList[2] = assistant;
		for (int i = 0; i < staffList.length; i++) {
			LibraryStaff person = staffList[i];
			System.out.println(person.getRoleDescription() + "  pay " + person.calculateMonthlyCompensation());
		}

		System.out.println();
		System.out.println("--- Interfaces ---");
		System.out.println(librarian.generateReport());
		System.out.println(librarian.reserveBook("BK-14"));
		System.out.println(librarian.reserveBook(""));
		System.out.println(senior.generateReport());

		System.out.println();
		System.out.println("--- Counters ---");
		System.out.println("People: " + Person.getPersonCount());
		System.out.println("Members: " + Member.getMemberCount());
		System.out.println("Staff: " + LibraryStaff.getStaffCount());
		if (member3 == null) {
			System.out.println("Failed registration was not counted.");
		}
	}

	private static void printFee(double fee) {
		if (fee < 0) {
			System.out.println("No fee was charged.");
			return;
		}
		System.out.printf("Late fee: %.2f%n", fee);
	}
}
