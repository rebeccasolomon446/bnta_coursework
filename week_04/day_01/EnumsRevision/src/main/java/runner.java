import java.util.Scanner;

public class runner {

    public static void main(String[] args) {

        Booking customer1 = new Booking("Lisa", 2, "Saturday");

        customer1.addWeekday(Weekday.SATURDAY);

        System.out.println(customer1.bookingDayIs(Weekday.SATURDAY));


    }
}
