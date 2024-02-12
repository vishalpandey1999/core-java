package Online_Movie_Booking_System;

public class Showtime {
    private String time;
    private String date;
    private int availableSeat;
    private int bookSeats;

    public Showtime(String time, String date, int availableSeat, int bookSeats) {
        this.time = time;
        this.date = date;
        this.availableSeat = availableSeat;
        this.bookSeats = bookSeats;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public int getAvailableSeat() {
        return availableSeat;
    }

    public int getBookSeats() {
        return bookSeats;
    }

    public void bookSeat(int numSeats){
        if(numSeats > 0 && numSeats <= availableSeat){
            bookSeats += numSeats;
            availableSeat -= numSeats;
        }
    }
}
