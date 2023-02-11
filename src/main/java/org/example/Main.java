package org.example;

import org.example.model.Person;
import org.example.model.Product;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person(1,"Ramiro", LocalDate.of(1991,1,21));
        Person p2 = new Person(2,"Emily", LocalDate.of(2005,2,23));
        Person p3 = new Person(3,"Carolina", LocalDate.of(1995,5,21));
        Person p4 = new Person(4,"Aghata", LocalDate.of(2010,10,29));
        Person p5 = new Person(5,"Dayan", LocalDate.of(1995,12,21));

        Product pr1 = new Product(1,"Pescado",15.0);
        Product pr2 = new Product(2,"Carne de cerdo",20.9);
        Product pr3 = new Product(3,"Fideo",9.3);
        Product pr4 = new Product(14,"Naranja",3.8);

        List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5);
        List<Product> products = Arrays.asList(pr1,pr2,pr3,pr4);


    }
}