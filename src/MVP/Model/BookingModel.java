package MVP.Model;

import MVP.Presentor.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Optional;

public class BookingModel implements Model {

    private Collection<Table> tables;

    public Collection<Table> loadTables(){
        if (tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    public int reservationTable(Date reservationDate, int tableNo, String name){
        Optional<Table> table = loadTables().stream().filter(t -> t.getNo() == tableNo).findFirst();
        if (table.isPresent()){
            Reservation reservation = new Reservation(reservationDate, name);
            table.get().getReservations().add(reservation);
            return reservation.getId();
        } throw new RuntimeException("Incorrect table number.");
    }

    public int changeReservationTable(int oldReservationNO, Date reservationDate, int tableNo, String name){

        for (Table table:tables) {
            for (Reservation reservation:table.getReservations()) {
                if (reservation.getId() == oldReservationNO){
                    table.getReservations().remove(reservation);

                    return reservationTable(reservationDate, tableNo, name);
                }
            }
        } throw new RuntimeException("This table is not reserved. You can just book it.");
    }
}














