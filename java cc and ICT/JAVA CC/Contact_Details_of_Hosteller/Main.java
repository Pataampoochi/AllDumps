package java_lc_cc.Contact_Details_of_Hosteller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {

		Hosteller obj = getHostellerDetails();

		System.out.println("The Student Details");
		System.out.println(obj.getStudentId() + " " + obj.getName() + " " + obj.getDepartmentId() + " "
				+ obj.getGender() + " " + obj.getPhone() + " " + obj.getHostelName() + " " + obj.getRoomNumber());

	}

	public static Hosteller getHostellerDetails() throws Exception {

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Details");
		System.out.println("Student Id");
		int studentid = Integer.parseInt(br.readLine());
		System.out.println("Student Name");
		String name = br.readLine();
		System.out.println("Department Id");
		int departmentid = Integer.parseInt(br.readLine());
		System.out.println("Gender");
		String gender = br.readLine();
		System.out.println("Phone Number");
		String phone = br.readLine();
		System.out.println("Hostel Name");
		String hostelName = br.readLine();
		System.out.println("Room Number");
		int roomNumber = Integer.parseInt(br.readLine());
		System.out.println("Modify Room Number(Y/N)");
		char rn = (char) br.read();
		if (rn=='Y') {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("New Room Number");
			int roomNumber1 = Integer.parseInt(in.readLine());
			roomNumber = roomNumber1;
		}
		System.out.println("Modify Phone Number(Y/N)");
		BufferedReader reads = new BufferedReader(new InputStreamReader(System.in));
		char pn = (char) reads.read();
		if (pn == 'Y') {
			BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("New Phone Number");
			String phone1 = rd.readLine();
			phone = phone1;
		}
		Hosteller obj = new Hosteller();
		obj.setDepartmentId(departmentid);
		obj.setGender(gender);
		obj.setHostelName(hostelName);
		obj.setName(name);
		obj.setPhone(phone);
		obj.setRoomNumber(roomNumber);
		obj.setStudentId(studentid);
		return obj;
	}

}