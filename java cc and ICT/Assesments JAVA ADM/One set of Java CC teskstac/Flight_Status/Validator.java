package java_lc_cc.Flight_Status;

public class Validator {
	
	public  boolean validatePassword(String password) throws IncorrectPasswordException
	{
		boolean flag = false;
		char p[]=password.toCharArray();
		int count=0;
		for(char i:p)
		{
			if(Character.isUpperCase(i))
				count++;
		}
		if (count==p.length){
			flag=true;
		}
		else{

			//Fill the code
			flag = false;
			throw new IncorrectPasswordException("Incorrect Password");
		}

		return flag;
	}
}