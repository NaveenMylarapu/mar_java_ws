 package com.flipkart.learn.dayApril13;

import com.flipkart.learn.day20.Employee;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    public static void main(String[] args) {
        List<Employee> list = loadfromFile();
        List<String> fList = getFullNames(list);
        System.out.println(fList);
        }

private static  List<String>   getFullNames(List<Employee> employeelist){
         List<String> fullNameList = new ArrayList<>();
         for(Employee emp:employeelist){
             String fName = emp.getFirstName()+ " "+emp.getLastName();
           fullNameList.add(fName);
         }
         return fullNameList;

}
    private static List<Employee> loadfromFile() {

            List<Employee> empList = new ArrayList<>();
            try {
                URL url = EmployeeManager.class.getResource("/employee.csv");
                List<String> list = Files.readAllLines(Paths.get(url.toURI()));
                for (int i = 1; i < list.size(); i++) {
                    String data = list.get(i);
                    String arr[]=data.split(",");
                    com.flipkart.learn.day20.Employee emp = convertRowToEmp(arr);
                           empList.add(emp);
                }
            }catch(IOException | URISyntaxException e){
                e.printStackTrace();
                System.out.println(e);
            }
            return empList;
        }

    private static Employee convertRowToEmp(String[] arr) {
        Long id = Long.parseLong(arr[0]);
        String firstName = arr[1];
        String lastName = arr[2];
        String email = arr[3];
        String gender =arr[4];
        double salary = Double.parseDouble(arr[5]);
        return new Employee(id, firstName, lastName, email, gender, salary);
    }

        }




