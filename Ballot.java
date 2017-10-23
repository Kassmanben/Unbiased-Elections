import java.util.ArrayList;
import java.util.Collections;

public class Ballot {
	ArrayList<Candidate> candidates;

	public Ballot() {
		this.candidates = new ArrayList<Candidate>();
	}

	public void addCandidate(String candidate) { //Implments the custom compareTo method via the Collections.sort() method
		this.candidates.add(new Candidate(candidate));
		Collections.sort(candidates);
	}

	public String toString() { //Overwrites the predefined toString and returns as a string of the format "[a1, a2, ... an]"
		String candidateString = "[";
		for (Candidate c : candidates) {
			candidateString += c.toString() + ", ";
		}
		candidateString = candidateString.substring(0,
				candidateString.length() - 2);
		candidateString += "]";
		return candidateString;
	}

}
