package MVP.View;

import MVP.Model.Table;
import MVP.Presentor.View;
import MVP.Presentor.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private ViewObserver observer;

    public void showTables(Collection<Table> tables){
        for (Table table:tables) {
            System.out.println(table);
        }
    }

    @Override
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    public void reservationTable(Date reservationDate, int tableNo, String name){
        observer.onReservationTable(reservationDate, tableNo, name);
    }

    public void changeReservationTable(int oldReservationNO, Date reservationData, int tableNo, String name){
        observer.onChangeReservationTable(oldReservationNO, reservationData, tableNo, name);
    }


    public void printReservationResult(int reservationNo){
        System.out.printf("Successfully reserved. Your booking number: 0%d\n", reservationNo);
    }

    @Override
    public void printNewReservationResult(int newReservationNo) {
        System.out.printf("The reservation has been successfully changed. Your new booking number: 0%d\n", newReservationNo);
    }

}
