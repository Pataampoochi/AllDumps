package java_lc_cc.Role_and_Privilege_Mapping;

import java.util.*;

public class PrivilegeRoleBO {
	
	public void displayRoleDetailsByPrivilege(PrivilegeRole[] privilegeRole, String privilege) {
		
		ArrayList<String> roles = new ArrayList<String>();
		for (int i = 0; i < privilegeRole.length; i++) {
			if (privilegeRole[i].getPrivilege().getName().equalsIgnoreCase(privilege)) {
				roles.add(privilegeRole[i].getRole().getName());
			}
		}
		if (roles.size() == 0) {
			System.out.println("There is no role for that privilege");
		} else {
			System.out.println("Role name :");
			for (int i = 0; i < roles.size(); i++) {
				System.out.println(roles.get(i));
			}
		}
	}
	
	public void displayRole(Role[] roles) {
		System.out.println("Role Details :");
		System.out.format("%-15s %s\n", "Id","Name");
		for (int i = 0; i < roles.length; i++) {
			System.out.format("%-15s %s\n", roles[i].getId(), roles[i].getName());
		}
	}
	
	public void displayPrivilege(Privilege[] privilege) {
		System.out.println("Privilege Details :");
		System.out.format("%-15s %s\n", "Id","Name");
		for (int i = 0; i < privilege.length; i++) {
			System.out.format("%-15s %s\n", privilege[i].getId(), privilege[i].getName());
		}
	}
	
	public void displayPrivilegeDetailsByRole(PrivilegeRole[] privilegeRole, String role) {
		
		ArrayList<String> privileges = new ArrayList<String>();
		for (int i = 0; i < privilegeRole.length; i++) {
			if (privilegeRole[i].getRole().getName().equalsIgnoreCase(role)) {
				privileges.add(privilegeRole[i].getPrivilege().getName());
			}
		}
		if (privileges.size() == 0) {
			System.out.println("There is no Privilege for that role");
		} else {
			System.out.println("Privilege name :");
			for (int i = 0; i < privileges.size(); i++) {
				System.out.println(privileges.get(i));
			}
		}
	}
}
