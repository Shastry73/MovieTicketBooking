public class TicketBookingThread extends Thread {

    private Theatre theatre;
    private String customer;
    private int noOfSeatsToBook;

    public TicketBookingThread(Theatre theatre,String customer, int noOfSeatsToBook) {
        this.theatre=theatre;
        this.customer=customer;
        this.noOfSeatsToBook = noOfSeatsToBook;
    }

    public void run() {
        theatre.bookTicket(customer, noOfSeatsToBook);
    }
}
