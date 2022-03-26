package com.kenIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    List<Product> productList = new ArrayList<>();

    public void addProduct() {
        Product product;

        System.out.println("Input id of product: ");
        int id = scanner.nextInt();

        System.out.println("Input name of product: ");
        String name = scanner.next();

        System.out.println("Input price of product: ");
        int price = scanner.nextInt();


        product = new Product(id, name, price);
        productList.add(product);
    }

    public void showProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void removeProductById(int id) {
        Product product = null;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                product = productList.get(i);
            }
        }

        if (product != null) {
            productList.remove(product);
            System.out.println("Delete success id:" + id);
        } else {
            System.out.println("Don't find this id: " + id);
        }
    }

    public void updateProductById(int id){
        Product product = null;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                product = productList.get(i);
            }
        }

        if (product != null){
            productList.remove(product);
            System.out.println("Input new name product: ");
            String name = scanner.next();

            System.out.println("Input new price product: ");
            int price = scanner.nextInt();

            product = new Product(id,name,price);
            productList.add(product);
            System.out.println("Update success product");
        }else {
            System.out.println("Don't find this product");
        }
    }

    public void searchProductByName(String name){
        for(int i = 0;i < productList.size();i ++){
            if (productList.get(i).getName().contains(name)){
                System.out.println(productList.get(i).toString());
            }else {
                System.out.println("Don't find this product");
            }
        }
    }

    public void sortProduct(){
        Collections.sort(productList,new PriceInProductComparator());
    }
}

