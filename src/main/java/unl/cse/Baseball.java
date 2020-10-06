package unl.cse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Processes a comma-separated value (CSV) file of win/loss data from the 2011
 * National League MLB season. It sorts the teams (best record to worst) and
 * prints a report to the standard output.
 * 
 * @author cbourke
 *
 */
public class Baseball {

	private static final String FILE_NAME = "data/mlb_nl_2011.csv";

	public static List<Team> loadData() {

		List<Team> teams = new ArrayList<>();

		// TODO: write code to open the file, process it line-by-line
		// to create team instances and add them to the list.
		//
		// Be sure to close the scanner
		return teams;
	}

	public static void main(String args[]) {

		List<Team> teams = loadData();

		System.out.println("Teams: ");
		for (Team t : teams) {
			System.out.println(t);
		}

		Collections.sort(teams, new Comparator<Team>() {
			@Override
			public int compare(Team a, Team b) {
				return b.getWinPercentage().compareTo(a.getWinPercentage());
			}

		});

		System.out.println("\n\nSorted Teams: ");
		for (Team t : teams) {
			System.out.println(t);
		}

	}

}
