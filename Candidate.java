
public class Candidate implements Comparable<Candidate> {



	private String name = null;

	public Candidate (String candidate) {
		name = candidate;
	}
	public String toString (){
		return name;
	}
	
	public int compareTo(Candidate c) {
		int diff = 0;
		String c1 = c.name;
		c1.toLowerCase();
		String a1 = this.name;
		a1.toLowerCase();
		int size = 0;
		if (c1.length() < a1.length()){ //we only go as far as the shortest string

			size = c1.length();
		}
		else size = a1.length();

		for (int i = 0; i < size; i++) {
			diff = c1.charAt(i) - a1.charAt(i);
			if (diff != 0) {
				break;
			}
			if ((i == (size - 1)) && (diff == 0)){
				diff = a1.length() - c1.length();
			}
		}
		return diff;
	}


}
