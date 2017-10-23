import java.util.Arrays;
import java.util.List;


public class Candidate implements Comparable<Candidate> {

	private String name = null;
	private List<String> order = Arrays.asList("R","W","Q","O","J","M","V","A","H","B","S","G","Z","X","N","T","C","I","E","K","U","P","D","Y","F","L");

	public Candidate (String candidate) {
		name = candidate;
	}
	public String toString (){
		return name;
	}
	
	public int compareTo(Candidate c) {
		int diff = 0; //difference between two characters
		String c1 = c.name;
		String a1 = this.name;
		int size =  Math.min(c1.length(),a1.length());
		
		for (int i = 0; i < size; i++) { //start looping 
			int c3 = order.indexOf(c1.substring(i,i+1));
			int a3 = order.indexOf(a1.substring(i,i+1));
			diff = a3-c3;; //check the character at every index in either name
			if (diff != 0) { //if the two chars aren't the same, break. else, keep looping till it breaks.
				break;
			}
			if ((i == (size - 1)) && (diff == 0)){ //if we've looped through the shorter name and the letters are all the same, return the difference between the two name lengths.
				diff = a1.length() - c1.length();
			}
		}
		return diff;
	}
}
