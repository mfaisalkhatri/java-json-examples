package io.github.mfaisalkhatri;

import static org.hamcrest.Matchers.equalTo;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;
import io.github.mfaisalkhatri.pojo.PassengerData;
import org.hamcrest.MatcherAssert;

public class ReadPassengerData {

    public static void main (String[] args) {
        Gson gson = new Gson ();
        try (
            Reader reader = new FileReader (
                System.getProperty ("user.dir") + "/src/test/resources/passengerdata.json")) {

            PassengerData passengerData = gson.fromJson (reader, PassengerData.class);
            System.out.println ("Printing all the Passenger Data: " + passengerData);
            System.out.println (
                "Printing the Passenger Name from the first Json object: " + passengerData.getPassengerdetails ()
                    .get (0)
                    .getName ());
            System.out.println (
                "Printing the Ticket Details of the first Json object: " + passengerData.getPassengerdetails ()
                    .get (0)
                    .getTicketdetails ());

            MatcherAssert.assertThat (passengerData.getPassengerdetails ()
                .get (1)
                .getDestination (), equalTo ("Dubai"));

        } catch (IOException e) {
            throw new Error ("Error reading JSON file");
        }

    }
}
