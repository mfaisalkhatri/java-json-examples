package io.github.mfaisalkhatri;

import static org.hamcrest.Matchers.equalTo;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;
import io.github.mfaisalkhatri.pojo.EmployeeDetailsAsArray;

public class ReadJsonArrayAsArray {

    public static void main (String[] args) {

        Gson gson = new Gson ();
        try (
            Reader reader = new FileReader (
                System.getProperty ("user.dir") + "/src/test/resources/employeedetails.json")) {

            EmployeeDetailsAsArray employeeDetails = gson.fromJson (reader, EmployeeDetailsAsArray.class);
            System.out.println ("Printing all the Employee Details: " + employeeDetails);
            System.out.println (
                "Printing the Employee Name from the first Json object: " + employeeDetails.getEmployees ().length);
            System.out.println (employeeDetails.getEmployees ()[1].getName ());

        } catch (IOException e) {
            throw new Error ("Error reading JSON file");
        }

    }
}
