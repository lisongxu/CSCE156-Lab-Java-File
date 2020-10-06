<?php

/**
 * Loads DNA from the specified file line by line, stripping all
 * whitespace and returning the DNA string.
 */
function loadDnaFromFile() {

  $fileContents = "";
  $fileHandle = fopen("../data/H1N1nucleotide.txt", "r");

  while(!feof($fileHandle)) {
    //get the next line
    $line = fgets($fileHandle);
    //concatenate
    $fileContents .= $line;
  }
  fclose($fileHandle);

  //strip all whitespace
  $dna = preg_replace("/\s*/", "", $fileContents); 
  return $dna; 
}

/**
  * Counts the number of times $subSequence appears in the
  * given $dna string.
  */
function countSubsequences($dna, $subSequence) {
  //TODO: implement
}

$subSequence = NULL;
$dna = loadDnaFromFile();
$count = countSubsequences($dna,$subSequence);

printf("%s appears %d times\n", $subSequence, $count);

?>
