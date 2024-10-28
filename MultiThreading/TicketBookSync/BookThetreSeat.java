package TicketBookSync;

public class BookThetreSeat {
    int TotalSeat=10;
    synchronized void bookSeat(int seat)
    {
        if (TotalSeat>=seat) {
            
            System.out.println(seat+" Ticket Book Sucessfully "+Thread.currentThread().getName());
            TotalSeat=TotalSeat-seat;
            System.out.println("seats left "+TotalSeat);
        }else{
            System.out.println(Thread.currentThread().getName()+" Seat left "+TotalSeat);
            
        }

    }



}
