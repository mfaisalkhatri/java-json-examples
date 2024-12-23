package io.github.mfaisalkhatri;

import static org.hamcrest.Matchers.equalTo;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import io.github.mfaisalkhatri.pojo.CustomerDetails;
import org.hamcrest.MatcherAssert;

public class ReadCustomerDetails {

    public static void main (String[] args) {

        Gson gson = new Gson ();
        try (
            Reader reader = new FileReader (
                System.getProperty ("user.dir") + "/src/test/resources/customerdetails.json")) {

            Type listCustomerDetailsType = new TypeToken<List<CustomerDetails>> () {
            }.getType ();
            List<CustomerDetails> customerDetailsList = gson.fromJson (reader, listCustomerDetailsType);

            System.out.println ("Printing all the customer details from the file: " + customerDetailsList);
            System.out.println (
                "Printing the customer details from the third Json Object from file: " + customerDetailsList.get (2));
            System.out.println (
                "Printing the name of the customer from second Json Object: " + customerDetailsList.get (1)
                    .getName ());
            System.out.println (
                "Printing the email of the customer from third Json Object: " + customerDetailsList.get (2)
                    .getEmail ());
            System.out.println (
                "Printing the Coupon details of customer from the third Json object: " + customerDetailsList.get (2)
                    .isCoupon ());
            MatcherAssert.assertThat (customerDetailsList.get (3)
                .getCountry (), equalTo ("Spain"));

        } catch (IOException e) {
            throw new Error ("Error reading JSON file");
        }

    }
}
