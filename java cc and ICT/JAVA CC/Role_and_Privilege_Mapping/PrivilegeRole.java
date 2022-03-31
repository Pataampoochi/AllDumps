package java_lc_cc.Role_and_Privilege_Mapping;

public class PrivilegeRole {
	
	private Role role;
	private Privilege privilege;
	
	public PrivilegeRole(Role role, Privilege privilege) {
		this.role = role;
		this.privilege = privilege;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Privilege getPrivilege() {
		return privilege;
	}

	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;
	}
	
}
