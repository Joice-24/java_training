package Day6;

class TicketCounter {
    int totalSeats = 5;

    public synchronized void bookTicket(String user, int seats) {
        System.out.println(user + " is trying to book " + seats + " seat(s).");

        if (seats <= totalSeats) {
            System.out.println("Seats available. Booking...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            totalSeats -= seats;
            System.out.println("Booking confirmed for " + user + ". Seats left: " + totalSeats);
        } else {
            System.out.println("Sorry " + user + ", not enough seats available.");
        }
    }
}

class BookingThread extends Thread {
    TicketCounter counter;
    String user;
    int seats;

    BookingThread(TicketCounter counter, String user, int seats) {
        this.counter = counter;
        this.user = user;
        this.seats = seats;
    }

    public void run() {
        counter.bookTicket(user, seats);
    }
}

public class Mainprogram {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();

        BookingThread t1 = new BookingThread(counter, "Joice", 2);
        BookingThread t2 = new BookingThread(counter, "kani", 3);
        BookingThread t3 = new BookingThread(counter, "sadha", 2); 

        t1.start();
        t2.start();
        t3.start();
    }
}
