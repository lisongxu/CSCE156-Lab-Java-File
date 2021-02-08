package unl.cse;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class DnaAnalysisTests {

	/**
	 * Tests that the {@link DnaAnalysis#countSubsequences(String)} method correctly
	 * counts the number of instances of the given subsequence.
	 * 
	 */
	@Test
	public void teamFixedTest01() {
		String sub = "gattaca";
		int expected = 0;
		int result = DnaAnalysis.countSubsequences(sub);
		Assertions.assertEquals(expected, result);
	}
	
	/**
	 * Tests that the {@link DnaAnalysis#countSubsequences(String)} method correctly
	 * counts the number of instances of the given subsequence.
	 * 
	 */
	@Test
	public void teamFixedTest02() {
		String sub = "g";
		int expected = 305;
		int result = DnaAnalysis.countSubsequences(sub);
		Assertions.assertEquals(expected, result);
	}
	
	/**
	 * Tests that the {@link DnaAnalysis#countSubsequences(String)} method correctly
	 * counts the number of instances of the given subsequence.
	 * 
	 */
	@Test
	public void teamFixedTest03() {
		String sub = "act";
		int expected = 16;
		int result = DnaAnalysis.countSubsequences(sub);
		Assertions.assertEquals(expected, result);
	}
	
	/**
	 * Tests that the {@link DnaAnalysis#countSubsequences(String)} method correctly
	 * counts the number of instances of the given subsequence.
	 * 
	 */
	@Test
	public void teamFixedTest04() {
		String sub = "gcg";
		int expected = 5;
		int result = DnaAnalysis.countSubsequences(sub);
		Assertions.assertEquals(expected, result);
	}
	
	/**
	 * Tests that the {@link DnaAnalysis#countSubsequences(String)} method correctly
	 * counts the number of instances of the given subsequence.
	 * 
	 */
	@Test
	public void teamFixedTest05() {
		String sub = "agt";
		int expected = 25;
		int result = DnaAnalysis.countSubsequences(sub);
		Assertions.assertEquals(expected, result);
	}

}
