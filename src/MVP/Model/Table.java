package MVP.Model;

import java.util.ArrayList;
import java.util.Collection;

public class Table {
    private static int counter;
    private final int no;
    private final Collection<Reservation> reservations = new ArrayList<>();


    {
        no = ++counter;
    }

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    public int getNo() {
        return no;
    }

    @Override
    public String toString() {
        return String.format("Table #0%d", no);
    }
}
