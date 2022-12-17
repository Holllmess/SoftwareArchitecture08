package MVP.Presentor;

import MVP.Model.Table;

import java.util.Collection;

public interface View {

    void showTables(Collection<Table> tables);
    void setObserver(ViewObserver observer);
    void printReservationResult(int reservationNO);
    void printNewReservationResult(int newReservationNo);
}
