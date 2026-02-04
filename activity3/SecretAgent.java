
import java.time.LocalDateTime;

public class SecretAgent {
    private String agentId;
    private String codename;
    private int clearanceLevel;
    private boolean onMission;
    private LocalDateTime lastMissionCompletionTime;

    public SecretAgent() {
    }

    public SecretAgent(String agentId, String codename, int clearanceLevel) {
        this.agentId = agentId;
        this.codename = codename;

    }

    public String codename(String codename) {
        return codename;

    }

    public int clearanceLevel(int clearanceLevel) {
        return clearanceLevel;

    }

    public boolean onMission(boolean onMission) {
        return onMission;

    }

    public LocalDateTime getlastMissionCompletionTime() {
        return lastMissionCompletionTime;

    }

    public void setCodename(String newCodename) {
        codename = newCodename;
    }

    public void setClearanceLevel(int level) {
        if (level >= 1 && level <= 5) {
            this.clearanceLevel = level;
        } else {
            System.out.println("Invalid level.");
        }

    }

}
