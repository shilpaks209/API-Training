package int1;

public class Program_1 {

	public static void main(String[] args) {
		
	
		 String inputString = "Qwhefwqhfeh";
		 Program_1.countCharacter(inputString);
	}
//ASCII optimisation
	public static void countCharacter(String inputString) {
		 int[] charCountArray = new int[128];
		 System.out.println(charCountArray);
		 for (int i = 0; i < charCountArray.length; i++) {
	            
	                System.out.println("Character: " + (char) i + ", Count: " + charCountArray[i]);
	            }

	       
	        for (int i = 0; i < inputString.length(); i++) {
	            char currentChar = inputString.charAt(i);
	
	            charCountArray[currentChar]++;
	        }

	        for (int i = 0; i < charCountArray.length; i++) {
	            if (charCountArray[i] > 0) {
	                System.out.println("Character: " + (char) i + ", Count: " + charCountArray[i]);
	            }
	        }
	    }
		
	}

