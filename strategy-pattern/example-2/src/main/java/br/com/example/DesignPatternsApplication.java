package br.com.example;

import br.com.example.controller.CreditCardAlgorithm;
import br.com.example.controller.PaypalAlgorithm;
import br.com.example.controller.ShoppingCart;
import br.com.example.model.Product;

public class DesignPatternsApplication {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Product pants = new Product("234", 25);
        Product shirt = new Product("987", 15);

        cart.addProduct(pants);
        cart.addProduct(shirt);

        //payment decisions
        cart.pay(new PaypalAlgorithm("new@email.com", "nowayman"));
        cart.pay(new CreditCardAlgorithm("Glaucia", "238756464"));
    }
}
