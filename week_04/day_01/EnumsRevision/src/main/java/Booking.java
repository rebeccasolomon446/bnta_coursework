import java.util.ArrayList;
import java.util.List;

public class Booking {

    private String name;
    private int weekNumber;
    private ArrayList<Weekday> weekdays ;

    public Booking(String name, int weekNumber, String weekday) {
        this.name = name;
        this.weekNumber = weekNumber;
        this.weekdays = new ArrayList<>();
    }

    public void addWeekday(Weekday day) {
        weekdays.add(day);
    }

    public void removeWeekday(Weekday day) {
        weekdays.remove(day);
    }

    public ArrayList<Weekday> getWeekday() {
        return this.weekdays;
    }

    public boolean bookingDayIs(Weekday dayChosen) {
        for(Weekday day : weekdays) {
            if(dayChosen.equals(day)) {
                return true;
            }

        }
        return false;
    }
}
