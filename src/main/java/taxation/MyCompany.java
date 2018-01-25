package taxation;

import java.util.ArrayList;
import java.util.List;

public class MyCompany {
  public static void calculateTaxes(Taxable t) {}

  public static void calculateTaxes(List<? extends Taxable> lt) {
//    lt.add(new Corporation(){});
    for (Taxable t : lt) {
      calculateTaxes(t);
    }
  }

  public static void calculateTaxes(Taxable[] ta) {
    for (Taxable t : ta) {
      calculateTaxes(t);
    }
  }

  public static void collectClients(List<? super Individual> lt) {
    lt.add(new Individual() {});
//    for (Individual t : lt) {
//      System.out.println(t);
//    }
  }

  public static void main(String[] args) {
    List<Taxable> ls = new ArrayList<>();

    calculateTaxes(ls);

    List<Individual> li = new ArrayList<>();

    collectClients(li);
    calculateTaxes(li);

    Individual[] ia = {};
    calculateTaxes(ia);
  }
}
