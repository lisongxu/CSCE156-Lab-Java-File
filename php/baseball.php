<?php

include_once("team.php");

/**
 * A comparator function to order Team instances based on win percentage,
 * most winning first.
 */
function teamComp($a, $b) {
  if($a->getWinPercentage() == $b->getWinPercentage()) {
    return 0;
  } else {
    return ($a->getWinPercentage() < $b->getWinPercentage() ? 1 : -1);
  }
}

function loadTeams() {
  $fileHandle = fopen("../data/mlb_nl_2011.csv", "r");
  $teams = array();
  // TODO: write code to open the file, process it line-by-line
  // to create team instances and add them to the array.
  //
  // Be sure to close the file

  return $teams;
}


  $teams = loadTeams();
  print "Teams: \n";
  foreach($teams as $team) {
    print $team . "\n";
  }

  usort($teams, "teamComp");

  print "\n\nSorted Teams: \n";
  foreach($teams as $team) {
    print $team . "\n";
  }

  //TODO: output the ordered teams to a file in a different format


?>
