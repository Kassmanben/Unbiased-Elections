import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BallotTest {

	private Ballot ballot;
	
	@Before
	public void setUp() throws Exception {
		ballot = new Ballot();
	}

	@Test
	public void threeNamesAreSorted() {
		ballot.addCandidate("KENNEDY");
		ballot.addCandidate("LINCOLN");
		ballot.addCandidate("NIXON");
		String correct = "[NIXON, KENNEDY, LINCOLN]";
		assertEquals(correct, ballot.toString());
	}

	@Test
	public void allPresidentsSorted() {
		String[] presidents = {"ADAMS",
				"ADAMS",
				"ARTHUR",
				"BUCHANAN",
				"BUSH",
				"BUSH",
				"CARTER",
				"CLEVELAND",
				"CLINTON",
				"COOLIDGE",
				"EISENHOWER",
				"FILLMORE",
				"FORD",
				"GARFIELD",
				"GRANT",
				"HARDING",
				"HARRISON",
				"HARRISON",
				"HAYES",
				"HOOVER",
				"JACKSON",
				"JEFFERSON",
				"JOHNSON",
				"JOHNSON",
				"KENNEDY",
				"LINCOLN",
				"MADISON",
				"MCKINLEY",
				"MONROE",
				"NIXON",
				"OBAMA",
				"PIERCE",
				"POLK",
				"REAGAN",
				"ROOSEVELT",
				"ROOSEVELT",
				"TAFT",
				"TAYLOR",
				"TRUMAN",
				"TRUMP",
				"TYLER",
				"VAN BUREN",
				"WASHINGTON",
				"WILSON"};
		for (String name : presidents) {
			ballot.addCandidate(name);
		}
		String correct = "[ROOSEVELT, ROOSEVELT, REAGAN, WASHINGTON, WILSON, OBAMA, JOHNSON, JOHNSON, JACKSON, JEFFERSON, MONROE, MADISON, MCKINLEY, VAN BUREN, ARTHUR, ADAMS, ADAMS, HOOVER, HARRISON, HARRISON, HARDING, HAYES, BUSH, BUSH, BUCHANAN, GRANT, GARFIELD, NIXON, TRUMAN, TRUMP, TAYLOR, TAFT, TYLER, COOLIDGE, CARTER, CLINTON, CLEVELAND, EISENHOWER, KENNEDY, POLK, PIERCE, FORD, FILLMORE, LINCOLN]";
		assertEquals(correct, ballot.toString());
	}

}
