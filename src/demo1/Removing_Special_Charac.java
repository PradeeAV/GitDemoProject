package demo1;

public class Removing_Special_Charac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			String str= "cubeview&#@";
			int count=0;
			String specialCharacterRemoved="";
			for(int i=0;i<str.length();i++)
			{
				if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) && 
						!Character.isWhitespace(str.charAt(i)))
						{
						
			
			count++;
						}
				else
				{
					specialCharacterRemoved=specialCharacterRemoved +str.charAt(i);
					
				}
			}
		
		if(count==0)
		{
			System.out.println("Removed the special characters");
		}
		else
		{
			System.out.println("Special characters are founded" +count);
			
			// TODO Auto-generated method stub

		}
	 System.out.println("specialCharacterRemoved"+specialCharacterRemoved);
		
	

	}

}
