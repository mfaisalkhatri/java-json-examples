package io.github.mfaisalkhatri;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;
import io.github.mfaisalkhatri.records.CarDetailRecord;

public class CardDetailsRecordReading {

    public static void main (String[] args) {
        Gson gson = new Gson ();
        try (Reader reader = new FileReader (System.getProperty ("user.dir") + "/src/test/resources/cardetails.json")) {
            CarDetailRecord carDetailsRecord = gson.fromJson (reader, CarDetailRecord.class);
            System.out.println (carDetailsRecord);

        } catch (IOException e) {
            throw new Error ("Error reading JSON file");
        }

    }
}
