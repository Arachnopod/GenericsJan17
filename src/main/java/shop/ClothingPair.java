package shop;

//  This declares a second type variable,    vvvvvv called String, which
// is basically an Object!!!!
//public class ClothingPair<E extends Sized, String> extends Pair<E> {
// If you have a class constraint, it must be first mentioned
public class ClothingPair<E extends Sized & Colored> extends Pair<E> {
//  private java.lang.String y;
//  private String x;
//  {
//    x.concat("y");
//  }
  public ClothingPair(E left, E right) {
    super(left, right);
  }

  public boolean isMatched() {
    return getLeft().getSize() == getRight().getSize()
        && getLeft().getColor().equals(getRight().getColor());
  }

}
