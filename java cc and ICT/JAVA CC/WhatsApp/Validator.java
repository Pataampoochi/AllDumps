package java_lc_cc.WhatsApp;

public class Validator {
	
	public static boolean validateNumberOfGroups(int groups) throws NumberOfGroupsExceedException{
		boolean flag = false;
		
		if (groups<=5){
			flag=true;
		}
		else{
		    flag = false;
		}
		
		
		return flag;
		
	}

}
