package ProductList;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.lang.*;

public class Productmain {
    public static List<Product> sortedAccordingtoPrice(List<Product> productList){
        return productList.stream().
        sorted((p1,p2)->Double.compare(p1.price, p2.price)).collect(Collectors.toList());
    }

    public static List<Product> sortAccordingToName(List<Product> productList){
        return productList.stream().sorted((p1,p2)->p1.name.compareTo(p2.name)).collect(Collectors.toList());
    }
    public static void main(String[] args) {
         List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000.56));  
        productsList.add(new Product(2,"Dell Laptop",30000.44));  
        productsList.add(new Product(3,"Lenevo Laptop",28000.00));  
        productsList.add(new Product(4,"Sony Laptop",28000.77));  
        productsList.add(new Product(5,"Apple Laptop",90000.08)); 

        System.out.println("**********By Price**********");
        sortedAccordingtoPrice(productsList).stream().forEach(p->System.out.println(
            "Id: "+ p.id + " name : " + p.name + " price: " + p.price ));

            System.out.println("**********By Name**********");

            sortAccordingToName(productsList).stream().forEach(p->System.out.println( 
                "Id: "+ p.id + " name : " + p.name + " price: " + p.price ));

    }
}
