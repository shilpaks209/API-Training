package int1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program_3 {

	public static void main(String[] args) {
		String[] words = {"eat","ate","tea","test","tset"};//declare string array

	    List<List<String>> a = new ArrayList<>();

	    for(String word : words) {   
	      boolean isPlaced = false;
	      for(List<String> group : a) {
	        if(areAnagrams(group.get(0), word)) {
	          group.add(word);
	          isPlaced = true;
	          break;
	        }
	      }
	      if(!isPlaced) {
	        List<String> newGroup = new ArrayList<>();
	        newGroup.add(word);
	        a.add(newGroup);
	      }
	    }

	    System.out.println(a);

	  }

	  public static boolean areAnagrams(String s1, String s2) {
	    char[] c1 = s1.toCharArray();
	    char[] c2 = s2.toCharArray();
	    
	    Arrays.sort(c1);
	    Arrays.sort(c2);

	    return Arrays.equals(c1, c2);

	}

}
