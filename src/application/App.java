package application;

import java.time.LocalDate;

import model.entities.Department;
import model.entities.Seller;

public class App {
    public static void main(String[] args) {

        Department obj = new Department(1, "Books");
        Seller seller = new Seller(21, "Bob", "bob@gmail.com", LocalDate.now(), 3000.0, obj);
        System.out.println(seller);
    }
}
