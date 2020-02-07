package local.study;

import local.study.builder.Product;
import local.study.builder.ProductBuilder;
import local.study.singleton.Singleton;

public class MainGenerative {

    public static void main(String[] args) {

        ProductBuilder productBuilder = new ProductBuilder();
        Product product1 = productBuilder
                .name("apple")
                .model("red")
                .weight(0.3)
                .guaranteePeriod(2)
                .build();

        System.out.println(product1.toString());

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1.getVERSION());
        System.out.println(singleton2.getVERSION());

    }
}
