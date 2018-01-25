package shop;

import java.time.LocalDate;

public class Shop {
  public static void main(String[] args) {
    Pair<String> p = new Pair<>("Jones", "Fred");
    System.out.println("> " + p);

//    new ClothingPair<String>("Badly", "Broken");

    ClothingPair<Shoe> ps =
        new ClothingPair<>(new Shoe(44, "Red"), new Shoe( 42, "Red"));

    System.out.println("pair of shoes matched??? " + ps.isMatched());
  }
}
