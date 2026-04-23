import java.util.Collections;

public class TournamentDemo {
    public static void main(String[] args) {
        Tournament<Athlete> tournament = new Tournament<>();

        Athlete athlete1 = new Athlete("Alice", 88);
        athlete1.addTrophy("City Cup");
        Athlete athlete2 = new Athlete("Bob", 95);
        athlete2.addTrophy("Regional Medal");
        Athlete athlete3 = new Athlete("Charlie", 88);
        athlete3.addTrophy("State Ribbon");

        tournament.addParticipant(athlete1);
        tournament.addParticipant(athlete2);
        tournament.addParticipant(athlete3);

        System.out.println("All participants before sorting:");
        tournament.showAll();

        Collections.sort(tournament.getParticipants());

        System.out.println("\nAll participants after sorting:");
        tournament.showAll();

        System.out.println("\nCloning an athlete and modifying the clone:");
        Athlete clonedAthlete = athlete1.clone();
        clonedAthlete.addTrophy("Clone Trophy");

        System.out.println("Original athlete: " + athlete1);
        System.out.println("Cloned athlete:   " + clonedAthlete);

        System.out.println("\nTesting default and static interface methods:");
        athlete2.reportStatus();
        System.out.println("Is 75 a valid score? " + Competitor.isValidScore(75));
        System.out.println("Is 125 a valid score? " + Competitor.isValidScore(125));
    }
}
