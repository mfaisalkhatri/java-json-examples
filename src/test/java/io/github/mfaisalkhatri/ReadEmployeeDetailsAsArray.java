package io.github.mfaisalkhatri;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;
import io.github.mfaisalkhatri.pojo.EmployeeDetailsAsArray;

public class ReadEmployeeDetailsAsArray {

    public static void main (String[] args) {

        Gson gson = new Gson ();
        try (
            Reader reader = new FileReader (
                System.getProperty ("user.dir") + "/src/test/resources/employeedetails.json")) {

            EmployeeDetailsAsArray employeeDetails = gson.fromJson (reader, EmployeeDetailsAsArray.class);
            System.out.println ("Printing all the Employee Details: " + employeeDetails);
            System.out.println (
                "Printing the total number of JSON objects in the file: " + employeeDetails.getEmployees ().length);
            System.out.println (
                "Printing the Employee Name from the second Json object: " + employeeDetails.getEmployees ()[1].getName ());

        } catch (IOException e) {
            throw new Error ("Error reading JSON file");
        }

    }
}
