package MVP.Presentor;

import java.util.Date;

public interface ViewObserver {

    void onReservationTable(Date reservationDate, int tableNo, String name);
    void onChangeReservationTable(int oldReservationNO, Date reservationDate, int tableNo, String name);
}
