package Online_Movie_Booking_System;

public class Ticket {
    private String movieTitle;
    private Showtime showtime;
    private int numSeats;
    private double totalPrice;

    public Ticket(String movieTitle, Showtime showtime, int numSeats, double totalPrice) {
        this.movieTitle = movieTitle;
        this.showtime = showtime;
        this.numSeats = numSeats;
        this.totalPrice = totalPrice;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public Showtime getShowtime() {
        return showtime;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
