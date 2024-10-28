package io.github.mfaisalkhatri.pojo;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class TicketDetails {

    private String airlines;
    private String pnr;
    private String date;
    private int    ticketamt;
}