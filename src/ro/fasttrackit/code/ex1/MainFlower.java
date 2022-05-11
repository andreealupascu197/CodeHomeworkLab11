package ro.fasttrackit.code.ex1;

import java.util.HashSet;

public class MainFlower {
    public static void main(String[] args) {
        Bouquet firstBouquet = new Bouquet(new HashSet<>());
        firstBouquet.addFlower("lalea");
        firstBouquet.addFlower("zambila");
        firstBouquet.addFlower("tradafir");
        firstBouquet.addFlower("lalea");
        firstBouquet.addFlower("frezie");
        firstBouquet.addFlower("bujor");
        System.out.println(firstBouquet);
        firstBouquet.removeflower("bujor");
        System.out.println(firstBouquet);
        System.out.println(firstBouquet.getAll());
    }
}
