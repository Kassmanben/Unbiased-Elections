import java.util.ArrayList;
import java.util.Collections;

public class Ballot {
	ArrayList<Candidate> candidates;

	public Ballot() {
		this.candidates = new ArrayList<Candidate>();
	}

	public void addCandidate(String candidate) {
		this.candidates.add(new Candidate(candidate));
		Collections.sort(candidates);
	}

	public String toString() {
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
