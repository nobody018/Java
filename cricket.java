/*Write a member function for batsman class, which will take one integer as parameter.
Add this integer with total run, increment no of innings and calculate other variables accordingly.
Write a member function for bowler class, which will take two integers as parameter.
Add one integer with runs given and another with wickets, increment no of innings and calculate other variables accordingly.*/

class Batsman {
    int totalRuns;
    int innings;

    public Batsman() {
        totalRuns = 0;
        innings = 0;
    }

    public void addRuns(int runs) {
        totalRuns += runs;
        innings++;

    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public int getInnings() {
        return innings;
    }
}

class Bowler {
    int runsGiven;
    int wickets;
    int innings;

    public Bowler() {
        runsGiven = 0;
        wickets = 0;
        innings = 0;
    }

    public void addWicketRun(int runs, int wickets) {
        runsGiven += runs;
        this.wickets += wickets;
        innings++;

    }

    public int getRunsGiven() {
        return runsGiven;
    }

    public int getWickets() {
        return wickets;
    }

    public int getInnings() {
        return innings;
    }
}

public class cricket {
    public static void main(String[] args) {

        Batsman batsman = new Batsman();
        batsman.addRuns();
        System.out.println("Total Runs: " + batsman.getTotalRuns());
        System.out.println("Innings: " + batsman.getInnings());

        batsman.addRuns(5);
        System.out.println("Total Runs: " + batsman.getTotalRuns());
        System.out.println("Innings: " + batsman.getInnings());

        batsman.addRuns(5);
        System.out.println("Total Runs: " + batsman.getTotalRuns());
        System.out.println("Innings: " + batsman.getInnings());

        Bowler bowler = new Bowler();

        bowler.addWicketRun();
        System.out.println("Runs Given: " + bowler.getRunsGiven());
        System.out.println("Wickets: " + bowler.getWickets());
        System.out.println("Innings: " + bowler.getInnings());

        bowler.addWicketRun(30, 1);
        System.out.println("Runs Given: " + bowler.getRunsGiven());
        System.out.println("Wickets: " + bowler.getWickets());
        System.out.println("Innings: " + bowler.getInnings());

        bowler.addWicketRun(3, 0);
        System.out.println("Runs Given: " + bowler.getRunsGiven());
        System.out.println("Wickets: " + bowler.getWickets());
        System.out.println("Innings: " + bowler.getInnings());
    }
}
