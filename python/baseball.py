
from team import Team

def load_teams(fileName):
    """
    Loads data related to MLB teams from a CSV file specified by the given
    fileName.  Returns a list of Team objects.
    """
    # TODO: implement

def main():
    teams = load_teams("../data/mlb_nl_2011.csv")
    print("Teams:")
    for t in teams:
        print(t)

    teams.sort(key = lambda x : x.getWinPercentage(), reverse=True)

    print("Sorted Teams:")
    for t in teams:
        print(t)

    # TODO: print to a file:

if __name__ == "__main__":
    main()
