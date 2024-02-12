package Online_Movie_Booking_System;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String email;
    private List<Ticket> tickets;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        tickets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }
}
