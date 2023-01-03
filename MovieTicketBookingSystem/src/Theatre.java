public class Theatre {

    private String name;

    private String city;

    private Movie movie;

    private int availableSeats;

    public Theatre(String name,String city,int availableSeats) {
        this.name = name;
        this.city=city;
        this.availableSeats=availableSeats;

    }


    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }


    public synchronized void bookTicket(String name, int numberOfSeats) {
        if ((availableSeats >= numberOfSeats) && (numberOfSeats > 0)) {
            System.out.println("Hello " + name + " : " + numberOfSeats+ " Seats booked Successfully..");
            availableSeats = availableSeats- numberOfSeats;
        } else
            System.out.println("Hello " + name + " : Seats Not Available");
    }


}
