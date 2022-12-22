import sys
import re

def load_dna_from_file(fileName):
    f = open(fileName, "r")
    # read all lines into a list
    fileLines = f.readlines()
    f.close()
    # list comprehension to strip all whitespace
    strippedLines = [re.sub(r'\s*', '', line) for line in fileLines]
    # join all strings together
    dna = "".join(strippedLines)
    return dna

def count_subsequences(dna, subsequence):
    # TODO: implement

def main():
    # TODO: check the correct number of CLAs
    dna = load_dna_from_file("../data/H1N1nucleotide.txt")

    # TODO: change this to the "first" CLA
    subsequence = None
    count = count_subsequences(dna, subsequence)
    print(f"{subsequence} appears {count} times");

if __name__ == "__main__":
    main()
