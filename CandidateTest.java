import static org.junit.Assert.*;

import org.junit.Test;

public class CandidateTest {

	@Test
	public void candidateIsComparable() {
		Candidate c = new Candidate("WASHINGTON");
		assertTrue(c instanceof Comparable);
	}
	@Test
	public void reaganIsBeforBush() {
		Candidate r = new Candidate("REAGAN");
		Candidate b = new Candidate("BUSH");
		assertTrue(r.compareTo(b) < 0);
	}
	
	@Test
	public void bushIsAfterReagan() {
		Candidate r = new Candidate("REAGAN");
		Candidate b = new Candidate("BUSH");
		assertTrue(b.compareTo(r) > 0);
	}
	
	@Test
	public void laterLettersAreConsidered() {
		Candidate mmz = new Candidate("MMZ");
		Candidate mmp = new Candidate("MMP");
		assertTrue(mmz.compareTo(mmp) < 0);
	}
	
	@Test
	public void prefixesComeEarlier() {
		Candidate abc = new Candidate("ABC");
		Candidate abcd = new Candidate("ABCD");
		assertTrue(abc.compareTo(abcd) < 0);
	}
	
	@Test
	public void toStringReturnsName() {
		String name = "FILLMORE";
		Candidate c = new Candidate(name);
		assertEquals(name, c.toString());
	}
	
}
