import java.util.ArrayList;
import java.util.List;

public class Booking {

    public String name;
    private int weekNumber;
    private String weekday;

    //Asking the user to supply the name of the day of the week they want their haircut on
    //can't just accept any string, need specifically hte weekday

    public Booking(String name, int weekNumber, String weekday) {
        this.name = name;
        this.weekNumber = weekNumber;
        this.weekday = weekday;
    }
}
