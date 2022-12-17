package MVP.Presentor;

import MVP.Model.Table;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver{

    private final Model model;
    private final View view;
    private Collection<Table> tables;

    public BookingPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.setObserver(this);
    }

    //TODO: Table list
    public void loadTables(){
        tables = model.loadTables();
    }

    public void updateView(){
        view.showTables(tables);
    }

    //TODO: Reservation
    @Override
    public void onReservationTable(Date reservationDate, int tableNo, String name) {
        int reservationNo = model.reservationTable(reservationDate, tableNo, name);
        printReservationResult(reservationNo);
    }
    protected void printReservationResult(int reservationNo){
        view.printReservationResult(reservationNo);
    }


    //TODO: Change reservation
    public void onChangeReservationTable(int oldReservationNO, Date reservationDate, int tableNo, String name){
        int newReservationNo = model.changeReservationTable(oldReservationNO, reservationDate, tableNo, name);
        printNewReservationResult(newReservationNo);
    }
    protected void printNewReservationResult(int newReservationNo){
        view.printNewReservationResult(newReservationNo);
    }
}
