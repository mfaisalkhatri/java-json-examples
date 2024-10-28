package io.github.mfaisalkhatri.pojo;

import java.util.List;

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