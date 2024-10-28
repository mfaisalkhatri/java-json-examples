package io.github.mfaisalkhatri;

import static org.hamcrest.Matchers.equalTo;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import com.google.gson.Gson;

import io.github.mfaisalkhatri.pojo.EmployeeDetails;
import org.hamcrest.MatcherAssert;

public class ReadJsonArrayAsList {

    public static void main (String[] args) {

        Gson gson = new Gson ();
        try (
            Reader reader = new FileReader (
                System.getProperty ("user.dir") + "/src/test/resources/employeedetails.json")) {

            EmployeeDetails employeeDetails= gson.fromJson (reader,EmployeeDetails.class);
            System.out.println ("Printing all the Employee Details: " +employeeDetails);
            System.out.println ("Printing the Employee Name from the first Json object: " + employeeDetails.getEmployees ().get (0).getName ());
            System.out.println ("Printing the Employee Designation from the second Json Object: " + employeeDetails.getEmployees ().get (1).getDesignation ());

            MatcherAssert.assertThat (employeeDetails.getEmployees ().get (2).getEmail (), equalTo ("elizb@gmail.com"));

        } catch (IOException e) {
            throw new Error ("Error reading JSON file");
        }

    }
}
