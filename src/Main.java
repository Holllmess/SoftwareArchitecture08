import MVP.Model.BookingModel;
import MVP.Presentor.BookingPresenter;
import MVP.View.BookingView;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        
        BookingModel bookingModel = new BookingModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(bookingModel, bookingView);

        bookingPresenter.loadTables();
        bookingPresenter.updateView();

        bookingView.reservationTable(new Date(), 2, "Mark");
        bookingView.changeReservationTable(1, new Date(), 3, "Marry");


        /**
         * Successfully reserved. Your booking number: 01
         * The reservation has been successfully changed. Your new booking number: 02
         */

        /**
         * RuntimeException: This table is not reserved. You can just book it.
         */

    }
}
