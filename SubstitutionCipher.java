package homeworkFive;

public class SubstitutionCipher implements MessageEncoder{
	int shift;
	
	public SubstitutionCipher (int theShift) {
		shift = theShift;
	}

	@Override
	public String encode(String plainText) {
		// TODO Auto-generated method stub
		String encoded ="";
		for(int i=0; i<plainText.length();i++) {
			char x = plainText.charAt(i);
			
			x = shiftCharacter(x);
			encoded = encoded+x;
			
			
			
			
		}
		return encoded;
	}

	
Character shiftCharacter(Character x) {
	return (char) (x+shift);
}
}
