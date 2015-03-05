
public class CharacterArray {

	public static void main(String[] args) {
		String address = "6901 Sudley Road Manassas VA";
		char[] verify = address.toCharArray();
		
		for(int i=0; i<verify.length; i++)
		{
			System.out.println("Character is: " +verify[i]);
			if (Character.isLetter(verify[i]))
			{
				System.out.println("This is a letter.");
				if(Character.isUpperCase(verify[i]))
				{
					verify[i] = Character.toLowerCase(verify[i]);
					System.out.println("Converting to lowercase: "+verify[i]);
					System.out.println();
				}
				else if (Character.isLowerCase(verify[i]))
				{
					verify[i] = Character.toUpperCase(verify[i]);
					System.out.println("Converting to uppercase: "+verify[i]);
					System.out.println();
					
				}
			}
			else if (Character.isDigit(verify[i]))
			{
				System.out.println("This is a digit.");
				verify[i] = '*';
				System.out.println("Converting to asterisk: "+verify[i]);
				System.out.println();
			}							
			
		}

	}

}
