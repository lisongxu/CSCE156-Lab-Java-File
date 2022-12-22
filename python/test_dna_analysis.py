import unittest

from dna_analysis import load_dna_from_file
from dna_analysis import count_subsequences

class CountSubsequencesUnitTests(unittest.TestCase):

    dna = load_dna_from_file("../data/H1N1nucleotide.txt")

    # all unit tests begin with "test"
    def test_count_subsequences_001(self):
        testInput = "gattaca"
        expectedOutput = 0
        actualOutput = count_subsequences(self.dna, testInput)
        self.assertEqual(expectedOutput, actualOutput)

    def test_count_subsequences_002(self):
        testInput = "g"
        expectedOutput = 305
        actualOutput = count_subsequences(self.dna, testInput)
        self.assertEqual(expectedOutput, actualOutput)

    def test_count_subsequences_003(self):
        testInput = "act"
        expectedOutput = 16
        actualOutput = count_subsequences(self.dna, testInput)
        self.assertEqual(expectedOutput, actualOutput)

    def test_count_subsequences_004(self):
        testInput = "gcg"
        expectedOutput = 5
        actualOutput = count_subsequences(self.dna, testInput)
        self.assertEqual(expectedOutput, actualOutput)

    def test_count_subsequences_005(self):
        testInput = "agt"
        expectedOutput = 25
        actualOutput = count_subsequences(self.dna, testInput)
        self.assertEqual(expectedOutput, actualOutput)

if __name__ == '__main__':
    #buffer=True suppresses stdout
    unittest.main(buffer=True)
