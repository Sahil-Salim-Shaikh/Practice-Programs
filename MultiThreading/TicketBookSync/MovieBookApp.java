package TicketBookSync;

public class MovieBookApp extends Thread {
 
    static BookThetreSeat b;
    int seat;
    public void run()
    {
        b.bookSeat(seat);
    }
    public static void main(String[] args) {
        b=new BookThetreSeat();
        
        MovieBookApp sahil=new MovieBookApp();
        sahil.setName("sahil");
        sahil.seat=1;
        sahil.start();

        MovieBookApp sultan=new MovieBookApp();
        sultan.setName("sultan");
        sultan.seat=6;
        sultan.start();

        MovieBookApp john = new MovieBookApp();
        john.setName("John");
        john.seat = 4;
        john.start();

        // MovieBookApp emma = new MovieBookApp();
        // emma.setName("Emma");
        // emma.seat = 2;
        // emma.start();

        // MovieBookApp liam = new MovieBookApp();
        // liam.setName("Liam");
        // liam.seat = 3;
        // liam.start();

        // MovieBookApp olivia = new MovieBookApp();
        // olivia.setName("Olivia");
        // olivia.seat = 5;
        // olivia.start();




        
    }
}
