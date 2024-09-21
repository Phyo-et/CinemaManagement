package com.cinema.Test;

import com.cinema.dao.CustomerDao;
import com.cinema.model.Customer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;

public class CinemaTest {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static CustomerDao customerDao = new CustomerDao();

    public static void customerAction() {

        System.out.println("1: Find Customer by ID");
        System.out.println("2: Get All Customers");
        System.out.println("3: Create a New Customer");
        System.out.println("4: Delete a Customer");
        System.out.println("5: Exit");
        System.out.println("Chose an option : ");
    }

    public static void main(String[] args) throws SQLException, IOException {

        boolean exit = true;
        do {
            customerAction();
            int choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                    findCustomer();
                    break;
                case 2:
                    getAllCustomer();
                    break;
                case 3:
                    registerCustomer();
                    break;
                case 4:
                    destoryCustomer();
                    break;
                case 5:
                    exit = false;
                    System.out.println("Exiting the application");
                    break;
            }
        } while (exit);
    }

//        System.out.println("==========Find by ==========");
//        System.out.println(" ");
//        CustomerDao customerDao = new CustomerDao();
//        Customer customer = customerDao.findbyId(1);
//        System.out.println(customer);
//        System.out.println(" ");
//
//        System.out.println("==========Get All ==========");
//        System.out.println(" ");
//        List<Customer> customers = customerDao.getAll();
//        for (Customer c : customers){
//        System.out.println(c);
//        }
//
//
//        System.out.println();
//        Customer newCustomer =new Customer();
//        newCustomer.setName("U KYI");
//        customerDao.create(newCustomer);
//        System.out.println("==========Create ==========");
//        customers = customerDao.getAll();
//        for (Customer c : customers){
//            System.out.println(c);
//        }
//
//        Customer delCustomer = new Customer();
//        delCustomer.setId(1);
//        customerDao.delete(delCustomer);

    public static void findCustomer() throws NumberFormatException, IOException, SQLException {
        System.out.println("Enter Customer Id : ");
        int id = Integer.parseInt(br.readLine());
        Customer customer = customerDao.findbyId(id);
        System.out.println(customer);
    }

    public static void registerCustomer() throws IOException, SQLException {
        System.out.println("Enter the Customer Name : ");
        String name = br.readLine();
        Customer customer = new Customer();
        customer.setName(name);
        customerDao.create(customer);

    }

    public static void getAllCustomer() throws SQLException {
        System.out.println("All Customers");
        List<Customer> customers = customerDao.getAll();
        for (Customer c : customers) {
            System.out.println(c);
        }

    }

    public static void destoryCustomer() throws IOException, SQLException {
        System.out.println("Enter the customerId : ");
        int id = Integer.parseInt(br.readLine());
        Customer customer = new Customer();
        customer.setId(id);
        customerDao.delete(customer);
    }

}
//movie and payment