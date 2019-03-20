
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Top ten players by goals:");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println("");

        System.out.println("Top 25 players by penalty amounts:");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println("");

        System.out.println("NHL Statistics for Sidney Crosby:");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println("");

        System.out.println("NHL statistics for Philadelphia Flyers:");
        NHLStatistics.teamStatistics("PHI");
        System.out.println("");

        System.out.println("Players in Anaheim Ducks by points:");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}
