import java.util.ArrayList;

public class Tournament<T> {
    private ArrayList<T> participants;

    public Tournament() {
        participants = new ArrayList<>();
    }

    public void addParticipant(T participant) {
        participants.add(participant);
    }

    public void showAll() {
        for (T participant : participants) {
            System.out.println(participant);
        }
    }

    public ArrayList<T> getParticipants() {
        return participants;
    }
}
