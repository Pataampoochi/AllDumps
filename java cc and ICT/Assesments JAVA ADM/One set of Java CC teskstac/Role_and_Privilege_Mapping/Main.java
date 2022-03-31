package java_lc_cc.Role_and_Privilege_Mapping;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		PrivilegeRoleBO pbo = new PrivilegeRoleBO();
		
		Role[] roles = new Role[4];
		roles[0] = new Role(1, "Software Developer", "Software Developer");
		roles[1] = new Role(2, "Manager", "Manager");
		roles[2] = new Role(3, "Tester", "Tester");
		roles[3] = new Role(4, "General Manager", "General Manager");
		
		Privilege[] privileges = new Privilege[5];
		privileges[0] = new Privilege(1, "Admin");
		privileges[1] = new Privilege(2, "Decision Making");
		privileges[2] = new Privilege(3, "Ordering");
		privileges[3] = new Privilege(4, "Managing");
		privileges[4] = new Privilege(5, "Development");
		
		pbo.displayRole(roles);
		pbo.displayPrivilege(privileges);
		
		System.out.println("Enter the number of privileges to assign the role :");
		Scanner sc = new Scanner(System.in);
		int number = Integer.parseInt(sc.nextLine());
		
		PrivilegeRole[] privilegeRole = new PrivilegeRole[number];
		
		for (int i = 0; i < number; i++) {
			
			System.out.println("Enter the role id and privilege id "+(i+1)+" :");
			String[] input = sc.nextLine().split(",");
			Integer roleId = Integer.parseInt(input[0]);
			Integer privilegeId = Integer.parseInt(input[1]);
			
			Role role = null;
			for (int j = 0; j < roles.length; j++) {
				if (roles[j].getId() == roleId) {
					role = roles[j];
				}
			}
			
			Privilege privilege = null;
			for (int j = 0; j < privileges.length; j++) {
				if (privileges[j].getId() == privilegeId) {
					privilege = privileges[j];
				}
			}
			
			privilegeRole[i] = new PrivilegeRole(role, privilege);
		}
		
		int choice = 0;
		do {
			System.out.println("1. Search by Role");
			System.out.println("2. Search by Privilege");
			System.out.println("3. Exit");
			System.out.println("Enter the choice :");
			choice = Integer.parseInt(sc.nextLine());
			
			if (choice == 1) {
				System.out.println("Enter the role to search :");
				String roleToSearch = sc.nextLine();
				pbo.displayPrivilegeDetailsByRole(privilegeRole, roleToSearch);
			} else if (choice == 2) {
				System.out.println("Enter the privilege to search :");
				String privilegeToSearch = sc.nextLine();
				pbo.displayRoleDetailsByPrivilege(privilegeRole, privilegeToSearch);
			}
			
		} while(choice != 3);

	}

}
