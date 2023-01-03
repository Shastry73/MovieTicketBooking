public class Main {
    public static void main(String[] args) {

        Theatre theatre1=new Theatre("Nagalakshmi","Bangalore",7);
        Theatre theatre2=new Theatre("SreeLekha","Bangalore",5);
        Theatre theatre3=new Theatre("Milana","Bangalore",3);

        Movie movie1= new Movie("Kantara",2.5,"Thriller");
        Movie movie2= new Movie("VR",3,"Suspense");

        theatre1.setMovie(movie1);
        theatre2.setMovie(movie1);
        theatre3.setMovie(movie2);

        TicketBookingThread t1 = new TicketBookingThread(theatre1,"Ravi",3);
        TicketBookingThread t2 = new TicketBookingThread(theatre1,"Kumar",3);
        TicketBookingThread t3 = new TicketBookingThread(theatre2,"Sathish",2);
        TicketBookingThread t4 = new TicketBookingThread(theatre1,"Ramesh",3);

        t1.start();
        t2.start();

        t3.start();
        t4.start();
    }
}