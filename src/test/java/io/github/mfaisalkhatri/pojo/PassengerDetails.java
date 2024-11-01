package io.github.mfaisalkhatri.pojo;


import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PassengerDetails {

    private int                 id;
    private String              name;
    private boolean             activeTraveller;
    private String              origin;
    private String              destination;
    private TicketDetails ticketdetails;
}