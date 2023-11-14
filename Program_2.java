package int1;

import java.util.HashMap;

public class Program_2 {

	public static void main(String[] args) {
		String str = "Qwhefwqhfeh";
	    HashMap<Character, Integer> charCount = new HashMap<>();
	    
	    for(int i = 0; i < str.length(); i++) {
	      char ch = str.charAt(i);
	      if(charCount.containsKey(ch)) {
	        charCount.put(ch, charCount.get(ch) + 1);  
	      } else {
	        charCount.put(ch, 1);
	      }
	    }
	    
	    for(Character key : charCount.keySet()) {
	      System.out.println(key + ": " + charCount.get(key));
	    }
	  
	}

}
