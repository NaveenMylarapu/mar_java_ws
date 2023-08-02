package com.flipkart.learn.day14.playerstats;

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
            List<com.flipkart.learn.day20.Employee> list = loadfromFile();
            List<String> fList = getFullNames(list);
            System.out.println(fList);
        }

        private static  List<String>   getFullNames(List<com.flipkart.learn.day20.Employee> employeelist){
            List<String> fullNameList = new ArrayList<>();
            for(com.flipkart.learn.day20.Employee emp:employeelist){
                String fName = emp.getFirstName()+ " "+emp.getLastName();
                fullNameList.add(fName);
            }
            return fullNameList;

        }
        private static List<com.flipkart.learn.day20.Employee> loadfromFile() {

            List<com.flipkart.learn.day20.Employee> empList = new ArrayList<>();
            try {
                URL url = com.flipkart.learn.dayApril13.EmployeeManager.class.getResource("/employee.csv");
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

        private static com.flipkart.learn.day20.Employee convertRowToEmp(String[] arr) {
            Long id = Long.parseLong(arr[0]);
            String firstName = arr[1];
            String lastName = arr[2];
            String email = arr[3];
            String gender =arr[4];
            double salary = Double.parseDouble(arr[5]);
            return new Employee(id, firstName, lastName, email, gender, salary);
        }

    }

