package MVP.Presentor;

import MVP.Model.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTables();
    int reservationTable(Date reservationDate, int tableNo, String name);
    int changeReservationTable(int oldReservationNO, Date reservationDate, int tableNo, String name);
}
