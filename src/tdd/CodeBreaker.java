package tdd;

public class CodeBreaker {
	
	int baseNumber = 1234;
	
	public String compare(int number) {
		if (validate(number) == false) return "Unexpected size";
		String stringX = "", stringG = "";
		String baseNumberString = Integer.toString(baseNumber);
		String numberString = Integer.toString(number);
		
		for(int i=0; i< numberString.length(); i++){
			String car = Character.toString(numberString.charAt(i));
			if(baseNumberString.contains(car)){
				if(car.equals(Character.toString(baseNumberString.charAt(i)))) {
					stringX = stringX + "X";		
				}
				else stringG = stringG + "-";
			}
		}
		
		return stringX + stringG;
	}

	public Boolean validate(int number) {
		String numberString = Integer.toString(number);
		if(numberString.length() == 4) {
			return true;
		}
		return false;
	}

}
