package java_lc_cc.Share_it_Movies;

public class Validator {

	public static boolean validateRequirement(int availableStorage, String bluetoothConnectivity, String wlanConnectivity)
	throws RequirementMisMatchException{
		boolean flag=false;
		
		if (availableStorage >= 2 && bluetoothConnectivity.equalsIgnoreCase("Yes") && wlanConnectivity.equalsIgnoreCase("Yes") ){
			flag=true;
		}
		else{
			flag=false;
				throw new RequirementMisMatchException("Sorry!!! Transfer failed");
		}
		
		return flag;
	}
}
