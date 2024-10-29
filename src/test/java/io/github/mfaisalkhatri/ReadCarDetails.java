package io.github.mfaisalkhatri;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;
import io.github.mfaisalkhatri.pojo.CarDetails;

public class ReadCarDetails {

    public static void main (String[] args) {
        Gson gson = new Gson ();
        try (Reader reader = new FileReader (System.getProperty ("user.dir") + "/src/test/resources/cardetails.json")) {
            CarDetails carDetails = gson.fromJson (reader, CarDetails.class);
            System.out.println (carDetails);

        } catch (IOException e) {
            throw new Error("Error reading JSON file");
        }

    }
}
