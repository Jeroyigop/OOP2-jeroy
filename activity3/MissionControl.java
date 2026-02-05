import java.time.format.DateTimeFormatter;

public class MissionControl {

    public static void main(String[] args) {

        SecretAgent agent = new SecretAgent("007", "James Bond", 5);

        System.out.println("*** INITIAL AGENT STATUS ***");
        System.out.println("Agent ID: " + agent.getAgentId());
        System.out.println("Name: " + agent.getCodename());
        System.out.println("Clearance Level: " + agent.getClearanceLevel());
        System.out.println("On Mission: " + agent.isOnMission());
        System.out.println();

        Mission mission = new Mission();

        mission.displayMissionBriefing();

        if (agent.getClearanceLevel() >= mission.getDifficulty()) {
            System.out.println("Agent " + agent.getAgentId() + " is cleared for mission.");
        } else {
            System.out.println(
                    "Agent " + agent.getAgentId() + "'s clearance is too low for this mission.");
            return;
        }

        System.out.println();
        System.out.println("*** STATUS AFTER DEPLOYMENT ***");
        System.out.println("On Mission: " + agent.isOnMission());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("*** FINAL AGENT STATUS ***");
        System.out.println("On Mission: " + agent.isOnMission());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' HH:mm:ss");

        System.out.println(
                "Last Mission Completed: " +
                        agent.getLastMissionCompletionTime().format(formatter));
    }
}
