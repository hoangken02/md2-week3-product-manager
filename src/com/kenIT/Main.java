package com.kenIT;

public class Main {

    public static void main(String[] args) {
ProductManager productManager = new ProductManager();

productManager.addProduct();
//productManager.showProduct();
//
//productManager.updateProductById(1);
//productManager.showProduct();
productManager.searchProductByName("22");
    }
}
